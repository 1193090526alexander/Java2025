public class MetodosDeCadenas {
    public static void main(String[] args) {
        //Metodos de cadenas
        var cadena1 = "Hola mundo ";
        
        
        //Obtener el largo de lac adena
        var longitud = cadena1.length();
        System.out.println("longitud = " + longitud);
        
        //remplazar caracteres
        var nuevaCadena = cadena1.replace('a', 'c');
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //Convertir a mayusculas
        var mayusculas = cadena1.toUpperCase();
        System.out.println("mayusculas = " + mayusculas);
        
        //convertir a minisculas
        var minusculas = cadena1.toLowerCase();
        System.out.println("minusculas = " + minusculas);
        
        //Elimar espacios al iunio y al final 
        var cadena2 = "  Hola mundo nueva   ";
        System.out.println("cadena2 = " + cadena2);
        System.out.println("cadena2.trim() = " + cadena2.trim());
    }
}
