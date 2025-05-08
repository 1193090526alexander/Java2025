public class ArumentosVariabes {
    public static void main(String[] args) {
        imprimirNumeros(1,2,3,4,5,12,12,12,12,12,12,12);//var args
        variosParametros("karla", 1, 2, 3);
    }

     static void variosParametros(String nombre, int...  numeros) {
         System.out.println("Nombre: " + nombre);
         imprimirNumeros(numeros);
    }

     static void imprimirNumeros(int... numeros) {//agregadno estos 3 puntos y agregando el nombre de la variable por si solo crea un arreglo
        for (var i  = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] +  " ");
        }
    }
}
