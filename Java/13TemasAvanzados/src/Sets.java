import java.util.Set;
import java.util.TreeSet;

public class Sets {
    public static void main(String[] args) {
        Set<String> conjunto = new TreeSet<>();
        conjunto.add("Helmer");
        conjunto.add("Helmer");
        conjunto.add("Valentina");

        System.out.println("elementos sets");
        conjunto.forEach(System.out::println);

        //Remover un elemento
        conjunto.remove("Helmer");
        System.out.println("\nelementos sets");
        conjunto.forEach(System.out::println);



    }
}
