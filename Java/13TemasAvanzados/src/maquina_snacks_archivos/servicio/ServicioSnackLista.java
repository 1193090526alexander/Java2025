package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnackLista implements IServicioSnacks{
    private static final List<Snack> snacks;

    //Bloque static inicializador
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("papas", 70));
        snacks.add(new Snack("refreso", 30));
        snacks.add(new Snack("Sandwich", 90));
    }

    public void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public  void mostarSnack(){
        var inventario = " ";
        for (var snack : snacks){
            inventario += snack.toString() + "\n";
        }
        System.out.println("-----Snack en el Inventario------");
        System.out.println(inventario);
    }

    public  List<Snack> getSnacks(){
        return snacks;
    }

}
