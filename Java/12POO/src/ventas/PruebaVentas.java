package ventas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("Sistema de Ventas");

        var producto1 = new ventas("blusa", 30);
        var producto2 = new ventas("blue jen", 50);

        //Primer orden

        var orden1 = new Orden();
        orden1.agregarProducto(producto1);
        orden1.agregarProducto(producto2);
        orden1.calcularTotal();
        System.out.println(orden1);

        var orden2 = new Orden();
        orden2.agregarProducto(new ventas("camisa", 3));
        orden2.agregarProducto(producto2);
        System.out.println(orden2);
    }
}
