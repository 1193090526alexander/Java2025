import java.util.Scanner;

public class EstacionYearSwitch {
    public static void main(String[] args) {
        System.out.println("------------------Estaciones--------------");
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el mes en numero para saber  la estacion: ");
        int mes = Integer.parseInt(consola.nextLine());

        var estacion = switch (mes) {
            case 1, 2, 12 ->"Invierno";
            case 3, 4, 5 ->"Primavera";
            case 6, 7, 8 ->"Verano";
            case 9, 10, 11 -> "Otoño";
            default -> "estacion no encontrada";
        };
        System.out.println("el mes "+ mes+" la estacion es: " + estacion);
    }
}
