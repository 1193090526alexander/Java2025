package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivo {
    public static void main(String[] args) {
        //leer archivo
        var nombrearchivo = "MI_archivo.txt";
        var archivo = new File(nombrearchivo);
        try {
            System.out.println("Iniciando leer archivo");
            //Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            //Leemos linea a linea del archivo
            var linea = entrada.readLine();
            while (linea != null) {
                System.out.println(linea);
                //antes de termianr el ciclo nos movemos a la siguiete linea
                linea = entrada.readLine();
            }
            //cerrar archivo
            entrada.close();
        }catch (Exception e){
            System.out.println("Error al leer archivo" + e.getMessage());
        }
    }
}
