package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContendioArchivo {
    public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "MI_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContendio = "\nNueva Contendio";
            salida.println(nuevoContendio);
            salida.close();
        }catch (Exception e){
            System.out.println("Error al leer el archivo" + e.getMessage());
        }
    }
}
