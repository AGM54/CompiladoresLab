import org.antlr.v4.runtime.tree.TerminalNode;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.HashMap;
import java.util.Map;

public class ConfRoomSchedulerSemanticChecker extends ConfRoomSchedulerBaseListener {

    private final Map<String, String> reservations = new HashMap<>();

    @Override
    public void enterReserveStat(ConfRoomSchedulerParser.ReserveStatContext ctx) {
        TerminalNode dateNode = ctx.reserve().DATE();
        if (dateNode == null) {
            System.out.println("Error: Formato de fecha inválido");
            return;
        }
        String date = dateNode.getText();
        String id = ctx.reserve().ID().getText();
        String startTime = ctx.reserve().TIME(0).getText();
        String endTime = ctx.reserve().TIME(1).getText();
        String key = date + " " + startTime + "-" + endTime;

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

        // Validar que la hora de inicio es anterior a la hora de fin
        if (!isStartTimeBeforeEndTime(startTime, endTime)) {
            System.out.println("Error: La hora de inicio debe ser anterior a la hora de fin para " + id + " en " + date);
            return;
        }

        if (reservations.containsKey(key)) {
            System.out.println("Error: La sala ya está reservada para esa fecha y hora.");
        } else {
            reservations.put(key, id);
            System.out.println("Reserva exitosa: " + id + " para " + key);
        }
    }

    @Override
    public void enterCancelStat(ConfRoomSchedulerParser.CancelStatContext ctx) {
        TerminalNode dateNode = ctx.cancel().DATE();
        if (dateNode == null) {
            System.out.println("Error: Formato de fecha inválido");
            return;
        }
        String date = dateNode.getText();
        String id = ctx.cancel().ID().getText();
        String startTime = ctx.cancel().TIME(0).getText();
        String endTime = ctx.cancel().TIME(1).getText();
        String key = date + " " + startTime + "-" + endTime;

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

        if (reservations.containsKey(key) && reservations.get(key).equals(id)) {
            reservations.remove(key);
            System.out.println("Cancelación exitosa: " + id + " para " + key);
        } else {
            System.out.println("Error: No existe una reserva para cancelar en esa fecha y hora.");
        }
    }

    private boolean isStartTimeBeforeEndTime(String startTime, String endTime) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime start = LocalTime.parse(startTime, formatter);
        LocalTime end = LocalTime.parse(endTime, formatter);
        return start.isBefore(end);
    }

    private boolean isValidDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        try {
            LocalDate parsedDate = LocalDate.parse(date, formatter);
            if (parsedDate.getDayOfMonth() != Integer.parseInt(date.substring(0, 2))) {
                return false;
            }
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
}
