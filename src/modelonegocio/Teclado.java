package modelonegocio;

public class Teclado extends DispositivosEntrada{
    private final int idTeclado;
    private static int contadorTeclado;

    public Teclado(String tipoEntrada, String marca) {

        super(tipoEntrada, marca);
        this.idTeclado= ++Teclado.contadorTeclado;
    }
}
