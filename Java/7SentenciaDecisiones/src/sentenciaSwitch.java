import java.util.Scanner;

public class sentenciaSwitch {
    public static void main(String[] args) {
        System.out.println("----------------------Sentencia Switch------------------------");
        var consola = new Scanner(System.in);

        System.out.print("digite el dia de la semana y este te dira que dia es ok? ");
        var dia = Integer.parseInt(consola.nextLine());

       switch (dia) {
            case 1-> System.out.println("Lunes");
            case 2-> System.out.println("Martes");
            case 3-> System.out.println("Miercoles");
            case 4-> System.out.println("Jueves");
            case 5-> System.out.println("Viernes");
            case 6-> System.out.println("Sabado");
            case 7-> System.out.println("Domingo");
            default-> System.out.println("dia no exite invalido");
        }
    }
}
