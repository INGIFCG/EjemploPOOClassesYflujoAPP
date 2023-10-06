package modelonegocio;

public class Computadora {
    private final int idComputadora;
    private String nombre;
    private Monitor monitor;
    private Teclado teclado;
    private Raton mouse;
    public static int contadorComputadoras;

    private Computadora(){
        this.idComputadora = ++Computadora.contadorComputadoras;
    }
    public Computadora(String nombre, Monitor monitor, Teclado teclado, Raton mouse) {
        this();
        this.nombre = nombre;
        this.monitor = monitor;
        this.teclado = teclado;
        this.mouse = mouse;
    }

    public int getIdComputadora() {
        return idComputadora;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Monitor getMonitor() {
        return monitor;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    public Raton getMouse() {
        return mouse;
    }

    public void setMouse(Raton mouse) {
        this.mouse = mouse;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "idComputadora=" + idComputadora +
                ", nombre='" + nombre + '\'' +
                ", monitor=" + monitor +
                ", teclado=" + teclado +
                ", mouse=" + mouse +
                '}';
    }
}
