import java.util.Scanner;

public class sistemaAutenticacion {
    public static void main(String[] args) {
        System.out.println("***** Sistema de Autenticacion *****");
        var consola = new Scanner(System.in);
        final var NOMBRE = "HELMER";
        final var PASSWORD = "123456";

        System.out.print("por Favor ingrese el usuario ");
        var nombre = consola.nextLine();
        System.out.print("por Favor ingrese el password ");
        var password = consola.nextLine();

        var verificacion = nombre.equals(NOMBRE) && password.equals(PASSWORD);

        System.out.println("el usuario es ? " + verificacion);
    }
}
