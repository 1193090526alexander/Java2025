package Maquina_Snack;

import java.util.ArrayList;
import java.util.List;

public class Snacks {
    private static final List<Snack> snacks;

    //Bloque static inicializador
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("papas", 70));
        snacks.add(new Snack("refreso", 30));
        snacks.add(new Snack("Sandwich", 90));
    }

    public static void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public static void mostarSnack(){
        var inventario = " ";
        for (var snack : snacks){
            inventario += snack.toString() + "\n";
        }
        System.out.println("-----Snack en el Inventario------");
        System.out.println(inventario);
    }

    public static List<Snack> getSnacks(){
        return snacks;
    }

}
