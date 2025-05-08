public class ReglaNombresVariables {
    public static void main(String[] args) {
        //reglas nonbres devaribles
        String nombreCompleto = "Helmer Alexander Patiño Quintero";//correcta buenas practicas
        System.out.println("nombreCompleto = " + nombreCompleto);
        String NombreCompleto = "jeronimo Patiño Quintero"; //correcto, no aplica las buenas practicas
        System.out.println("NombreCompleto = " + NombreCompleto);
        //String nombre-completo = "helmer patiño" //Incorrecto
        String nombre_cliente = "John Doe"; //correcto, no aplica las buenas practicas
        System.out.println("nombre_cliente = " + nombre_cliente);
        String _apellido = "patiño"; //correcto y aceptable
        System.out.println("_apellido = " + _apellido);
        String $apellido = "quintero"; //correcto y aceptable
        System.out.println("$apellido = " + $apellido);
        int totPzs = 10; //correcto, no aplica las buenas practicas
        int totalPiezas = 10;//correcto, aplica las buenas practicas
        boolean casasdo = true;//correcto, aplica las buenas practicas
        boolean esCasado =true;//correcto, aplica las buenas practicas
        boolean tieneSaldo = true; //correcto y aplica buenas practicas
        boolean hasSaldo = true; //correcto y aplica buenas practicas


    }
}
