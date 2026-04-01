package Archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class crearArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "MI_archivo.txt";
        var archivo = new File(nombreArchivo);
        try {
            if (archivo.exists()) {
                System.out.println("Archivo existe");
            } else {
                var salida = new PrintWriter(new FileWriter(nombreArchivo));
                salida.close();
                System.out.println("Se creo el archivo ");
            }
        }catch (IOException e){
            System.out.println("Error al crear el archivo" + e.getMessage());
            e.printStackTrace();
        }

    }
}
