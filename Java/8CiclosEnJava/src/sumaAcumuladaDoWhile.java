public class sumaAcumuladaDoWhile {
    public static void main(String[] args) {
        var suma = 0;
        var contador = 0;
        do {
            System.out.println("la suma entre -> " + suma + " + " + contador +  " = " + (suma+contador));
            suma += contador;
            contador++;
        }while (contador <= 10);
    }
}
