import Entidad.Mazo;
import Servicio.CartaServicio;
import Servicio.MazoServicio;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int opcion = 1;
        Mazo mazo = new Mazo();
        MazoServicio mazoServicio = new MazoServicio();
        mazo = mazoServicio.barajar();

        do {
            try {
                System.out.println("Ingrese la opción que desea realizar: ");
                System.out.println("-1.Barajar ");
                System.out.println("-2.Siguiente carta ");
                System.out.println("-3.Cartas disponibles ");
                System.out.println("-4.Dar cartas ");
                System.out.println("-5.Cartas que hayan salido ");
                System.out.println("-6.Mostrar Mazo restante ");
                System.out.println("-7.Salir");

                opcion = leer.nextInt();

                switch (opcion) {
                    case 1:
                        mazo = mazoServicio.barajar();
                        break;

                    case 2:
                        if (mazo.getCarta().isEmpty())
                            System.out.println("No quedan mas cartas!!!!");
                        else mazo = mazoServicio.siguienteCarta(mazo);
                        break;

                    case 3:
                        mazoServicio.cartasDisponibles(mazo);
                        break;

                    case 4:
                        mazo = mazoServicio.darCartas(mazo);
                        break;

                    case 5:
                        if (mazo.getCartasUtilizadas().isEmpty())
                            System.out.println("Aún no se sacó ninguna carta del mazo");
                        else mazoServicio.cartasMonton(mazo);
                        break;
                    case 6:
                        mazoServicio.mostrarBaraja(mazo);
                        break;
                }
            } catch (Exception e) {
                System.out.println("Error en el ingreso de opción!");
            }
            if (opcion < 1 || opcion > 7) {
                System.out.println("Error en el ingreso de opción!");
                opcion = 0;
            }
        } while (opcion >= 0 && opcion < 7);


    }
}