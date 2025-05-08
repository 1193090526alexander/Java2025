import java.util.Random;

public class numerosAleatorios {

    public static void main(String[] args) {
        Random rand = new Random();
        //Generar un numero alaetorio entre 0 y9

        var numoerosAleatorios = rand.nextInt(999)+1;
        System.out.println("numoerosAleatorios entre 0 y 9 = " + numoerosAleatorios);

        //Generar un numoero aleatorio entre 1 y 10

        numoerosAleatorios = rand.nextInt(10) +1;
        System.out.println("numoerosAleatorios entre 1 y 10= " + numoerosAleatorios);

        //Generar numeros aleatorio entre 0.0 y 1.0

        var flotantes = rand.nextFloat();
        System.out.println(" numero flotantes entre aleatorio entre 0.0 y 1.0= " + flotantes);


        //simular el el lanzamiento de un dado
        var dado = rand.nextInt(6)+1;
        System.out.println("Resultado dado = " + dado);
    }
}
