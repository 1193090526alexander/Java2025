import java.util.Scanner;

public class ReservaHotel {
    public static void main(String[] args) {

        final double SIN_VISTA_MAR = 150.50;
        final double CON_VISTA_MAR = 190.50;
        System.out.println("*************Reserva Hotel*************");
        var consola = new Scanner(System.in);
        System.out.println("Ingrese el nombre del hotel");
        String nombre = consola.nextLine();
        System.out.println("Ingrese Nombre del cliente ");
        String cliente = consola.nextLine();
        System.out.println("Cuantos días te quedaras en el hotel? ");
        int dias = Integer.parseInt(consola.nextLine());
        System.out.print("\tTarifas del hotl segun el cuarto que elijas"+ "\tCuarto sin vista al mar = $150.50 por dia" +  "cuarto con vista al mar $190.50 por dia");
        System.out.println("Tu cuarto será con vista al mar? (tre / false ) ");
        boolean vistaMar = Boolean.parseBoolean(consola.nextLine());

        var proceso = (vistaMar)? "elegiste una habitacion con vista al mar $"+ dias*CON_VISTA_MAR: "Elegiste una habitacion Sencilla $" + dias*SIN_VISTA_MAR;

        System.out.printf("""
                %n------------- detealles de la reserva------------------------
                \tNombre del Hotel: %s
                \tNombre del Cliente: %s
                \tDias Alojado en el hotel: %d 
                \tCosto total segun tu eleccion: %s
                """, nombre, cliente, dias, proceso);

    }
}
