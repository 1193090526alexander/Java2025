import java.util.Scanner;

public class CajeroAutomatico {
    public static void main(String[] args) {
        System.out.println("*****Cajero Automatico*****");
        var consola = new Scanner(System.in);
        var valorInicial = 10000.00;
        var salir = false;

        while (!salir) {
            System.out.print("""
                    ¡¡¡Bienvenido a tu cajero!!!
                    Menu Principal:
                    1. Depositar
                    2. retirar
                    3. Consultar saldo
                    4. Salir
                    Elije una Opcion
                    """);
            var opcion = Integer.parseInt(consola.nextLine());
            switch (opcion) {
                case 1-> {
                    System.out.println("valor a depositar: ");
                    var depositar = Double.parseDouble(consola.nextLine());
                    if (depositar > 0 ){
                       valorInicial = valorInicial + depositar;
                        System.out.printf("""
                                %nTransacion Exitosa 
                                \tDepositaste $%.1f
                                \tValor Actual $%.2f
                                """, depositar, valorInicial);
                    }else {
                        System.out.print("No se puede depositar este valor Intentantalo de nuevo");
                    }

                }
                case 2-> {
                    System.out.println("valor a retirar: ");
                    var retirar = Double.parseDouble(consola.nextLine());
                    if (retirar > 0 && retirar < valorInicial ){
                        valorInicial = valorInicial-retirar;
                        System.out.printf("""
                                %nTransacion Exitosa 
                                \tretiraste  $%.1f
                                \tValor Actual $%.2f
                                """, retirar, valorInicial);
                    }else System.out.print("No se puede retirar este valor");
                }
                case 3-> {
                    System.out.println(" su saldo actual es de " + valorInicial);
                }
                case 4-> {
                    salir = true;
                    System.out.println("Ya terminaste en enuestro cajero \nGracias por visitarnos");
                }
            }
        }
    }
}
