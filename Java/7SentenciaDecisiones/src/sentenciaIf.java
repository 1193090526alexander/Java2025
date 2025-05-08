public class sentenciaIf {
    public static void main(String[] args) {
        //uso de la sentencia de if
        //sentencia if y else
        int edad = 13;
        if (edad >= 18) {
            System.out.println("la persona es mayor de edad");
        }
        else if (edad >= 13 && edad < 18) {
            System.out.println("eres un adolecente");
        }
        else {
            System.out.println("eres un niño");
        }
    }
}
