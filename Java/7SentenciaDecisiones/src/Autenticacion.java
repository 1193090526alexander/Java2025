import java.util.Scanner;

public class Autenticacion {
    public static void main(String[] args) {
        final var USUARIO = "HELMER";
        final var PASSWORD = "1234";

        var consola = new Scanner(System.in);

        System.out.print("por favor ingrese su usuario");
        var usuario = consola.nextLine();

        System.out.print("por favor ingrese su password");
        var password = consola.nextLine();

        var autenticacion = switch (usuario){
            case USUARIO -> {
                if (password.equals(PASSWORD)) {
                    yield "Bienvenido al sistema";
                }else{
                    yield "contrasena invalida";
                }
            }
            default -> {
                if (password.equals(PASSWORD)) {
                    yield "usuario incorrecto corregirlo";
                }else yield "usuario y password incorrectos favor corregirlos";
            }
        };
        System.out.printf("""
                %n-----------------------detalles de la autenticacion ------------------
                informacion del usuario: %s
                """,autenticacion);
    }
}
