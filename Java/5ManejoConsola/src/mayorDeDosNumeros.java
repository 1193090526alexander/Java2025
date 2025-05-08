import java.util.Scanner;

public class mayorDeDosNumeros {
    public static void main(String[] args) {
        System.out.print("El mayor de dos numeros: ");
        var consola = new Scanner(System.in);

        System.out.println("Ingrese un numero");
        int numero1 = Integer.parseInt(consola.nextLine());
        System.out.println("Ingrese un numero 2");
        var numero2 = Integer.parseInt(consola.nextLine());

        var resultado = (numero1 > numero2) ? numero1 +  " es mayor": numero2 +  " es menor";
        System.out.printf("""
                %n----------- determinar el mayor de dos numeros
                \tnumero1=%d
                \tNumero mayor=%d
                \tResultado: %s
                """, numero1, numero2, resultado);

    }
}
