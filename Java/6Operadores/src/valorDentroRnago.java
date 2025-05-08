import java.util.Scanner;

public class valorDentroRnago {
    public static void main(String[] args) {
        System.out.println("valor dentro Rnago");
        final var MINIMO = 3;
        final var MAXIMO = 10;
        System.out.print("Proporciona un valor entre 3 y 10 =");
        var dato = Integer.parseInt(new Scanner(System.in).nextLine());
        var estadoRango = (dato >= MINIMO && dato <= MAXIMO);
        System.out.println("estadoRango es= " + estadoRango);
    }
}
