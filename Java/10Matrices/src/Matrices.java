public class Matrices {
    public static void main(String[] args) {
        //Definion de matrices
        final  var FILAS = 2;
        final  var COLUMNAS = 3;

        //int[][] matriz = new int[2][3];
        var matriz = new int[2][3];
        
        //Modificar los valores en una matriz
        
        matriz[0][0] = 100;
        matriz[0][1] = 200;
        matriz[0][2] = 300;
        matriz[1][0] = 400;
        matriz[1][1] = 500;
        matriz[1][2] = 600;

        //RECOORER UNA MATRIZ
        //Ciclo mas externo para recorrer las filas
        for (var fi = 0; fi < FILAS; fi++) {
            for (var co = 0; co < COLUMNAS; co++) {
                System.out.println("valor [" + fi + "][" + co + "] = " + matriz[fi][co]);
            }
        }
        
        
    }
}
