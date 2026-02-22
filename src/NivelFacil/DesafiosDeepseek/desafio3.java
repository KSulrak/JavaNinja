package NivelFacil.DesafiosDeepseek;

import java.util.Scanner;

public class desafio3 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.print ("Digite aqui seu numero para verificar se é par ou impar: ");
        int numeroParouImpar = scanner.nextInt();

        if (numeroParouImpar % 2 == 0) {
            System.out.println("o seu numero é par");
        } else {
            System.out.println("Seu numero é impar");
        }


        scanner.close();

    }
}
