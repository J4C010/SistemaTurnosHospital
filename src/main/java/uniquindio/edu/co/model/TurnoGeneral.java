package uniquindio.edu.co.model;

public class TurnoGeneral implements Turno{

    @Override
    public void asignar() {
        System.out.println("Su turno general ha sido asignado");
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("Información del turno");
    }

    @Override
    public Prioridad obtenerPrioridad() {
        return null;
    }
}
