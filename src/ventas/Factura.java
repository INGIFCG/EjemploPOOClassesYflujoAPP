package ventas;

public class Factura {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Factura() {
        this.idOrden = ++Factura.contadorOrdenes;
        this.productos = new Producto[Factura.MAX_PRODUCTOS];// incializa el array de productos
    }

    public void agregarProducto(Producto producto) {
        if (this.contadorProductos < Factura.MAX_PRODUCTOS) {
                productos[contadorProductos++] = producto;
        } else {
            System.out.println("Cantidad maxima de productos alcanzada");
        }
    }

    public void calcularTotal() {
        int total = 0;
        for (int i = 0; i < this.contadorProductos; i++) {
            total += productos[i].getPrecio();
        }
        System.out.println("total = " + total);
    }

    public void mostrarOrden() {
        System.out.println("=======================");
        System.out.println("Productos");
        for (int i = 0; i < this.contadorProductos; i++) {
            System.out.println("this.productos[i] = " + this.productos[i]);
        }
    }
}
