package Servicio;

import Entidad.Jugador;
import Entidad.Revolver;

import java.util.ArrayList;
import java.util.Scanner;

public class Juego {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Jugador> jugadorArrayList;
    private Revolver revolver;

    public Juego() {
        llenarJuego(jugadorArrayList, revolver);

    }

    private void llenarJuego(ArrayList<Jugador> jugadorArrayList, Revolver revolver) {
        this.jugadorArrayList = new ArrayList<>();
        this.revolver = new Revolver();
        int cantJug;
        String nombre;
        System.out.println("Cuantos jugadores desea jugar, si coloca mayor a 6, por defecto será 6:");

        cantJug = leer.nextInt();
        if (cantJug > 6 || cantJug < 1) {
            cantJug = 6;

        }
        System.out.println("Cantidad de jugadores: " + cantJug);

        for (int i = 0; i < cantJug; i++) {
            System.out.println("Ingrese el nombre del jugador N°" + (i + 1) + ": ");
            nombre = leer.next();
            this.jugadorArrayList.add(new Jugador((i + 1), nombre));
        }

        ronda();

    }

    //private void ronda(ArrayList<Jugador> jugadorArrayList, Revolver revolver) {
        private void ronda() {

            int numJug = 0;
        int maxJug = jugadorArrayList.size();
        boolean seguirJugando = true;

        while (revolver.getPosAct() < 7 && seguirJugando) {
            if (jugadorArrayList.get(numJug).disparo(revolver)) {
                System.out.println("Jugador N°" + jugadorArrayList.get(numJug).getId() + " " + jugadorArrayList.get(numJug).getNombreJug() +  " | Se disparó el arma, has perdido");
                seguirJugando = false;
            } else {
                System.out.println("Jugador N°" + jugadorArrayList.get(numJug).getId() + " " + jugadorArrayList.get(numJug).getNombreJug() +  " | Sigue en carrera!");
            }

            if (numJug == (maxJug - 1))
                numJug = 0;
            else numJug++;
        }
        System.out.println("Pos de la bala: " + revolver.getPosAgua());
    }

}
