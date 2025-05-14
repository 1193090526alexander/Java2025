import java.io.Serializable;

public class Javabeans {
    public static void main(String[] args) {
        var persona = new Persona();
        persona.setNombre("Juanito");
        persona.setApellido("Juanito");
        System.out.println("Persona " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
    }
}
class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }

    public Persona(){}
}