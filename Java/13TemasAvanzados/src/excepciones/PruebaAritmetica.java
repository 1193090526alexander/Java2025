package excepciones;

public class PruebaAritmetica {
    public static void main(String[] args) {
        try {
            var resultado = Aritmetica.division(10, 2);
            System.out.println("Resultado: " + resultado);
        }catch (Exception e) {
            System.out.println("Ocorreu um erro ao division" + e);
        }
        finally{
            System.out.println("Se reviso la deivision entre cero");
        }
    }
}
