package Entidad;

public class Perro {

    private String nom, raza, tam;
    private int edad;

    public Perro() {
    }

    public Perro(String nom, String raza, String tam, int edad) {
        this.nom = nom;
        this.raza = raza;
        this.tam = tam;
        this.edad = edad;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getTam() {
        return tam;
    }

    public void setTam(String tam) {
        this.tam = tam;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Perro{" +
                "nom='" + nom + '\'' +
                ", raza='" + raza + '\'' +
                ", tam=" + tam +
                ", edad=" + edad +
                '}';
    }
}
