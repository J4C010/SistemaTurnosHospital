package uniquindio.edu.co.model;

public class TurnoUrgente implements Turno {

    @Override
    public void asignar (){
        System.out.println("Su turno urgente ha sido asignado");
    }
    @Override
    public void mostrarInformacion () {
        System.out.println("Información del turno");
    }
    @Override
    public Prioridad obtenerPrioridad() {
        return Prioridad.URGENTE;
    }

}
