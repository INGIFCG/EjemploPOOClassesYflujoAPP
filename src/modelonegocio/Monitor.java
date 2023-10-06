package modelonegocio;

public class Monitor {
    private final int idMotitor;
    private String marca;
    private double tamano;
    private static int contadorMonitores;

    private Monitor(){
        this.idMotitor= ++Monitor.contadorMonitores;
    }
    public Monitor(String marca, double tamano){
        this();
        this.marca = marca;
        this.tamano=tamano;
    }

    public int getIdMotitor(){
        return this.idMotitor;
    }
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "marca='" + marca + '\'' +
                '}';
    }
}
