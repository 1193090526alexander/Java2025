import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        System.out.println("Operador Ternario");
        //Sintaxis
        //codicion ? expresion1: expresion2;

        // detrerminar si un numero es par o no
        var consola = new Scanner(System.in);
        System.out.println("Ingrese un numero para saber si es par: ");
        int num = consola.nextInt();
        var resultado =(num % 2 == 0) ? "Par": "Impar";
        System.out.println("Numero es = " + resultado);

        // calcular si persona es mayor de edad
        System.out.println("Ingrese su edad");
        var edad = consola.nextInt();
        var resultado2 =(edad >= 18) ? "es mayo de edad": "aun esat chiquito";
        System.out.println("resultado2 = " + resultado2);

        //valor postivo, negativo, o cero

        System.out.println("Ingese un numero");
        var num2 = consola.nextInt();
        var resultado3 = (num2 > 0)? "es positivo": (num2 <0)? "es negativo":"es cero 0";
        System.out.println("el resultado del numero ingresado es  = " + resultado3);

    }
}
