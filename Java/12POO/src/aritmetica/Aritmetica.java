package aritmetica;

public class Aritmetica {
    private int operando1;
    private int operando2;


    //// METODOS GET AND SET

    public int getOperando1() {
        return this.operando1;
    }

    public void setOperando1(int operando1) {
        this.operando1 = operando1;
    }

    public int getOperando2() {
        return this.operando2;
    }

    public void setOperando2(int operando2) {
        this.operando2 = operando2;
    }

    public Aritmetica() {
        System.out.println("Operador this vacio " + this);
    }

    public Aritmetica (int operando1, int operando2){
        this.operando1 = operando1;
        this.operando2 = operando2;
        System.out.println("Operador this " + this);

    }

    public void suemar(){
        var resultado = this.operando1 + this.operando2;
        System.out.println("El resultado de la suma entre " + operando1 + " + " + operando2 + " = " + resultado);
    }
    public void restar(){
        var resultado = this.operando1 - this.operando2;
        System.out.println("El resultado de la resta entre " + operando1 + " - " + operando2 + " = " + resultado);
    }

    public static void main(String[] args) {
        System.out.println("Ejemplo aritmetica.Aritmetica");

        var a = new Aritmetica(5,5);
        a.suemar();
        Aritmetica a2 = new Aritmetica();
        a2.restar();
        System.out.println("aritmetica.Aritmetica DIR= " + a);
        System.out.println("aritmetica.Aritmetica DIR a2= " + a2);
//
//
//

    }
}
