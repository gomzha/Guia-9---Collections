package Servicio;

import Entidad.Cliente;
import Entidad.Cuota;
import Entidad.Poliza;
import Entidad.Rodado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class PolizaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    ClienteServicio clienteServicio = new ClienteServicio();
    RodadoServicio rodadoServicio = new RodadoServicio();
    CuotaServicio cuotaServicio = new CuotaServicio();




    public Poliza crearPoliza(ArrayList<Cliente> clienteArrayList, ArrayList<Rodado> rodadoArrayList) throws ParseException {
        Poliza poliza = new Poliza();

        Cuota cuota = cuotaServicio.crearCuota();
        rodadoServicio.muestroRodados(rodadoArrayList);
        System.out.println("Ingrese el número que desee agregar como rodado: ");
        int posRodado = leer.nextInt() - 1;
        clienteServicio.muestroClientes(clienteArrayList);
        System.out.println("Ingrese el número que desee agregar como cliente ");
        int posCliente = leer.nextInt() - 1;

        poliza.setCli(clienteArrayList.get(posCliente));
        poliza.setRodado(rodadoArrayList.get(posRodado));
        System.out.println("Ingrese número de póliza: ");
        poliza.setNumPoliza(leer.next());

        System.out.println("Ingrese la cantidad de cuotas: ");
        poliza.setCantCuotas(leer.nextInt());
        System.out.println("Ingrese el tipo de cobertura: ");
        poliza.setCoberturaTipo(leer.next());
        System.out.println("Ingrese la forma de pago: ");
        poliza.setFormPago(leer.next());

        System.out.println("Ingrese la fecha de inicio separado con 'yyy-MM-dd': ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //Para declarar valores en nuevos objetos date, usa el mismo formato date que usaste al crear las fechas
        poliza.setFechaIni(sdf.parse(leer.next()));
        System.out.println("Ingrese la fecha de fin separado con 'yyy-MM-dd': ");
        poliza.setFechaFin(sdf.parse(leer.next()));

        System.out.println("Desea tener cobertura de granizo S/N?");
        String granizo = leer.next();
        if (granizo.equals("S")) {
            poliza.setGranizo(true);
            System.out.println("Ingrese el monto asegurado por granizo: ");
            poliza.setMontoAseguradoGranizo(leer.nextInt());
        } else {
            poliza.setGranizo(false);
            poliza.setMontoAseguradoGranizo(0);
        }

        System.out.println("Ingrese el monto asegurado del auto");

        poliza.setMontoAsegurado(leer.nextInt());

        poliza.setCuota(cuota);

        return  poliza;

    }


    public ArrayList<Poliza> modificarCuotaPoliza(ArrayList<Poliza> polizaArrayList) throws ParseException {

        listarPoliza(polizaArrayList);
        System.out.println("Ingrese el número de poliza que desea modificar su cuota: ");
        int posPoliza = leer.nextInt() - 1;
        Cuota cuota = cuotaServicio.crearCuota();
        polizaArrayList.get(posPoliza).setCuota(cuota);

        return polizaArrayList;
    }

    private void listarPoliza(ArrayList<Poliza> polizaArrayList) {

        int pos= 1;
        for (Poliza poliza : polizaArrayList) {
            System.out.println(pos + "- " + poliza.toString());
            pos++;
        }

    }
}
