package DesafiosExtra;

import java.util.Scanner;

public class notasMais {
    static void main() {

        // abrir o scanner
        Scanner scanner = new Scanner(System.in);

        // declarar quantas notas quer calcular
        System.out.println("Quantas notas você quer calcular? ");
        int notasQuantidade = scanner.nextInt();

        // array onde sera armazenado as notas com quantia maxima que sera calculada
        double[] notas = new double[notasQuantidade];

        // laço de repetição onde o usuaria vai inserir todas as notas
        for (int i = 0; i < notasQuantidade; i++) {
            System.out.println("Insira a nota: " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // soma dos valores e armazenando no array
        double soma = 0;
        for (int i = 0; i < notasQuantidade; i++) {
            soma = soma + notas[i];
        }

        // criando a media das notas
        double media = soma / notasQuantidade;

        // declarando a variavel da maior e menor nota começando no index 0
        double maior = notas[0];
        double menor = notas[0];

        // laço para descobrir qual é a maior nota e a menor usando if-else
        for (int i = 1; i < notasQuantidade; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }


        // printando todos os valores e mostrando o resultado final da media
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


        // fechando o scanner
        scanner.close();

    }
}
