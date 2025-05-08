public class FormateoCadenas {
    public static void main(String[] args) {
        System.out.println("**** FORMATEO DE CADENAS*****");
        var nombre = "Helmer";
        var edad = 24;
        var salario = 10000.05;

        //string format

        var mensaje = String.format("nombre: %s, Edad:  %d, salario: $%.2f", nombre, edad, salario);
        System.out.println(mensaje);

        //Metodo prinf
        System.out.printf("nombre: %s, Edad: %d, Salario: $%.2f%n", nombre, edad, salario);

        var numeroEmpleado = 12;

        //formato con text block

        mensaje = """
                %nDetalle de persona:\s
                ----------------------
                \tNombre: %s
                \tNumeroEmpleado: %04d
                \tEdad: %d años
                \tSalario: %.2f
                """.formatted(nombre, numeroEmpleado, edad, salario);
        System.out.println("mensaje = " + mensaje);

        //formateo con tect block y printf directamente

        System.out.printf("""
                %nDetalle de persona:\s
                ----------------------
                \tNombre: %s
                \tNumeroEmpleado: %04d
                \tEdad: %d años
                \tSalario: %.2f
                """, nombre, numeroEmpleado, edad, salario);
    }
}
