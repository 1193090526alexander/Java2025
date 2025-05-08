import java.util.Scanner;

public class LeerTiposDatos {
    public static void main(String[] args) {
        //leer distintos tipos de datos
        //leer un tipo de dato int
        var consola = new Scanner(System.in);
        System.out.println("Ingrese tu edad: ");
        var edad = consola.nextInt();
        System.out.println("La edad es : " + edad);


        //leer valor de de tipo double

        System.out.println("Ingrese por favor tu altura");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        //Consumir el caracter de salto de linea
        consola.nextLine();

        //Leer nombre de tipo string
        System.out.println("Ingrese tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);

        //conversion de da datos
        System.out.print("Proporciona un valor entero");
        //var enteroString = consola.nextLine();
        //var entero = Integer.parseInt(enteroString);
        var entero = Integer.parseInt(consola.nextLine());
        System.out.println("entero = " + entero);

        //tipo flotante
        System.out.println("Proporciona el valor de tipo flotante");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

    }
}
