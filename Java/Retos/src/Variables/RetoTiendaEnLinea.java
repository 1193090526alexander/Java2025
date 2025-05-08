package Variables;

public class RetoTiendaEnLinea {
    public static void main(String[] args) {
        System.out.println("**** Tienda en Linea(detalle del producto)****");
        String nombreProducto = "camisa negra";
        double precio = 1500;
        int cantidad = 12;
        boolean DisponibleParaVenta = true;

        System.out.println("Producto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidad = " + cantidad);
        System.out.println("Disponible Para venta = " + DisponibleParaVenta +" \n");

        //Modificar valores
        nombreProducto = "camisa negra XL";
        precio = 1000;
        cantidad = 0;
        DisponibleParaVenta = false;

        System.out.println("Producto = " + nombreProducto);
        System.out.println("precio = " + precio);
        System.out.println("cantidad = " + cantidad);
        System.out.println("Disponible Para venta = " + DisponibleParaVenta);
    }
}
