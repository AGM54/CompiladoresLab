import org.antlr.v4.runtime.tree.TerminalNode;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.*;

public class ConfRoomSchedulerSemanticChecker extends ConfRoomSchedulerBaseListener {

    private final Map<String, List<Reservation>> reservations = new HashMap<>();
    private static final Duration MAX_RESERVATION_DURATION = Duration.ofHours(2);

    @Override
    public void enterReserveStat(ConfRoomSchedulerParser.ReserveStatContext ctx) {
        String id = ctx.reserve().ID().getText();
        String date = ctx.reserve().DATE().getText();
        String startTime = ctx.reserve().TIME(0).getText();
        String endTime = ctx.reserve().TIME(1).getText();
        String description = ctx.reserve().DESCRIPTION() != null ? ctx.reserve().DESCRIPTION().getText() : "";

        // Validar que la fecha es válida
        if (!isValidDate(date)) {
            System.out.println("Error: Fecha inválida " + date);
            return;
        }

        // Validar que la hora de inicio y fin son válidas
        if (!isValidTime(startTime) || !isValidTime(endTime)) {
            System.out.println("Error: Hora inválida " + startTime + " o " + endTime);
            return;
        }

        LocalTime start = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime end = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("HH:mm"));
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        if (!start.isBefore(end)) {
            System.out.println("Error: La hora de inicio debe ser anterior a la hora de fin para " + id + " en " + date);
            return;
        }

        // Validar que la duración de la reserva no exceda el límite máximo
        Duration reservationDuration = Duration.between(start, end);
        if (reservationDuration.compareTo(MAX_RESERVATION_DURATION) > 0) {
            System.out.println("Error: La duración de la reserva para " + id + " en " + date + " excede el límite máximo de " + MAX_RESERVATION_DURATION.toHours() + " horas");
            return;
        }

        Reservation newReservation = new Reservation(localDate, start, end, description);

        // Verificar solapamientos
        if (!reservations.containsKey(id)) {
            reservations.put(id, new ArrayList<>());
        }
        for (Reservation existingReservation : reservations.get(id)) {
            if (existingReservation.overlapsWith(newReservation)) {
                System.out.println("Error: Reserva solapada para " + id + " en " + date + " de " + startTime + " a " + endTime);
                return;
            }
        }

        // Añadir la reserva
        reservations.get(id).add(newReservation);
        System.out.println("Reserva exitosa: " + id + " para " + date + " de " + startTime + " a " + endTime + " " + description);
    }

    @Override
    public void enterCancelStat(ConfRoomSchedulerParser.CancelStatContext ctx) {
        String id = ctx.cancel().ID().getText();
        String date = ctx.cancel().DATE().getText();
        String startTime = ctx.cancel().TIME(0).getText();
        String endTime = ctx.cancel().TIME(1).getText();

        // Validar que la fecha es válida
        if (!isValidDate(date)) {
            System.out.println("Error: Fecha inválida " + date);
            return;
        }

        // Validar que la hora de inicio y fin son válidas
        if (!isValidTime(startTime) || !isValidTime(endTime)) {
            System.out.println("Error: Hora inválida " + startTime + " o " + endTime);
            return;
        }

        LocalTime start = LocalTime.parse(startTime, DateTimeFormatter.ofPattern("HH:mm"));
        LocalTime end = LocalTime.parse(endTime, DateTimeFormatter.ofPattern("HH:mm"));
        LocalDate localDate = LocalDate.parse(date, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        Reservation reservationToCancel = new Reservation(localDate, start, end, "");

        if (reservations.containsKey(id) && reservations.get(id).remove(reservationToCancel)) {
            System.out.println("Cancelación exitosa: " + id + " para " + date + " de " + startTime + " a " + endTime);
        } else {
            System.out.println("Error: No existe una reserva para cancelar en esa fecha y hora.");
        }
    }

    @Override
    public void enterListarStat(ConfRoomSchedulerParser.ListarStatContext ctx) {
        System.out.println("Lista de reservas:");
        reservations.forEach((id, resList) -> {
            System.out.println("Sala " + id + ":");
            resList.forEach(res -> System.out.println("  Fecha: " + res.date + " de " + res.start + " a " + res.end + " " + res.description));
        });
    }

    private boolean isValidDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate.parse(date, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private boolean isValidTime(String time) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        try {
            LocalTime.parse(time, formatter);
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
    }

    private static class Reservation {
        private final LocalDate date;
        private final LocalTime start;
        private final LocalTime end;
        private final String description;

        public Reservation(LocalDate date, LocalTime start, LocalTime end, String description) {
            this.date = date;
            this.start = start;
            this.end = end;
            this.description = description;
        }

        public boolean overlapsWith(Reservation other) {
            return this.date.equals(other.date) && !(this.end.isBefore(other.start) || this.start.isAfter(other.end));
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Reservation that = (Reservation) o;
            return date.equals(that.date) && start.equals(that.start) && end.equals(that.end);
        }

        @Override
        public int hashCode() {
            return Objects.hash(date, start, end);
        }
    }
}
