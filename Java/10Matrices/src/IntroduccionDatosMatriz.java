import java.util.Scanner;

public class IntroduccionDatosMatriz {
    public static void main(String[] args) {
        int filas, columnas;
        var sonsola = new Scanner(System.in);

        System.out.print("Ingrese el numero de filas: ");
        filas = Integer.parseInt(sonsola.nextLine());
        System.out.print("Ingrese el numero de columnas: ");
        columnas = Integer.parseInt(sonsola.nextLine());

        var matriz = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                System.out.print("Valor [" + i + "][" + j + "] = " );
                matriz[i][j] = Integer.parseInt(sonsola.nextLine());
            }
        }
        //Iterar los valores de la matriz
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.println("\nValor [" + i + "][" + j + "] = " + matriz[i][j]);
            }
        }

    }
}
