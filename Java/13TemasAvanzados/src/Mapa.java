import java.util.HashMap;
import java.util.Map;

public class Mapa {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre", "Helmer");
        persona.put("Apellido", "Patiño");
        persona.put("Edad", "25");
        persona.put("Edad", "32");// no se permite duplicados

        System.out.println("Valores de mapa: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("Edad", "32");
        persona.remove("Apellido");
        System.out.println("Valores de mapa: " + persona);
        persona.entrySet().forEach(System.out::println);

        //Iterar sobre los elementos del mapa por separado
        System.out.println("\nIterar sobre los elementos(Llave, valor)");
        persona.forEach((llave, valor) -> System.out.println("Llave " + llave + " Valor " + valor));
    }
}
