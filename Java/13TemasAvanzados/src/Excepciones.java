public class Excepciones {
    public static void main(String[] args) {
        int valor1 =10, valor2 = 0;
        try {
            var resultado = valor1 / valor2;
            System.out.println("Resultado: " + resultado);
        }catch(Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
