import java.util.Scanner;

public class RevisarNumeroPositivo {
    public static void main(String[] args) {
        System.out.println("Revisar numero positivo");
        var consola = new Scanner(System.in);

        System.out.print("Ingrese un numero ");
        var numero = Integer.parseInt(consola.nextLine());

        if (numero > 0 ) {
            System.out.println("Numero positivo " + numero);
        } else if (numero < 0) {
            System.out.println("Numero negativo " + numero);
        }else {
            System.out.println("Numero es cero " + numero);
        }
    }
}
