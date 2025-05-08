public class GeneradorEmails {
    public static void main(String[] args) {
        var nombre = "Helmer Alexadner Patiño";
        var empresa = "Global Mentory";
        var dominio = "com.mx";
        
        var cadenaNombreSinEspacios = nombre.replace(' ', '.');
        System.out.println("cadenaNombreSinEspacios = " + cadenaNombreSinEspacios);
        empresa= empresa.toLowerCase();

        System.out.println("empresa = " + empresa);
        var unionempresadominio = empresa.concat(".").concat(dominio);
        System.out.println("unionempresadominio = " + unionempresadominio);
        var correo = cadenaNombreSinEspacios.concat("@").concat(unionempresadominio);
        System.out.println("correo = " + correo);
    }
}
