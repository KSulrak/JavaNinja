package studying;

public class Arrays {
    static void main() {

        // Arrays são do tipo referencia!
        // String inicializam com null
        String[] ninja = new String[5];
        ninja[0] = "Naruto";
        ninja[1] = "Zed";
        ninja[2] = "Akali";
        ninja[3] = "Kakashi";
        System.out.println(ninja[4]);

        // Redeclarar o array
        ninja = new String[7];
        ninja[0] = "Shen";
        ninja[1] = "Tsunade";
        ninja[2] = "Sasuke";
        ninja[3] = "Naruto Uzumaki";
        ninja[4] = "Gaara";
        ninja[5] = "kakashi";
        ninja[6] = "Sakura";

        // For para fazer um loop no array
        for (int i = 0; i < 7; i++) {
            System.out.println(ninja[i]);
        }

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
