package herencia;

public class Animal {
    protected void hacerSonido(){
        System.out.println("El animal hace un Sonido");
    }
}

class Perro extends Animal {

    @Override
    protected void hacerSonido(){
        System.out.println("El perro hace Guaf ");
    }


}
class Gato extends Animal {
    protected void hacerSonido(){
        System.out.println("El gato hace Miau ");
    }
}
class PruebaAnimal{
    //metodo polimorfico
    static void imprimriSonido(Animal animal){
        animal.hacerSonido();
    }
    public static void main(String[] args) {

        var otroanimal = new Perro();
        imprimriSonido(otroanimal);
        var gato = new Gato();
        imprimriSonido(gato);

    }
}