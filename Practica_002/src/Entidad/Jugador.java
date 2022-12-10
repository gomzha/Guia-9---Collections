package Entidad;

public class Jugador {

    private String nom,ape,pos;
    private int num;

    public Jugador(String nom, String ape, String pos, int num) {
        this.nom = nom;
        this.ape = ape;
        this.pos = pos;
        this.num = num;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getPos() {
        return pos;
    }

    public void setPos(String pos) {
        this.pos = pos;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nom='" + nom + '\'' +
                ", ape='" + ape + '\'' +
                ", pos='" + pos + '\'' +
                ", num=" + num +
                '}';
    }
}
