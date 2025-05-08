public class MasConcatenacionCadenas {
    public static void main(String[] args) {
        //mas forams de concatenar cadenas en java
        
        var cadena1 = "Hola";
        var cadena2 = "Mundo";
        var cadena3 = cadena1 + " " + cadena2;
        
        
        //Metodo concat
        cadena3 = cadena1.concat(" ").concat(cadena2);
        System.out.println("cadena3 = " + cadena3);
        
        //StringBuilder
        var constructorCadenas = new StringBuilder();
        constructorCadenas.append(cadena1);
        constructorCadenas.append(" ");
        constructorCadenas.append(cadena2);
        var resultado = constructorCadenas.toString();
        System.out.println("resultado = " + resultado);
        
        //StringBuffer
        var stringBuffer = new StringBuilder();
        stringBuffer.append(cadena1).append(" ").append(cadena2);
        resultado = stringBuffer.toString();
        System.out.println("stringBuffer = " + resultado);

        //join
        resultado = String.join(" ", cadena1, cadena2);
        System.out.println("join = " + resultado);
    }
}
