package Servicio;


import Entidad.Rodado;

import java.util.ArrayList;
import java.util.Scanner;

public class RodadoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public static void muestroRodados(ArrayList<Rodado> rodadoArrayList) {
        int pos= 1;
        for (Rodado rodado : rodadoArrayList) {
            System.out.println(pos + "- " + rodado.toString());
            pos++;
        }
    }

    public Rodado crearRodado(){
        Rodado rodado = new Rodado();

        System.out.println("Ingrese marca");
        rodado.setMarca(leer.next());
        System.out.println("Ingrese el modelo: ");
        rodado.setModelo(leer.next());
        System.out.println("Ingrese el año: ");
        rodado.setAnio(leer.next());
        System.out.println("Ingrese el Número del motor: ");
        rodado.setNumMotor(leer.next());
        System.out.println("Ingrese el Número de chasis: ");
        rodado.setChasis(leer.next());
        System.out.println("Ingrese el color: ");
        rodado.setColor(leer.next());
        System.out.println("Ingrese el tipo: ");
        rodado.setTipo(leer.next());

        return rodado;

    }

}
