package modelonegocio;

public class Orden {
    private final int idOrden;
    private Computadora computadoras[];
    private static int contadorOrdenes;
    private  int contadorComputadoras;
    private static final int MAX_COMPUTADORAS= 10;
    public Orden(){
        this.idOrden = Orden.contadorOrdenes;
        this.computadoras= new Computadora[Orden.MAX_COMPUTADORAS];
    }
    public void agregarComputadora(Computadora computadora){
        if( this.contadorComputadoras <Orden.MAX_COMPUTADORAS){
            computadoras[this.contadorComputadoras++]=  computadora;
        }else{
            System.out.println("Excedio el limite de compra");
        }
    }
    public void mostrarOrden(){
        System.out.println(".idOrden = " + this.idOrden);
        System.out.println("Computadoras de la orden= " + idOrden);
        for(int i=0; i<= this.contadorComputadoras;i++){
            System.out.println(this.computadoras[i]);
        }
    }
}
