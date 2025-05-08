import java.util.Scanner;

public class calcuadora {
    public static void main(String[] args) {
        System.out.println("*****Calcuadora******");
        var consola = new Scanner(System.in);
        var salir = false;


        while(!salir) {
            System.out.print("""
                    realizar operaciones con dos valores
                    1 sumar
                    2 multiplicar
                    3 restar
                    4 dividir 
                    5 salir
                    elije una operacion""");
            var opcion = Integer.parseInt(consola.nextLine());
            switch(opcion) {
                case 1-> {
                    System.out.print("Ingrese el primer valor: ");
                    var num1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Ingrese el segundo valor: ");
                    var num2 = Double.parseDouble(consola.nextLine());
                    var suma = num1+num2;
                    System.out.println("el resultado de la suma es " + suma);
                }
                case 2-> {System.out.print("Ingrese el primer valor: ");
                    var num1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Ingrese el segundo valor: ");
                    var num2 = Double.parseDouble(consola.nextLine());
                    var multiplicacion = num1*num2;
                    System.out.println("El resultado es: "+multiplicacion);
                }
                case 3 -> {
                    System.out.print("Ingrese el primer valor: ");
                    var num1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Ingrese el segundo valor: ");
                    var num2 = Double.parseDouble(consola.nextLine());
                    var resta = num1-num2;
                    System.out.println("El resultado es: "+resta);
                }
                case 4 -> {
                    System.out.print("Ingrese el primer valor: ");
                    var num1 = Double.parseDouble(consola.nextLine());
                    System.out.print("Ingrese el segundo valor: ");
                    var num2 = Double.parseDouble(consola.nextLine());
                    if (num2 != 0 ) {
                        var division = num1 / num2;
                        System.out.print("El resultado de la operacion es: " + division);
                    }else System.out.println("no se puede dividir entre 0");
                }
                case 5->{
                    salir = true;
                    System.out.println("espero fuera util");

                }
                default -> System.out.println("Opcion invalida");
            }

        }
    }
}
