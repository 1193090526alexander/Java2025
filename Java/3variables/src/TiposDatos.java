public class TiposDatos {
    public static void main(String[] args) {


        //TIPOS DE DATOS EN JAVA
        //Enteros (su valor por defecto es 0
        byte tipoByte = 127; //valor maximo de un bay es de -127 hasta 128
        System.out.println("tipoByte = " + tipoByte);

        short tipoShort = 32767;
        System.out.println("tipoShort = " + tipoShort);
        int tipoInt = 2147483647;
        System.out.println("tipoInt = " + tipoInt);
        long tipoLong = 9223372036854775807L;  // l o L para indicar que u valor es long
        System.out.println("tipoLong = " + tipoLong);

        // Punto flotane (valor por defecto es 0.0)
        float tipoFloat = 3.143454523452452352352f;    //F o f para indicar que u valor es float
        System.out.println("tipoFloat = " + tipoFloat);
        double tipoDouble = 3.1415926535;//d o D para indicar que u valor es DOUBLE
        System.out.println("tipoDouble = " + tipoDouble);

        //Caracter (el valor por defecto es '\u0000')
        char tipoChar = 'A'; // caracteres del juego unicode
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = 100;
        System.out.println("tipoChar = " + tipoChar);
        tipoChar = '@';
        System.out.println("tipoChar = " + tipoChar);

        //boolean ( false)
        boolean tipoBoolean = true;
        System.out.println("tipoBoolean = " + tipoBoolean);

        //tipos Object(referecnia)
        String nombre = null;  //valor por defecto
        System.out.println("nombre = " + nombre);
        nombre = "nombre";
        System.out.println("nombre = " + nombre);
    }
}
