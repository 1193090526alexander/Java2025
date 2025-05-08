import java.util.Scanner;

public class SaludYFitnees {
    public static void main(String[] args) {
        System.out.println("****Salud Y Fitnees****");
         final var META_PASOS_DIARIOS = 10000;
         final var CALORIAS_POR_PASO = 0.04;

         var consola = new Scanner(System.in);

        System.out.print("Ingrese tu nombre por favor ");
        var nombre = consola.nextLine();
        System.out.print("Ingrese los pasaos que caminaste el dia de hoy ");
        var pasos = Integer.parseInt(consola.nextLine());

        var caloriasQuemadas = pasos*CALORIAS_POR_PASO;

        var metaAlcansada = (pasos >= META_PASOS_DIARIOS)? "Cumpliste la meta Felicitaciones": "te falto poco por lograrlo";
        System.out.printf("""
                %n
                \tNombre: %s
                \tCalorias Quemadas: %.2f
                \tdiste estos Pasos: %d kcla
                \tmeta Alcansada: %s
                
                """, nombre, caloriasQuemadas, pasos, metaAlcansada);
    }
}
