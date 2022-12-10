package Entidad;

public class Persona {
    //nombre, apellido, edad, documento y Perro.

    private String nom, ape;
    private long doc;
    private int edad;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nom, String ape, long doc, int edad, Perro perro) {
        this.nom = nom;
        this.ape = ape;
        this.doc = doc;
        this.edad = edad;
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nom='" + nom + '\'' +
                ", ape='" + ape + '\'' +
                ", doc=" + doc +
                ", edad=" + edad +
                ", perro=" + perro +
                '}';
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

    public long getDoc() {
        return doc;
    }

    public void setDoc(long doc) {
        this.doc = doc;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }
}
