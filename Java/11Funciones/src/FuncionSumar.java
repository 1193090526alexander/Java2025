public class FuncionSumar {
    //vamos a definir la funcion de sumar
    static int sumar(int num1, int num2){
        var resultado = num1 + num2;
        return resultado;
    }


    public static void main(String[] args) {
        int arg1 = 3, arg2 = 4;
        var resultadoFuncion = sumar(arg1, arg2);
        System.out.println("Resultado: " + resultadoFuncion);
        resultadoFuncion = sumar(arg1, 234);
        System.out.println("Resultado: " + resultadoFuncion);
    }
}
