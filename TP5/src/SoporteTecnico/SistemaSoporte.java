package SoporteTecnico;

import java.util.ArrayList;
import java.util.List;

public class SistemaSoporte {
    private List<TicketSoporte> tickets = new ArrayList<>();

    public void agregarTicket(TicketSoporte ticket) {
        tickets.add(ticket);
    }

    public void listarTickets() {
        for (TicketSoporte t : tickets) {
            System.out.println(t.mostrarDetalle());
        }
    }

}
