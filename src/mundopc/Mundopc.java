package mundopc;

import modelonegocio.*;

public class Mundopc {
    public static void main(String[] args) {
        Monitor monitor1 = new Monitor("Aser", 2000);
        Teclado teclado1 = new Teclado("USB", "Redragon");
        Raton raton1 = new Raton("USB", "Redragon");

        Computadora computadora1 = new Computadora("Pc Gamer", monitor1, teclado1, raton1);
        Orden orden1 = new Orden();
        orden1.agregarComputadora(computadora1);
        orden1.mostrarOrden();
    }

}
