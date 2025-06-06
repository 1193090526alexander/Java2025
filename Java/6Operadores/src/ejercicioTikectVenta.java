import java.util.Scanner;

public class ejercicioTikectVenta {
    public static void main(String[] args) {
        System.out.println("*** Generación Ticket de Venta ***");
        var consola = new Scanner(System.in);

        System.out.print("Precio leche: ");
        var precioLeche = Double.parseDouble(consola.nextLine());

        System.out.print("Precio pan: ");
        var precioPan = Double.parseDouble(consola.nextLine());

        System.out.print("Precio lechuga: ");
        var precioLechuga = Double.parseDouble(consola.nextLine());

        System.out.print("Precio plátanos: ");
        var precioPlatanos = Double.parseDouble(consola.nextLine());

        System.out.println("Aplicar algun descuento (%)?");
        var decuentoPorcentaje = Integer.parseInt(consola.nextLine());

        // Cálculo del subtotal (sin impuestos)
        var subtotal = precioLeche + precioPan + precioLechuga + precioPlatanos;

        //Aplicar decuanto
        var descuanto = subtotal*(decuentoPorcentaje/100.0);

        var subtotalDescuento = subtotal-descuanto;
        // Cálculo con impuestos (16%)
        var impuesto = subtotalDescuento*0.16;

        // Cálculo total de la compra (con impuestos)
        var costoTotalCompra = subtotalDescuento + impuesto;

        // Imprimir el ticket de venta
        System.out.printf("""
                %nTicket de Venta
                ---------------
                Subtotal: $%.2f
                Descuanto: $%.2f (%d%%)
                Impuesto (16%%): $%.2f
                Costo total de la compra: $%.2f
                """, subtotal,descuanto,decuentoPorcentaje, impuesto, costoTotalCompra);
    }
}
