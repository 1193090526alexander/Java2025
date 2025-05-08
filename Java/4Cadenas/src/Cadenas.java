public class Cadenas {
    public static void main(String[] args) {
        System.out.println("*** Manejo de cadenas");
        var cadenana1 = "hola";
        System.out.println("cadenana1 = " + cadenana1);
        var cadenana2 = new String("Mundo");
        System.out.println("cadenana2 = " + cadenana2);
        var cadenana3 = cadenana1.concat(" ".concat(cadenana2));
        System.out.println("cadenana3 = " + cadenana3);
        var cadenana4 = """
                este es
                un texto 
                multilinea
                """;
        System.out.println("cadenana4 = " + cadenana4);
    }
}
