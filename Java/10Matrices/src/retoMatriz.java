import java.util.Scanner;

public class retoMatriz {
    public static void main(String[] args) {
        int fila, columna;
        var consola = new Scanner(System.in);
        System.out.print("Ingresa la fila: ");
        fila = Integer.parseInt(consola.nextLine());
        System.out.print("Ingresa la columna: ");
        columna = Integer.parseInt(consola.nextLine());
        var matriz = new int[fila][columna];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print("Ingresa un valor [" + i + "][" + j + "]: ");
                matriz[i][j] = Integer.parseInt(consola.nextLine());
            }
        }

        var sumaDiagonal = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if(i == j){
                    sumaDiagonal += matriz[i][j];
                }
            }
        }
        System.out.println("Suma diagonal: " + sumaDiagonal);
    }
}
