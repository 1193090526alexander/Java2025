import java.util.Scanner;

public class EstacionesYear {
    public static void main(String[] args) {
        System.out.println("------------------Estaciones--------------");
        var consola = new Scanner(System.in);
        System.out.print("Ingrese el mes en numero para saber  la estacion: ");
        int mes = Integer.parseInt(consola.nextLine());

        if (mes == 1 || mes ==2 || mes == 12){
            System.out.println("Estamos en el mes  de iNVIERNO");
        }else if (mes == 3 || mes == 4 || mes == 5){
            System.out.println("Estamos en el mes  de PRIMAVERA");
        }else if (mes == 6 || mes == 7 || mes == 8){
            System.out.println("Estamos en el mes  de VERANO");
        }else if (mes == 9 || mes == 10 || mes == 11) {
            System.out.println("Estamos en el mes  de OTOÑO");
        }else{
            System.out.println("el valor no es correcto para el mes =(");
        }
    }
}
