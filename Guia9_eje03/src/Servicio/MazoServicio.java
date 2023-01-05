package Servicio;


import Entidad.Carta;
import Entidad.Mazo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MazoServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Mazo barajar() {

        final String[] PALO = {"basto", "espada", "oro", "copa"};
        final int[] VALOR = {1, 2, 3, 4, 5, 6, 7, 10, 11, 12};

        System.out.println("Deck de Cartas para Iniciar:");
        ArrayList<Carta> cartaArrayList = new ArrayList<Carta>();
        for (int palo = 0; palo < 4; palo++) //Se usa PALO[0] y PALO[1]
            for (int valor = 0; valor < VALOR.length; valor++)
                cartaArrayList.add(new Carta(VALOR[valor], PALO[palo]));

        Collections.shuffle(cartaArrayList);

        Mazo mazo = new Mazo(cartaArrayList);

        return mazo;

    }

    public void cartasDisponibles(Mazo mazo) {

        System.out.println("La cantidad de cartas disponiles es: " + mazo.getCarta().size());


    }

    public void mostrarBaraja(Mazo mazo) {
        if (!mazo.getCarta().isEmpty()) {
            System.out.println("Las cartas disponibles son: ");
            for (Carta carta : mazo.getCarta()) {
                System.out.println("Carta: " + carta);
            }
        } else {
            System.out.println("No quedan mas cartas disponibles");
        }


    }

    public void cartasMonton(Mazo mazo) {
        if (mazo.getCartasUtilizadas().isEmpty()) {
            System.out.println("Aún no se tomó ninguna carta del mazo");
        } else {
            System.out.println("Las cartas que ya salieron son: ");
            for (Carta carta : mazo.getCartasUtilizadas()) {
                System.out.println("Carta: " + carta);

            }
        }
    }

    public Mazo siguienteCarta(Mazo mazo) {

        System.out.println("La siguiente carta es la: " + mazo.getCarta().get(0).getNumCarta() + " de " + mazo.getCarta().get(0).getPalo());
        mazo.setCartasUtilizadas(mazo.getCarta().get(0));
        mazo.eliminarCarta();
        return mazo;
    }

    public Mazo darCartas(Mazo mazo) {

        System.out.println("Ingrese la cantidad de cartas que desea sacar: ");
        int cantCartas = leer.nextInt();


        if (mazo.getCarta().size() >= cantCartas)
            for (int i = 0; i < cantCartas; i++) {
                System.out.println("La carta número " + (i + 1) + " que ha salido es: " + mazo.getCarta().get(0).getNumCarta() + " de " + mazo.getCarta().get(0).getPalo());
                mazo.setCartasUtilizadas(mazo.getCarta().get(0));
                mazo.eliminarCarta();
            }
        else System.out.println("No hay disponible esa cantidad de cartas a retirar");


        return mazo;

    }
}
