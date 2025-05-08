import java.util.Scanner;

public class FuncionPar {
    //funcion para definor si un valor es par

    static boolean esPar(int num){
//        if (num%2==0)
//            return true;
//        return false;
        return (num % 2 == 0)? true : false;
    }

    public static void main(String[] args) {
        System.out.print("proporciona un avalor Numerico ");
        var numero = Integer.parseInt(new Scanner(System.in).nextLine());
        System.out.println("Numero par? " + esPar(numero));
    }
}
