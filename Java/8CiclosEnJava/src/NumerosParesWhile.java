public class NumerosParesWhile {
    public static void main(String[] args) {
        System.out.println("******* Numeros pares con While *******");
        int i = 1;
        while(i<= 100 ){
            if(i % 2 == 0){
                System.out.print(i + " ");
            }
            i++;
        }
    }
}
