package Entidad;

import java.util.ArrayList;

public class Cliente {

    private String nombreApe, doc, mail, domic, telefono;
    private ArrayList<Poliza> polizas;

    public Cliente() {
    }

    public Cliente(String nombreApe, String doc, String mail, String domic, String telefono, ArrayList<Poliza> polizas) {
        this.nombreApe = nombreApe;
        this.doc = doc;
        this.mail = mail;
        this.domic = domic;
        this.telefono = telefono;
        this.polizas = polizas;
    }

    public ArrayList<Poliza> getPolizas() {
        return polizas;
    }

    public void setPolizas(ArrayList<Poliza> polizas) {
        this.polizas = polizas;
    }

    public String getNombreApe() {
        return nombreApe;
    }

    public void setNombreApe(String nombreApe) {
        this.nombreApe = nombreApe;
    }

    public String getDoc() {
        return doc;
    }

    public void setDoc(String doc) {
        this.doc = doc;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getDomic() {
        return domic;
    }

    public void setDomic(String domic) {
        this.domic = domic;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nombreApe='" + nombreApe + '\'' +
                ", doc='" + doc + '\'' +
                ", mail='" + mail + '\'' +
                ", domic='" + domic + '\'' +
                ", telefono='" + telefono + '\'' +
                '}';
    }
}
