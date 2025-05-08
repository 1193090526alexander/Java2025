import java.util.Scanner;

public class sistemaEmpleados {

    public static void main(String[] args) {
        System.out.println("***Sistema de empleados***");

        var consola = new Scanner(System.in);


        //leer la informacion  del nombre del empleado

        System.out.print("Nombre del empleado");
        var nombre = consola.nextLine();

        //leer edad
        System.out.print("Ingresar la edad del Empleado");
        var edad = Integer.parseInt(consola.nextLine());

        //salior del empleado
        System.out.print("Ingresar el salario del Empleado");
        var salario = Double.parseDouble(consola.nextLine());

        //salior del empleado
        System.out.print("Es Jefe de departamaneto(true/false)");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        //Imprimir los valores de el empleado
        System.out.println("\n Datos del empleado: ");
        System.out.println("\tnombre = " + nombre);
        System.out.println("\tedad = " + edad);
        //System.out.println("\tsalario = " + salario);
        System.out.printf("\tsalario = $%.2f%n ", salario);
        System.out.println("\tes Jefe Departamento = " + esJefeDepartamento);


    }
}
