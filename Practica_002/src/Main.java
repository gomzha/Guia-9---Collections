//Realiza un programa en donde exista una clase Jugador que contenga nombre, apellido, posición
//        y número. Luego otra clase Equipo que contenga una colección de jugadores. Una vez hecho
 //       esto, desde el main recorreremos el equipo mostrando la información de cada jugador.


import Entidad.Equipo;
import Entidad.Jugador;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        ArrayList<Jugador> jugadorArrayList = new ArrayList<>();
        jugadorArrayList.add(new Jugador("GONZALO","SANCHEZ", "DELANTERO",32));
        jugadorArrayList.add(new Jugador("GONZALO2","SANCHEZ", "DELANTERO",33));
        jugadorArrayList.add(new Jugador("GONZALO3","SANCHEZ", "DELANTERO",42));
        jugadorArrayList.add(new Jugador("GONZALO4","SANCHEZ", "DELANTERO",52));

        Equipo equipo = new Equipo(jugadorArrayList);
        System.out.println(equipo.toString());
    }
}