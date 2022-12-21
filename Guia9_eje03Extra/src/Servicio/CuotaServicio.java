package Servicio;

import Entidad.Cliente;
import Entidad.Cuota;
import Entidad.Poliza;
import Entidad.Rodado;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class CuotaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");


    public Cuota crearCuota() throws ParseException {
        Cuota cuota = new Cuota();

        System.out.println("Ingrese el monto de la Cuota");
        cuota.setMontoCuota(leer.nextInt());
        System.out.println("Ingrese el número de la Cuota");
        cuota.setNumCuotaActual(leer.nextInt());
        cuota.setFormaPago("Efectivo");
        cuota.setPagada(false);
        System.out.println("Ingrese la fecha de vemcimiento: ");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd"); //Para declarar valores en nuevos objetos date, usa el mismo formato date que usaste al crear las fechas
        cuota.setFechaVenci(sdf.parse(leer.next()));


        return  cuota;

    }

}
