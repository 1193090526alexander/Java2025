import java.util.Scanner;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        System.out.println("------------Sistema Calificaciones ------------");
        var consola = new Scanner(System.in);

        System.out.println("cual es la calificacion del estudiante ? entre 0 y 10");
        double nota = Double.parseDouble(consola.nextLine());

        String calificacionLetra = "";

        if (nota >= 9 && nota <= 10) {
            calificacionLetra = "A";
        }else if (nota >= 8 && nota < 9) {
            calificacionLetra = "B";
        }else if (nota >= 7 && nota < 8) {
            calificacionLetra = "C";
        }else if (nota >= 6 && nota < 7) {
            calificacionLetra = "D";
        }else if (nota >= 0 && nota < 6) {
            calificacionLetra = "E";
        }else {
            calificacionLetra = "calificaciones incorrecta";
        }

        System.out.printf("""
                %ncalificacion del estudiante
                calificaion  %.1f es equivalente a la letra %s
                """,nota, calificacionLetra);
    }
}
