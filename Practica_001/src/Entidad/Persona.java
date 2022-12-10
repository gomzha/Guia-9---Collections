package Entidad;

public class Persona {

    private String nom, ape;
    private DNI dni;

    public Persona() {
    }

    public Persona(String nom, String ape, DNI dni) {
        this.nom = nom;
        this.ape = ape;
        this.dni = dni;
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

    public DNI getDni() {
        return dni;
    }

    public void setDni(DNI dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", ape='" + ape + '\'' +
                ", dni=" + dni.toString() +
                '}';
    }
}
