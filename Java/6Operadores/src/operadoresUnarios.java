public class operadoresUnarios {
    public static void main(String[] args) {
        System.out.println("operadores unarios");
        int a = 3, b= -3, resultado;
        var c = true;

       // operador unario +

        resultado = +a;
        System.out.println("resultado +a = " + resultado);

        //operador unario -

        resultado = -a;
        System.out.println("resultado -a = " + resultado);

        //operadores unarios de incremento/decremento
        //pre-incremento
        a  = 3;
        resultado = ++a; //primero se incrementa el valor
        System.out.println("resultado ++a= " + resultado);
        System.out.println("la variable a ya se incremento = " + a);

        //post-incremento
        a = 3;
        resultado = a++; //primero se usa el valor de la variable y despues de incrementa
        System.out.println("resultado a++= " + resultado);
        System.out.println("a en este momento se incrementa= " + a);
        //pre-decremento
        b  = -2;
        resultado = --b; //primero se incrementa el valor
        System.out.println("resultado --b= " + resultado);
        System.out.println("la variable b ya se decremento = " + b);

        //post-decremento
        b = -2;
        resultado =b--; //primero se usa el valor de la variable y despues de incrementa
        System.out.println("resultado b--= " + resultado);
        System.out.println("b en este momento se decrementa= " + b);
    }
}
