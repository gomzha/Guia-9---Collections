//Realiza un programa en donde una clase Persona tenga como atributo nombre, apellido y un
//        objeto de clase Dni. La clase Dni tendrá como atributos la serie (carácter) y número. Prueba
//        acceder luego a los atributos del dni de la persona creando objetos y jugando desde el main.


import Entidad.DNI;
import Entidad.Persona;

public class Main {
    public static void main(String[] args) {


        DNI dni = new DNI();
        dni.setNum(35267708);
        dni.setSerie('A');
        Persona per = new Persona();
        per.setApe("Sanchez");
        per.setNom("GOnza");
        per.setDni(dni);
        System.out.println(per.toString());
    }
}