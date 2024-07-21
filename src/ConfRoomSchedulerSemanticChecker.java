import org.antlr.v4.runtime.tree.TerminalNode;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Map;

public class ConfRoomSchedulerSemanticChecker extends ConfRoomSchedulerBaseListener {

    private final Map<String, String> reservations = new HashMap<>();

    @Override
    public void enterReserveStat(ConfRoomSchedulerParser.ReserveStatContext ctx) {
        String id = ctx.reserve().ID().getText();
        String date = ctx.reserve().DATE().getText();
        String startTime = ctx.reserve().TIME(0).getText();
        String endTime = ctx.reserve().TIME(1).getText();
        String key = date + " " + startTime + "-" + endTime;

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
        String id = ctx.cancel().ID().getText();
        String date = ctx.cancel().DATE().getText();
        String startTime = ctx.cancel().TIME(0).getText();
        String endTime = ctx.cancel().TIME(1).getText();
        String key = date + " " + startTime + "-" + endTime;

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
}