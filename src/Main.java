import ventas.Factura;
import ventas.Producto;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Producto producto1 = new Producto("Pantalon", 200);
        Producto producto2 = new Producto("Chaqueta", 500);
        Producto producto3 = new Producto("Camisa", 250);
        Producto producto4 = new Producto("Sueter", 300);
        Producto producto5 = new Producto("medias", 10);

        Factura orden1 = new Factura();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.agregarProducto(producto3);
        orden1.agregarProducto(producto4);
        orden1.agregarProducto(producto5);

        orden1.calcularTotal();
        orden1.mostrarOrden();
        orden1.calcularTotal();

    }
}