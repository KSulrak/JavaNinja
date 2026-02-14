package DesafiosExtra;

import java.util.Scanner;

public class notasMais {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantas notas você quer calcular? ");
        int notasQuantidade = scanner.nextInt();

        double[] notas = new double[notasQuantidade];

        for (int i = 0; i < notasQuantidade; i++) {
            System.out.println("Insira a nota: " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        double soma = 0;
        for (int i = 0; i < notasQuantidade; i++) {
            soma = soma + notas[i];
        }

        double media = soma / notasQuantidade;

        double maior = notas[0];
        double menor = notas[0];

        for (int i = 1; i < notasQuantidade; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        System.out.println("\n=== RESULTADOS ===");
        System.out.println("Total de notas: " + notasQuantidade);

        System.out.print("Notas digitadas: ");
        for (int i = 0; i < notasQuantidade; i++) {
            System.out.print(notas[i] + "  ");
        }

        System.out.println("\nSoma das notas: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior nota: " + maior);
        System.out.println("Menor nota: " + menor);

        scanner.close();

    }
}
