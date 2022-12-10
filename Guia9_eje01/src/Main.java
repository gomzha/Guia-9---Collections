//Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
//        clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
//        atributos: nombre, apellido, edad, documento y Perro.
//        Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
//        pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
//        la clase Persona, la información del Perro y de la Persona.


import Entidad.Perro;
import Entidad.Persona;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        Persona persona = new Persona();
        Perro perro = new Perro();
        ArrayList<Persona> personaArrayList = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            System.out.println("_____________________________________________________________");
            System.out.println("DATOS DE LA PERSONA NUM: " + (i + 1));
            System.out.println("-------------------------------------------------------------");

            System.out.println("Ingrese el nombre del perro: ");
            perro.setNom(leer.next());
            System.out.println("Ingrese la raza del perro: ");
            perro.setRaza(leer.next());
            System.out.println("Ingrese la edad del perro ");
            perro.setEdad(leer.nextInt());
            System.out.println("Ingrese el tam del perro ");
            perro.setTam(leer.next());

            System.out.println("Ingrese el apellido de la persona ");
            persona.setApe(leer.next());
            System.out.println("Ingrese el nombre de la persona ");
            persona.setNom(leer.next());
            System.out.println("Ingrese el doc de la persona ");
            persona.setDoc(leer.nextInt());
            System.out.println("Ingrese la edad de la persona ");
            persona.setEdad(leer.nextInt());
            persona.setPerro(perro);
            personaArrayList.add(persona);

            perro = new Perro();
            persona = new Persona();

        }

        System.out.println("Se muestran los datos: ");

        for (Persona per: personaArrayList){
            System.out.println(per.toString());

        }


    }

}
