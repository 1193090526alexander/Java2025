package persona;

public class Persona {
    static  int contadorPersonas = 0;
    private int idPersona;
    private String nombre;
    private String apellido;

    //Construtotes
    public Persona(String nombre, String apellido){
        this.nombre  = nombre;
        this.apellido = apellido;

        //Incremenbtar el atributo static
        this.idPersona = ++Persona.contadorPersonas;
    }
    public Persona(){
        this.nombre = null;
        this.apellido = null;
    }

    //getter and setter

    public String getNombre(){
        return this.nombre;
    }
    public String getApellido(){
        return this.apellido;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }

    public static int getContadorPersonas() {
        return contadorPersonas;
    }

    public static void setContadorPersonas(int contadorPersonas) {
        Persona.contadorPersonas = contadorPersonas;
    }

    @Override
    public String toString(){
        return "id " + idPersona +
                ", nombre "   + nombre +
                ", Apellido " + apellido + ", Dir Mem. " + super.toString();
    }




}
