import java.util.Scanner;

public class sistemaPrestamosLibros {
    public static void main(String[] args) {
        System.out.println("**** sistema prestamosLibros ****");
        var consola =new Scanner(System.in);
        final int KILOMETROS = 3;

        System.out.println("a cuanto vives de la unoversidad?");
        var distancia = Integer.parseInt( consola.nextLine());

        System.out.println("Tienes credencial de estudiante?(true/false)");
        var estudiante = Boolean.parseBoolean(consola.nextLine());

        var descuentoVip = (distancia <= KILOMETROS && distancia >=0) || estudiante;
        System.out.println("¿se le puede prestar el libro? "+descuentoVip);
    }
}
