import java.util.Scanner;

public class sistemaEnvios {
    public static void main(String[] args) {
        System.out.println("***********Sistema de Envios ************");
        final var TARIFAS_NACIONALES = 10.0;
        final var ENVIOS_INTERNACIONALES = 20.0;
        var localidad = "";
        var tarifa =0 ;

        var consola = new Scanner(System.in);

        System.out.println("Ingrese a donde quieres realizar el envio, elije un numero" + "\n1. nacionales" + "\n2. Internacionales");
        var destino = Integer.parseInt(consola.nextLine());

        System.out.println("Ingresa el peso extato del paquete ");
        var peso = Double.parseDouble(consola.nextLine());

        var costoEnvio = switch (destino) {
            case 1 -> peso * TARIFAS_NACIONALES;
            case 2 -> peso * ENVIOS_INTERNACIONALES;
            default -> {
                System.out.println("valor erroneo");
                yield null;
            }
        };
        if (destino == 1){
            localidad = "nacional";
            System.out.printf("""
                %n el destino del producto es %s el peso es de %.2f, el costo del envio es de $%.1f
                """, localidad, peso, costoEnvio );

        }else if (destino == 2){
            localidad = "internacional";
            System.out.printf("""
                %n el destino del producto es %s el peso es de  %.2f, el costo del envio es de $%.1f
                """, localidad, peso, costoEnvio );

        }else {
            localidad ="Invalidad ";
            System.out.printf("""
                %n el destino del producto es %s no sera posible enviarlo
                """, localidad);
        }

    }
}
