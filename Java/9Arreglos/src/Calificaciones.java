import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        var consola = new Scanner(System.in);
        System.out.println("Ingrese un numero de calificaones: ");
        var numero = Integer.parseInt(consola.nextLine());
        var arregloCalificaiones = new double[numero];

        for (int i = 0; i < arregloCalificaiones.length; i++) {
            System.out.println("Ingrese la calificacion " + i);
            arregloCalificaiones[i] = Double.parseDouble(consola.nextLine());
        }
        var suma = 0;
        for (int i = 0; i < arregloCalificaiones.length; i++) {
            suma += arregloCalificaiones[i];
        }
        var promedio = suma / arregloCalificaiones.length;
        System.out.println("promedio del estudiantes es = " + promedio);
    }
}
