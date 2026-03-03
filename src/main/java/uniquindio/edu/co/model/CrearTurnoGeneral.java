package uniquindio.edu.co.model;

public class CrearTurnoGeneral extends TurnoFactory {
    @Override
    public Turno crearTurno(){
        return new CrearTurno();
    }
}
