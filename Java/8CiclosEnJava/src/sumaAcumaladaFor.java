public class sumaAcumaladaFor {
    public static void main(String[] args) {
        var suma = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.println("la suma entre ->" + i + " + " + suma + " = " + (suma + i));
            suma += i;
        }
        System.out.println("suma total: " + suma);
    }
}
