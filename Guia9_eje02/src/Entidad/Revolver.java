package Entidad;

public class Revolver {

    private int posAct, posAgua;

    public Revolver() {
        llenarRevolver();
    }

    public int getPosAct() {
        return posAct;
    }

    public void setPosAct(int posAct) {
        this.posAct = posAct;
    }

    public int getPosAgua() {
        return posAgua;
    }

    public void setPosAgua(int posAgua) {
        this.posAgua = posAgua;
    }

    public void llenarRevolver() {
        posAct = 0;
        posAgua = 1+(int) (Math.random() * 6);
    }

    public boolean mojar() {
        siguienteChorro();
        if(posAct == posAgua)
        return true;
        else return false;
    }

    public void siguienteChorro() {
        posAct++;
    }

    @Override
    public String toString() {
        return "Revolver{" +
                "posAct=" + posAct +
                ", posAgua=" + posAgua +
                '}';
    }
}
