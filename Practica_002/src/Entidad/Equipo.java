package Entidad;

import java.util.ArrayList;

public class Equipo {

    private ArrayList<Jugador> jugador;

    public Equipo() {
    }

    public Equipo(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Jugador> getJugador() {
        return jugador;
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    @Override
    public String toString() {
        return "Equipo{" +
                "jugador=" + jugador +
                '}';
    }
}
