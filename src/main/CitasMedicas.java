package src.main;
import java.util.ArrayList;
import java.util.List;

// Clase para manejar las citas médicas
public class CitasMedicas {
    private List<String> calendario; // Calendario de citas

    public CitasMedicas() {
        calendario = new ArrayList<>();
    }

    // TODO: Método para agendar una cita
    public void agendarCita(String fechaHora) {
        agendarCita(fechaHora);
    }

    // TODO: Método para cancelar una cita
    public void cancelarCita(String fechaHora) {
        cancelarCita(fechaHora);
    }

    // TODO: Método para reprogramar una cita
    public void reprogramarCita(String fechaHoraAntigua, String fechaHoraNueva) {
        reprogramarCita(fechaHoraAntigua, fechaHoraNueva);
    }

    // TODO: Método para ver el calendario de citas
    public void verCalendario() {
        for (String fecha : calendario) {
            System.out.println(fecha);
        }
    }
}
