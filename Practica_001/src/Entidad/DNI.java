package Entidad;

public class DNI {

    private char serie;
    private long num;

    public DNI(char serie, long num) {
        this.serie = serie;
        this.num = num;
    }

    public DNI() {
    }

    public char getSerie() {
        return serie;
    }

    public void setSerie(char serie) {
        this.serie = serie;
    }

    public double getNum() {
        return num;
    }

    public void setNum(long num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "DNI{" +
                "serie=" + serie +
                ", num=" + String.valueOf(num) +
                '}';
    }
}
