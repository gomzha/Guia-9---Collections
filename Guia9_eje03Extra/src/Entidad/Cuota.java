package Entidad;

import java.util.Date;

public class Cuota {

    private int numCuotaActual;
    private int montoCuota;
    private boolean pagada;
    private String formaPago;
    private Date fechaVenci;


    public Cuota() {
    }

    public Cuota(int numCuotaActual, int montoCuota, boolean pagada, String formaPago, Date fechaVenci) {
        this.numCuotaActual = numCuotaActual;
        this.montoCuota = montoCuota;
        this.pagada = pagada;
        this.formaPago = formaPago;
        this.fechaVenci = fechaVenci;
    }

    public int getNumCuotaActual() {
        return numCuotaActual;
    }

    public void setNumCuotaActual(int numCuotaActual) {
        this.numCuotaActual = numCuotaActual;
    }

    public int getMontoCuota() {
        return montoCuota;
    }

    public void setMontoCuota(int montoCuota) {
        this.montoCuota = montoCuota;
    }

    public boolean isPagada() {
        return pagada;
    }

    public void setPagada(boolean pagada) {
        this.pagada = pagada;
    }

    public String getFormaPago() {
        return formaPago;
    }

    public void setFormaPago(String formaPago) {
        this.formaPago = formaPago;
    }

    public Date getFechaVenci() {
        return fechaVenci;
    }

    public void setFechaVenci(Date fechaVenci) {
        this.fechaVenci = fechaVenci;
    }

    @Override
    public String toString() {
        return "Cuota{" +
                "numCuotaActual=" + numCuotaActual +
                ", montoCuota=" + montoCuota +
                ", pagada=" + pagada +
                ", formaPago='" + formaPago + '\'' +
                ", fechaVenci=" + fechaVenci +
                '}';
    }
}
