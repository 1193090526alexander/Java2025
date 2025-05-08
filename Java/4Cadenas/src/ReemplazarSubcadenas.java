public class ReemplazarSubcadenas {
    public static void main(String[] args) {
        //reemplazar subcadenas

        var cadena = "Hola Mundo";
        System.out.println("cadena original = " + cadena);
        
        //reemplazar "Mundo" por "a todos"
        var nuevaCadena = cadena.replace("Mundo", "a todos");
        System.out.println("nuevaCadena = " + nuevaCadena);
        
        //reemplazar "Hola" por "Adios"
        nuevaCadena = nuevaCadena.replace("Hola", "Adios");
        System.out.println("nuevaCadena = " + nuevaCadena);
    }
}
