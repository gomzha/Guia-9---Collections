package Servicio;

import Entidad.Cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class ClienteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public static void muestroClientes(ArrayList<Cliente> clienteArrayList) {
        int pos= 1;
        for (Cliente cliente : clienteArrayList) {
            System.out.println(pos + "- " + cliente.toString());
            pos++;
        }
    }

    public Cliente crearCliente(){
        Cliente cliente = new Cliente();

        System.out.println("Ingrese nombre y apellido del cliente");
        cliente.setNombreApe(leer.next());
        System.out.println("Ingrese el documento: ");
        cliente.setDoc(leer.next());
        System.out.println("Ingrese el domicilio: ");
        cliente.setDomic(leer.next());
        System.out.println("Ingrese el mail: ");
        cliente.setMail(leer.next());
        System.out.println("Ingrese el teléfono: ");
        cliente.setTelefono(leer.next());

        return cliente;

    }
}
