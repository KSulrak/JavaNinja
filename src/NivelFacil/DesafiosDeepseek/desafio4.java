package NivelFacil.DesafiosDeepseek;

import java.util.Scanner;

public class desafio4 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro numero: ");
        int numeroUm = scanner.nextInt();
        System.out.println("Digite o segundo numero: ");
        int numeroDois = scanner.nextInt();

        if (numeroUm > numeroDois) {
            System.out.println(numeroUm + " é maior");
        } else if (numeroDois == numeroUm) {
            System.out.println("Os numeros são iguais!");
        } else {
            System.out.println(numeroDois + " é maior");
        }

        scanner.close();
    }
}
