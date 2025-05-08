import java.util.Scanner;

public class DibujaTriangulo {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.print("Introduzca el numoer de filas para el tringulo ");
        var num = consola.nextInt();

        for (var fila = 1; fila <= num; fila++) {
            var espaciosBlanco = " ".repeat(num - fila);
            var saterisco = "*".repeat(2*fila-1);
            System.out.println(espaciosBlanco + saterisco);

        }
    }
}
