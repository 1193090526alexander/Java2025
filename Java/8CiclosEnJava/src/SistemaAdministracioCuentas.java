import java.util.Scanner;

public class SistemaAdministracioCuentas {
    public static void main(String[] args) {

        System.out.println("****Administacion de cuientas****");
        var consola = new Scanner(System.in);
        var salir = false;

        while(!salir) {
            System.out.print("""
                    Sistema de administracion de cuenta ***" 
                    menu:
                    1. crear cuenta
                    2. Eliminar cuenta
                    3. Modificar cuenta
                    Escoje una opcion\s
                    """);
            var opcion = consola.nextInt();
            switch(opcion) {
                case 1 -> System.out.println("creando tu cuenta....\n");
                case 2 -> System.out.println("eliminando tu cuenta...\n");
                case 3 -> {
                    System.out.print("saliendo de tu cuenta...\n");
                    salir = true;
                }
                default -> System.out.print("Opcion no valida\n");
            }
        }
        System.out.println("Fin dels sistema de administracion de cuentas!!!");
    }
}
