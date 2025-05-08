import java.util.Scanner;

public class casaEspejos {
    public static void main(String[] args) {
        System.out.println("*****Bienvenidos a la casa de los espejps*****");
        var consola = new Scanner(System.in);

        System.out.print("Ingrese tu edad ");
        var edad = Integer.parseInt(consola.nextLine());

        System.out.print("Te da miedo la oscuridad ?(true/false)");
        var miedo = Boolean.parseBoolean(consola.nextLine());

        if (edad >=10 && !miedo){
            System.out.println("puedes entrar a la casa de los espejos");
        } else {
            System.out.println("ohhhhh no !!! lo siento no puedes entrar a la casa de los espejos");
        }
    }
}
