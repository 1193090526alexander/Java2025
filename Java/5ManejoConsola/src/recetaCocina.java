import java.util.Scanner;

public class recetaCocina {
    public static void main(String[] args) {

        System.out.println("*****Receta de cocina*****");
        var consola = new Scanner(System.in);
        //Nombre receta
        System.out.println("Nombrede la receta");
        var nombreReceta = consola.nextLine();

        //Ingredienets de la receta
        System.out.println("Ingrese los ingredientes de la receta");
        var ingredientes = consola.nextLine();
        //tiempo en minutos
        System.out.println("Tiempo de preparacion (min) ");
        var preparacion = Integer.parseInt(consola.nextLine());

        System.out.println("Ingrese la dificultad de la receta");
        var dificultad = consola.nextLine();

        //Imprimir la receta

        System.out.println("\n-----Receta------");

        System.out.println("nombreReceta = " + nombreReceta);
        System.out.println("ingredientes = " + ingredientes);
        System.out.println("preparacion = " + preparacion);
        System.out.println("dificultad = " + dificultad);
    }
}
