package Entidad;

public class Rodado {

    private String marca, modelo, numMotor, anio, chasis, color, tipo;


    public Rodado() {
    }

    public Rodado(String marca, String modelo, String numMotor, String anio, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;
        this.numMotor = numMotor;
        this.anio = anio;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getNumMotor() {
        return numMotor;
    }

    public void setNumMotor(String numMotor) {
        this.numMotor = numMotor;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Rodado{" +
                "marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", numMotor='" + numMotor + '\'' +
                ", anio='" + anio + '\'' +
                ", chasis='" + chasis + '\'' +
                ", color='" + color + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}
