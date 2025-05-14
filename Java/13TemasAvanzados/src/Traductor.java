public interface Traductor {
    //public y abstract

    void traducir();
    //Metodos con implementacion por default

    default void iniciarTraductor(){
        System.out.println("Iniciando traductor...");
    }
}
class Ingles implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Iniciando a ingles...");
    }
}
class Frances implements Traductor {
    @Override
    public void traducir() {
        System.out.println("Iniciando a francess...");
    }

    @Override
    public void iniciarTraductor() {
        System.out.println("Iniciando traductor en frances...");
    }
}

class Pruebatraductor{
    public static void main(String[] args) {
        Traductor ingles = new Ingles();
        ingles.traducir();
        ingles.iniciarTraductor();
        //traductor en frances
        Traductor frances = new Frances();
        frances.iniciarTraductor();
        frances.traducir();
    }
}