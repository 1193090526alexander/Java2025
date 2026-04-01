package excepciones;

public class Aritmetica {
    public static int division(int numerador, int denominador) throws Exception {
        if (denominador == 0)
            throw new Exception("Division entre cero");
        return numerador / denominador;

    }
}
