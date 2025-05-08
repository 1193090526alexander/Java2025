public class MatricesVersionNueva {
    public static void main(String[] args) {

        var matriz = new int[][]{
                {100, 200, 300},
                {400, 500, 600}
        };

        //Modificar los valores en una matriz


        //RECOORER UNA MATRIZ
        //Ciclo mas externo para recorrer las filas
        for (var fi = 0; fi < matriz.length; fi++) {
            for (var co = 0; co < matriz[fi].length; co++) {
                System.out.println("valor [" + fi + "][" + co + "] = " + matriz[fi][co]);
            }
        }


    }
}
