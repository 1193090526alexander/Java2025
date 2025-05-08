package ventas;

public class Orden {
    private final int orden;
    private ventas[] venta;
    private int contadorProducto;
    private static final int MAX_PRODUCTO = 10;
    private static int contador;

    public Orden() {
        this.orden = ++Orden.contador;
        this.venta = new ventas[Orden.MAX_PRODUCTO];
    }

    public void agregarProducto(ventas venta) {
        if(this.contadorProducto < Orden.MAX_PRODUCTO)
            this.venta[this.contadorProducto++] = venta;
        else
            System.out.println("se ha superado el masimo de productos" + Orden.MAX_PRODUCTO);
    }

    public double calcularTotal() {
        double total = 0;
        for(int i = 0; i<this.contadorProducto; i++){
            var producto = this.venta[i];
            total += producto.getPrecio();//total  = total + producto.getprecio()
        }
        return total;
    }
    public void mostrarOrden() {
        System.out.println("Id Orden: " + this.orden);
        var totalOrden = this.calcularTotal();
        System.out.println("\tTotal de la orden: " + totalOrden);
        System.out.println("\tProductos de la orden");
        for(int i = 0; i<this.contadorProducto; i++){
            System.out.println("\t\t" + this.venta[i]);
        }
    }

    @Override
    public String toString() {
        var resultado = "Id Orden: " + this.orden + "\n";
        var totalOrden = this.calcularTotal();
        resultado += "\tTotal de la orden: " + totalOrden + "\n";
        resultado += "\tProductos de la orden" + "\n";
        for(int i = 0; i<this.contadorProducto; i++){
            resultado += "\t\t" + this.venta[i] + "\n";
        }
        return resultado;
    }
}
