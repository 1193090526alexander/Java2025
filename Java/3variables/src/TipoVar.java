public class TipoVar {
    public static void main(String[] args) {
        System.out.println("uso de var en java");
        
        //sin el uso de var
        
        String nombre1 = "juan";
        System.out.println("nombre1 = " + nombre1);
        
        //con el uso de var 
        var nombre2 = "carlos";
        System.out.println("nombre2 = " + nombre2);

        //definir otras variables usando
        var edad = 30; // se refier tipo entero
        System.out.println("edad = " + edad);
        var sueldo = 50.00f;  //se refiere tipo float
        var esCasado = false; //valo de tipo boolean

        esCasado= true;
        // esCasado = "true";  //no podemos asiganar un tipo distinto

        //se bede definor su valor
        //var precio ; esto lanza error, tenemos que asignar un valor
        //precio= 10;

        //se debe poner inferir el tipo de dato
        //var apellido = null; no se puede inferir el tipo de dato

    }
}
