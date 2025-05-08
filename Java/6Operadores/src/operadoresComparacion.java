public class operadoresComparacion {
    public static void main(String[] args) {
        System.out.println("***operadores comparacion***");

        int a = 3; int b = 4;
        //igualdad
        var resultado = (a == b);
        System.out.println("resultado a==b " + resultado);

        //didntinto !=
        resultado = (a != b);
        System.out.println("resultado a!=b  " + resultado);
        //mayor que
        resultado = (a > b);
        System.out.println("resultado a>b " + resultado);
        //mayor igual que
        resultado = (a >= b);
        System.out.println("resultado a>=b " + resultado);

        //menor que
        resultado = (a < b);
        System.out.println("resultado a<b " + resultado);
        //menor igual que
        resultado = (a <= b);
        System.out.println("resultado a<=b " + resultado);
    }
}
