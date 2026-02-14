package DesafiosExtra;

import java.util.Scanner;

public class notas {
    static void main() {

        // abrir scanner
        Scanner scanner = new Scanner(System.in);

        // inserir as notas
        System.out.print("Insira a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double nota2 = scanner.nextDouble();

        double somaFinal = (nota1 + nota2) / 2;

        System.out.println("Sua media é: " + somaFinal);

        scanner.close();
    }
}
