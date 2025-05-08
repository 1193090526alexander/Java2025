public class Arreglos {
    public static void main(String[] args) {
        System.out.println("Arreglo 1: ");
        //Arreglos
        var enteros = new int[5];
        int[]enteros3 = {0, 12, 56, 34};
        var enteros2 = new int[]{12, 12, 5, 34};
        //Modificar los elementos
        enteros[0] = 10;
        enteros[1] = 20;
        enteros[4] = 30;
        System.out.println("enteros valor 1 indice 0 = " + enteros[0]);
        System.out.println("enteros valor 2 indice 1 = " + enteros[1]);
        System.out.println("enteros valor 3 indice 2 = " + enteros[2]);
        System.out.println("enteros valor 4 indice 3 = " + enteros[3]);
        System.out.println("enteros valor 5 indice 4 = " + enteros[4]);
        System.out.println("enteros = " + enteros);
        for (int i = 0; i < enteros.length; i++) {
            System.out.println("estamos imprimiendo el valor en el indice "+ i + "  = " + enteros[i]);
        }
    }
}
