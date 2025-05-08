public class sumaAcumuladoWhile {
    public static void main(String[] args) {
        var contador = 0;
        var suma = 0;
        while (contador <= 10) {
            System.out.println("suma en el while entre -> " + suma + " + " + contador + " es = " + (suma+contador));
            suma += contador;

            contador++;

        }
        System.out.println(suma);
    }
}
