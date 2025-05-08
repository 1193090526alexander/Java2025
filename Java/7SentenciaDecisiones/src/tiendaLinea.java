import java.util.Scanner;

public class tiendaLinea {
    public static void main(String[] args) {
        System.out.println("tienda Virtual");

        var consola = new Scanner(System.in);

        System.out.print("puede indicar el monto de lo que compro? ");
        var monto = Integer.parseInt(consola.nextLine());

        System.out.print("es miembro de la tienda(true/false)? ");
        var miembro = Boolean.parseBoolean(consola.nextLine());

        if(monto >10000 && miembro){
            var descuanto = monto-(monto*0.10);
            System.out.println("valor de la compre inicial "+ monto);
            System.out.println("su compra con descunato es de "+ descuanto);
        }else if(miembro){
            var descuanto = monto-(monto*0.05);
            System.out.println("valor de la compre inicial "+ monto);
            System.out.println("su compra por ser solo miembro con el descuanto es de "+descuanto);
        }else {
            System.out.println("no hay descuento " + monto);
        }
    }
}
