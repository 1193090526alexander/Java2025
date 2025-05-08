public class operadoresLogicos {
    public static void main(String[] args) {
        System.out.println("**** Operadores Logicos ****\n");
        boolean a = true, b = true;
        //x           y         x&&y
        //false     false       flase
        //false     true        flase
        //true      false       flase
        //true      true        true
        //operador and &&
        var resultado = a && b;
        System.out.println("resultado a && b = " + resultado);

        //operador and ||

        //x           y         x&&y
        //false     false       flase
        //false     true        true
        //true      false       true
        //true      true        true
        resultado = a || b;
        System.out.println("resultado a || b = " + resultado);

        //operador and ||

        //x           !x
        //false     true
        //true     false

        resultado = !a;
        System.out.println("resultado !a " + resultado);
    }
}
