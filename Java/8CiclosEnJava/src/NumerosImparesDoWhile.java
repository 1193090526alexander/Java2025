public class NumerosImparesDoWhile {
    public static void main(String[] args) {
        int number = 1;
        do {
            if (number % 2 != 0)
                System.out.println("el numero " + number + " es impar");
            number++;
        }while (number <= 100);
    }
}
