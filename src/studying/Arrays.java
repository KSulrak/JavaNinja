package studying;

public class Arrays {
    static void main() {

        // Arrays são do tipo referencia!
        // String inicializam com null
        String[] ninja = new String[4];
        ninja[0] = "Naruto";
        ninja[1] = "Zed";
        ninja[2] = "Akali";
        ninja[3] = "Kakashi";

        // int inicializam com 0
        int[] idade = new int[2];
        System.out.println(idade[1]);

        // boolean inicializam com false
        boolean[] verdadeiroOuFalso = new boolean[1];
        System.out.println(verdadeiroOuFalso[0]);

        // Double inicializam com 0.0
        double[] flutuante = new double[1];
        System.out.println(flutuante[0]);


    }
}
