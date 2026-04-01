package maquina_snacks_archivos.servicio;

import maquina_snacks_archivos.dominio.Snack;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksArchivos implements IServicioSnacks {
    //crea las listas de snacks
    private final String NOMBRE_ARCHIVO = "SNACKS.txt";
    private List<Snack> snacks = new ArrayList<>();

    //constructor clase
    public ServicioSnacksArchivos() {
        //creamos elk archivo si no existe
        var archivo = new File(NOMBRE_ARCHIVO);
        var existe = false;
        try{existe = archivo.exists();
            if(existe){
                this.snacks = obtenerSnacks();
            }
            else {
                var salida = new PrintWriter(new FileWriter(archivo));
                salida.close();
                System.out.println("Se creado el archivo");
            }

        }catch (Exception ex){
            System.out.println("Error al abrir el archivo"+ex.getMessage());
        }
        // si no existe, cargar algunos snack iniciales
        if (!existe) {
            cargarSnacksIniciales();
        }
    }

    private void cargarSnacksIniciales() {
        this.agregarSnack(new Snack("Papas", 1300));
        this.agregarSnack(new Snack("CocaCola", 2300));
        this.agregarSnack(new Snack("Sandwich", 7000));
    }

    private List<Snack> obtenerSnacks() {
        var snacks = new ArrayList<Snack>();
        try {
            List<String> lineas = Files.readAllLines(Paths.get(NOMBRE_ARCHIVO));
            for (String linea : lineas) {
                String[] lineasSnacks = linea.split(",");
                var idSnack = lineasSnacks[0];
                var nombre = lineasSnacks[1];
                var precio = Double.parseDouble(lineasSnacks[2]);
                var snack = new Snack(nombre, precio);
                snacks.add(snack);
            }

        }catch (Exception ex){
            System.out.println("Error al obtener el archivo snacks "+ex.getMessage());
            ex.printStackTrace();
        }
        return snacks;
    }
    @Override
    public void agregarSnack(Snack snack) {
        //Agregamos el nuevo Snack 1. a la lista memoria
        this.snacks.add(snack);
        //2. Guardamos el snack en el archivo
        this.agregarSnackArchivo(snack);

    }
    private void agregarSnackArchivo(Snack snack) {
        boolean anexar = false;
        var archivo = new File(NOMBRE_ARCHIVO);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(snack.escribirSnack());
            salida.close();
        }catch (Exception ex){
            System.out.println("Error al abrir el archivo"+ex.getMessage());
        }

    }

    @Override
    public void mostarSnack() {
        System.out.println("Mostar el archivo de snacks en el inventario");
        var inventarioSnacks = "";
        for (Snack snack : this.snacks) {
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println(inventarioSnacks);
    }

    @Override
    public List<Snack> getSnacks() {
        return this.snacks;
    }
}
