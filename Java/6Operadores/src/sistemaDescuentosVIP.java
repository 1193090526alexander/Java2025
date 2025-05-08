import java.util.Scanner;

public class sistemaDescuentosVIP {
    public static void main(String[] args) {
        System.out.println("***** BIENVENIDO DE DESCUENTOS VIP *****");
        var consola =new Scanner(System.in);
        final int NUMEROARTICULO = 10;

        System.out.println("cuantos Articulos compraste el dia de hoy?");
        var articulo = Integer.parseInt( consola.nextLine());

        System.out.println("cuentas con memebresia, (responde con SI o NO)?");
        var membresia = consola.nextLine();

        var descuentoVip = articulo >= NUMEROARTICULO && membresia.equals("SI");
        System.out.println("¿El cliente cuenta con el descuento de la tienda? "+descuentoVip);
    }
}
