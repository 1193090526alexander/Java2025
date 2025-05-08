package aritmetica.prueba;

import aritmetica.Aritmetica;

public class PruebaAritmetica {
    public static void main(String[] args) {
        System.out.println("Ejemplo aritmetica.Aritmetica");

        var a = new Aritmetica(5,9 );
        a.setOperando1(100);
        a.setOperando2(200);
        System.out.println(a.getOperando1());

        a.suemar();

        Aritmetica a2 = new Aritmetica(1,1);
        a2.restar();

//

    }
}
