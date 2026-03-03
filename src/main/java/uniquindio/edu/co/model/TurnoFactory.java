package uniquindio.edu.co.model;

public abstract class TurnoFactory {
    public void asignarTurno(){
        Turno turno = crearTurno();
        turno.asignar();
        turno.mostrarInformacion();
    }
    public abstract Turno crearTurno();

}
