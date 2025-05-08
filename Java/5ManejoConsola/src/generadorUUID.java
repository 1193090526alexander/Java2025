import java.util.Random;
import java.util.Scanner;

public class generadorUUID {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        Random randon = new Random();
        System.out.print("\nGenerar UUID");

        System.out.print("\nIngresar su nombre ");
        String nombre = consola.nextLine();

        System.out.print("ingresar su apellido ");
        String apellido = consola.nextLine();

        System.out.print("ingresar su Año de nacimiento ");
        var year = consola.nextLine();

       var numeroAleatoio = randon.nextInt(9999)+1;

       var id = nombre.substring(0,2).toUpperCase().concat(apellido.substring(0,2).toUpperCase().concat(year.substring(2,4)));
        System.out.println("Hola ".concat(nombre));
        var mensaje = String.format("%04d",numeroAleatoio);
        System.out.println("numeroAleatoio = " + numeroAleatoio);
        System.out.print("Tu nuevo numero de identificacnion (iD) generado por el sistema es " + id.concat(mensaje));
        System.out.println("\n!!Felicidades!!");
    }
}
