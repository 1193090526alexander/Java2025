public class FuncionRecursiva {
    //Imprimir 1 al 5 usando una funcion ecursiva
    //funcion recursiva

    static void funcionRecursiva(int numero) {
        if (numero == 1)
            System.out.println(numero + " ");
        else{
            //casso recursivo
            funcionRecursiva(numero - 1);
            System.out.println(numero + " ");
        }

    }

    public static void main(String[] args) {
        funcionRecursiva(5);
    }
}
