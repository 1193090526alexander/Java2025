public class claseAbstracta {

    public static void main(String[] args) {
        FiguraGeometrica figuraGeometrica = new Reactangulo();
        figuraGeometrica.dibujar();
        figuraGeometrica = new Circulo();
        figuraGeometrica.dibujar();
    }
}
//clase abstracat
abstract  class FiguraGeometrica {//no se puede instanciar
    public abstract void dibujar();
}

 class Reactangulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("se dibuja un rectangulo");
    }
}

class Circulo extends FiguraGeometrica {
    @Override
    public void dibujar() {
        System.out.println("se dibuja un ciculo");
    }
}