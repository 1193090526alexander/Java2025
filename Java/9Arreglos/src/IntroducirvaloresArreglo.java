import java.util.Scanner;

public class IntroducirvaloresArreglo {
    public static void main(String[] args) {
        //Introducir valores a un arreglo

        var consola = new Scanner(System.in);

        //declaraar arreglo
        System.out.print("proporcion el valor al arreglo ");
        var largoArreglo = Integer.parseInt(consola.nextLine());
        var enteros = new int[largoArreglo];

        for (int i = 0; i < largoArreglo; i++) {
            System.out.print("proporciona el valor entero [" + i + "]");
            enteros[i] = Integer.parseInt(consola.nextLine());
        }
        //imprimir los valores del aareglo

        for (int i = 0; i < largoArreglo; i++) {
            System.out.print(enteros[i] + " ");
        }
    }
}
