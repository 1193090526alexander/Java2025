public class operadoresAsignacion {
    public static void main(String[] args) {
        System.out.println("**** Operadores asignados ****");

        //Asigancion =
        var miNumero = 10;
        int miNumero2;
        miNumero2 = 15;

        //Asigancion compuesto
        miNumero += 5;//miNumero = minumero+5;->15
        System.out.println("miNumro = " + miNumero);

        //-=, *=, /=
        miNumero *=2;//miNumero = minumero*2;->30
        System.out.println("miNumero = " + miNumero);

        //Asigancio de varibles multiples

        int a =2, b=3, c= 4;
        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);
    }
}
