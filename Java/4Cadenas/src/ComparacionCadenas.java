public class ComparacionCadenas {
    public static void main(String[] args) {
        //compracion de cadenas(poll cadenas)

        var cadena1 = "Java";
        var cadena2 = "Java";
        var cadena3 = new String("Java");

        //compracionde cadenas (==) comparan la referencia
        System.out.print("cadena1 es igual en referencia a cadena2 ");
        System.out.println(cadena1 == cadena2);

        //comparamos cadenas 1 con cadena 3(referencias)
        System.out.print("cadena1 es igual en referencia a cadena3 ");
        System.out.println(cadena1 == cadena3);

        //comprobar contendio usaremos el metodo equals
        System.out.print("cadena1 es igual en contenido a cadena3 ");
        System.out.println(cadena1.equals(cadena3));


        //Si queremos saber si dos cadenas tienen el mimos contenido lo comparamos con
        //EQUALS//
        if (cadena1.equals(cadena3)){
            cadena1 = "Javaaaaaaaaaaaaaaaaa";
            System.out.println("cadena3 = " + cadena1);
        }else{
            cadena1 = "Javaeeeeeeeee";
            System.out.println("cadena1 = " + cadena1);
        }

    }
}
