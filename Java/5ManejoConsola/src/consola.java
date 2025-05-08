import java.util.Scanner;

public class consola {
    public static void main(String[] args) {
        //Introducir datos por consola

        var consola = new Scanner(System.in);
        System.out.println("Ingrese un nombre: ");
        var nombre = consola.nextLine();
        System.out.println("El nombre es: "+ nombre);
    }
}
