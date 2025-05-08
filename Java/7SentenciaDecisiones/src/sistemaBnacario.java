import java.util.Scanner;

public class sistemaBnacario {
    public static void main(String[] args) {
        System.out.println("****Bienvenidos al sistema bancario****");
        var consola = new Scanner(System.in);
        System.out.println("Deseas salir de sistema bancario(true/false)? ");
        var salirSistema = Boolean.parseBoolean(consola.nextLine());

        if (!salirSistema) {
            System.out.println("continuamos dentro del sistema...");
        }
        else {
            System.out.println("Saliendo del sistema...");
        }
    }
}
