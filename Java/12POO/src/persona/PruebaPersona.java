package persona;

public class PruebaPersona {
    public static void main(String[] args) {
        System.out.println("Creacion de clase y objetos de tipo personas");
        System.out.println("Variable estatic " + Persona.getContadorPersonas());
        var objeto1 = new Persona("laura","gomez\n");
        System.out.println(objeto1);
        System.out.println("Variable estatic " + Persona.getContadorPersonas());

        //Segundo Obejto
        var objeto2 = new Persona("helmer","aura\n");
        System.out.println(objeto2);
        System.out.println("Variable estatic " + Persona.getContadorPersonas());

    }
}
