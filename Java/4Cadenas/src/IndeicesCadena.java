public class IndeicesCadena {
    public static void main(String[] args) {
        //Manejo de indices en una cadenas

        var cadena1 = "Hola Mundo ";


        //Recuperar el primer caracter
        var primerCaracter = cadena1.charAt(0);//Recuper el caracter de H
        System.out.println(primerCaracter);

        //Recuperar el ULTIMO CARATER caracter
        var ultimoCaracter = cadena1.charAt(9);//Recuper el caracter de H
        System.out.println(ultimoCaracter);

        //Recuperar el caracter M
        var caracterM = cadena1.charAt(5);//Recuper el caracter de H
        System.out.println(caracterM);
    }
}
