import java.util.Scanner;

public class rangoVariable {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);

        System.out.println("proporcione un valor entero");
        var numero = Integer.parseInt(consola.nextLine());

        //revisamos si el valor esta dentro del rango
        var estaDentroRnago = numero >= 1 && numero <= 10;
        System.out.println("estaDentroRnago = " + estaDentroRnago);

        //revisamos si el valor esta fuera del rango
        var estaFueraRango = !(numero >= 1 && numero <= 10);
        System.out.println("estaFueraRango = " + estaFueraRango);
    }
}
