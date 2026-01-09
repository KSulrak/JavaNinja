package Condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    static void main() {

        /*
        * SwitchCases: que servem para gerar casos especificos
        * Objetivo: pedir pro usuario escolher entre os ninjas
        * */


        // Pedir para o usuario
        Scanner scanner = new Scanner(System.in);

        // mostrar opções para o usuario
        System.out.println("Escolha um personagem: ");
        System.out.println("1 - Naruto");
        System.out.println("2 - Zed");
        System.out.println("3 - Akali");

        // pedir para o usuario escolher uma opção
        int escolhaDoUsuario = scanner.nextInt();

        System.out.println("Você digitou o numero: " + escolhaDoUsuario);

        // Reaçõa ao escolher um personagem

        switch (escolhaDoUsuario) {
            case 1:
                System.out.println("O usuario escolheu o Naruto");
                break;
            case 2:
                System.out.println("O usuario escolheu o Zed");
                break;
            case 3:
                System.out.println("O usuario escolheu a Akali");
                break;
            default:
                System.out.println("Você não digitou uma reposta valida, tente de novo!");
        }

        // Fechar a caixa
        scanner.close();

    }
}
