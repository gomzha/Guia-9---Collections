package Entidad;

import java.util.ArrayList;
import java.util.Date;

public class Poliza {

    private Cliente cli;
    private Rodado rodado;
    private String numPoliza, formPago, coberturaTipo;
    private Date fechaIni, fechaFin;
    private Cuota cuota;
    private int cantCuotas, montoAsegurado, montoAseguradoGranizo;
    private boolean granizo;

    public Poliza() {
    }

    public Poliza(Cliente cli, Rodado rodado, String numPoliza, String formPago, String coberturaTipo, Date fechaIni, Date fechaFin, Cuota cuota, int cantCuotas, int montoAsegurado, int montoAseguradoGranizo, boolean granizo) {
        this.cli = cli;
        this.rodado = rodado;
        this.numPoliza = numPoliza;
        this.formPago = formPago;
        this.coberturaTipo = coberturaTipo;
        this.fechaIni = fechaIni;
        this.fechaFin = fechaFin;
        this.cuota = cuota;
        this.cantCuotas = cantCuotas;
        this.montoAsegurado = montoAsegurado;
        this.montoAseguradoGranizo = montoAseguradoGranizo;
        this.granizo = granizo;
    }

    public Cliente getCli() {
        return cli;
    }

    public void setCli(Cliente cli) {
        this.cli = cli;
    }

    public Rodado getRodado() {
        return rodado;
    }

    public void setRodado(Rodado rodado) {
        this.rodado = rodado;
    }

    public String getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(String numPoliza) {
        this.numPoliza = numPoliza;
    }

    public String getFormPago() {
        return formPago;
    }

    public void setFormPago(String formPago) {
        this.formPago = formPago;
    }

    public String getCoberturaTipo() {
        return coberturaTipo;
    }

    public void setCoberturaTipo(String coberturaTipo) {
        this.coberturaTipo = coberturaTipo;
    }

    public Date getFechaIni() {
        return fechaIni;
    }

    public void setFechaIni(Date fechaIni) {
        this.fechaIni = fechaIni;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Cuota getCuota() {
        return cuota;
    }

    public void setCuota(Cuota cuota) {
        this.cuota = cuota;
    }

    public int getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(int cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public int getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(int montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public int getMontoAseguradoGranizo() {
        return montoAseguradoGranizo;
    }

    public void setMontoAseguradoGranizo(int montoAseguradoGranizo) {
        this.montoAseguradoGranizo = montoAseguradoGranizo;
    }

    public boolean isGranizo() {
        return granizo;
    }

    public void setGranizo(boolean granizo) {
        this.granizo = granizo;
    }

    @Override
    public String toString() {
        return "Poliza{" +
                "cli=" + cli +
                ", rodado=" + rodado +
                ", numPoliza='" + numPoliza + '\'' +
                ", formPago='" + formPago + '\'' +
                ", coberturaTipo='" + coberturaTipo + '\'' +
                ", fechaIni=" + fechaIni +
                ", fechaFin=" + fechaFin +
                ", cuota=" + cuota +
                ", cantCuotas=" + cantCuotas +
                ", montoAsegurado=" + montoAsegurado +
                ", montoAseguradoGranizo=" + montoAseguradoGranizo +
                ", granizo=" + granizo +
                '}';
    }
}
