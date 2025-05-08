import java.util.Scanner;

public class areaPerimetroRectangulo {
    public static void main(String[] args) {
        System.out.println("** areaPerimetroRectangulo **");
        var consola = new Scanner(System.in);

        System.out.println("ingrese la altura del reactuangulo");
        var altura = Double.parseDouble(consola.nextLine());

        System.out.println("ingrese la base del reactuangulo");
        var base = Double.parseDouble(consola.nextLine());

        //calcular el area
        var area = 2*(altura*base);
        //perimetro
        var perimetro = (base+altura)*2;

        System.out.println("perimetro del rectangulo= " + perimetro);
        System.out.println("area del rectangulo= " + area);
    }
}
