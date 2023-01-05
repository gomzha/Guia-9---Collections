package Entidad;

import java.util.ArrayList;

public class Mazo {

    private ArrayList<Carta> carta;
    private ArrayList<Carta> cartasUtilizadas = new ArrayList<>();

    public Mazo(ArrayList<Carta> carta) {
        this.carta = carta;
    }

    public Mazo(ArrayList<Carta> carta, ArrayList<Carta> cartasUtilizadas) {
        this.carta = carta;
        this.cartasUtilizadas = cartasUtilizadas;
    }

    public Mazo() {
    }

    public ArrayList<Carta> getCarta() {
        return carta;
    }

    public void setCarta(ArrayList<Carta> carta) {
        this.carta = carta;
    }

    public ArrayList<Carta> getCartasUtilizadas() {
        return cartasUtilizadas;
    }

    public void setCartasUtilizadas(Carta cartasUtilizadas) {
        this.cartasUtilizadas.add(cartasUtilizadas);
    }

    @Override
    public String toString() {
        return "Mazo{" +
                "carta=" + carta +
                ", cartasUtilizadas=" + cartasUtilizadas +
                '}';
    }

    public void eliminarCarta() {
        this.carta.remove(0);

    }
}
