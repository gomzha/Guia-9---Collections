package Entidad;

public class Jugador {

    private int id;
    private String nombreJug;
    private boolean mojado;

    public Jugador() {
    }

    public Jugador(int id, String nombreJug) {
        this.id = id;
        this.nombreJug = nombreJug;
        this.mojado = false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreJug() {
        return nombreJug;
    }

    public void setNombreJug(String nombreJug) {
        this.nombreJug = nombreJug;
    }

    public boolean isMojado() {
        return mojado;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "id=" + id +
                ", nombreJug='" + nombreJug + '\'' +
                ", mojado=" + mojado +
                '}';
    }

    public boolean disparo(Revolver revolver){
        mojado=revolver.mojar();
        return mojado;
    }


}
