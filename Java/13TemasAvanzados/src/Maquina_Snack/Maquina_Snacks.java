package Maquina_Snack;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Maquina_Snacks {

    public static void main(String[] args) {
        maquina_Snacks();
    }

    public static void maquina_Snacks() {
        var salir = false;
        var consola = new Scanner(System.in);
        //cremaos las lista de productos de tipo producto
        List<Snack> productos = new ArrayList<>();
        System.out.println("***Maquinas de inventarios***");
        Snacks.mostarSnack();//Mostrar inventario de snacks disponibles
        while (!salir) {
            try {
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(opcion, consola, productos);
            }catch(Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
            finally {
                System.out.println();//imprime un salto de linea en cada interacion
            }
        }

    }
    private static int mostrarMenu(Scanner consola) {
        System.out.println("""
                Menu:
                1. Comprar Snack
                2. Mostrar Ticket
                3. Agregar nuevo snack
                4. Salir
                Elige una opcion:\s
                """);
        //Leemos y retornamos la opcion selecionada
        return Integer.parseInt(consola.nextLine());
    }
    private static boolean ejecutarOpciones(int opcion, Scanner consola, List<Snack> productos) {
        var salir = false;
        switch (opcion) {
            case 1 -> Comprarnack(consola, productos);
            case 2 -> MostrarTicket(productos);
            case 3 -> agregarSnack(consola);
            case 4 -> {
                System.out.println("Regresa pronto!!!");
                salir = true;
            }
            default -> System.out.println("Opcion Invalida" + opcion);
        }
        return salir;
    }
    private static void Comprarnack(Scanner consola, List<Snack> productos) {
        System.out.println("Que snack quieres comprar (id)?");
        var idSnack = Integer.parseInt(consola.nextLine());
        //validar que el snack exite exista en la lista de snacks
        var snackEncontrado = false;
        for (var snack : Snacks.getSnacks()){
            if (idSnack == snack.getIdSnack()){
                //Agregamos el snack a la lista de productos
                productos.add(snack);
                System.out.println("OK, Snack agregado: " + snack);
                snackEncontrado = true;
                break;
            }
        }
        if (!snackEncontrado){
            System.out.println("Error, Snack no encontrado" + idSnack);
        }
    }

    private static void MostrarTicket(List<Snack> productos) {
        var ticket = "**** Ticket de venta ****";
        var total = 0.0;
        for (var producto : productos){
            ticket +=  "\n\t- " + producto.getNombre() + " -$" + producto.getPrecio();
            total += producto.getPrecio();
        }
        ticket += "\n\tTotal -> $" + total;
        System.out.println(ticket);
    }

    private static void agregarSnack(Scanner consola) {
        System.out.println("Nombre del Snack: ");
        var nombre = consola.nextLine();
        System.out.println("Precio del Snack: ");
        var precio = consola.nextDouble();
        Snacks.agregarSnack(new Snack(nombre, precio));
        System.out.println("Tu Snack se ha agregado correctamente");
        Snacks.mostarSnack();
    }

}
