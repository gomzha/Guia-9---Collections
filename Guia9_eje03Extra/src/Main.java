//Tercera SEGUROS


import Entidad.Cliente;
import Entidad.Poliza;
import Entidad.Rodado;
import Servicio.ClienteServicio;
import Servicio.PolizaServicio;
import Servicio.RodadoServicio;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ParseException {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion = 0;
        System.out.println("Bienvenidos a LA TERCERA SEGUROS.");


        PolizaServicio polizaServicio = new PolizaServicio();
        ArrayList<Cliente> clienteArrayList = new ArrayList<Cliente>();
        ArrayList<Rodado> rodadoArrayList = new ArrayList<Rodado>();
        ArrayList<Poliza> polizaArrayList = new ArrayList<Poliza>();


        do {
            try {
            System.out.println("Ingrese la opción que desea realizar: ");
            System.out.println("-1.Agregar Cliente ");
            System.out.println("-2.Consultar Clientes ");
            System.out.println("-3.Agregar rodado ");
            System.out.println("-4.Consultar rodados ");
            System.out.println("-5.Agregar poliza ");
            System.out.println("-6.Modificar cuota ");
            System.out.println("-7.Consultar polizas ");
            System.out.println("-8.Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    clienteArrayList.add(new ClienteServicio().crearCliente());
                    break;

                case 2:
                    if (clienteArrayList.isEmpty()) {
                        System.out.println("No existen clientes, por favor, primero debe crear al menos 1 cliente para poder consultar");
                    } else {
                        ClienteServicio.muestroClientes(clienteArrayList);
                    }
                    break;

                case 3:
                    rodadoArrayList.add(new RodadoServicio().crearRodado());
                    break;

                case 4:
                    if (rodadoArrayList.isEmpty()) {
                        System.out.println("No existen rodados, por favor, primero debe crear al menos 1 rodado para poder consultar");
                    } else {
                        RodadoServicio.muestroRodados(rodadoArrayList);
                    }
                    break;

                case 5:
                    if (rodadoArrayList.isEmpty() || clienteArrayList.isEmpty()) {
                        if (rodadoArrayList.isEmpty()) {
                            System.out.println("No existen rodados, por favor, primero debe crear al menos 1 rodado para poder consultar una póliza");
                        } else {
                            System.out.println("No existen clientes, por favor, primero debe crear al menos 1 cliente para poder generar una póliza");
                        }
                    } else {
                        polizaArrayList.add(new PolizaServicio().crearPoliza(clienteArrayList, rodadoArrayList));
                    }
                    break;
                case 6:
                    if (polizaArrayList.isEmpty()) {
                        System.out.println("No existen pólizas, por favor, primero debe crear al menos 1 póliza para poder consultar");
                    } else {
                        polizaArrayList =  polizaServicio.modificarCuotaPoliza(polizaArrayList);
                    }
                    break;

                case 7:
                    if (polizaArrayList.isEmpty()) {
                        System.out.println("No existen pólizas, por favor, primero debe crear al menos 1 póliza para poder consultar");
                    } else {
                        for (Poliza poliza : polizaArrayList) {
                            System.out.println(poliza.toString());
                        }
                    }
                    break;


            }
            }catch (Exception e) {
                System.out.println("Error en el ingreso de opción!");
            }
            if(opcion < 1 || opcion >8){
                System.out.println("Error en el ingreso de opción!");
                opcion = 0;
            }
        } while (opcion >= 0 && opcion < 8);

    }
}