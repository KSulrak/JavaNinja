package NivelIntermediario.desafios.desafio1;

import java.util.Scanner;

public class main {
    static void main() {

        /*uchiha Sasuke = new uchiha();
        Sasuke.nome = "Sasuke";
        Sasuke.idade = 17;
        Sasuke.missao = "Reconhecimento";
        Sasuke.statusMissao = "Em andamento";
        Sasuke.nivelDificuldade = "Facil";
        Sasuke.habilidadeEspecial = ("bola de fogo");
        Sasuke.mostrarInformacoes();
*/
        // Abrir o Scanner
        Scanner scanner = new Scanner(System.in);

        // Iniciando o array
        int NUM_MAX = 10;
        String[] ninjas = new String[NUM_MAX];

        // Quantidade de ninjas
        int NinjasMax = 0;
        int opcao = 0;

        while (opcao !=4 ) {
            System.out.println("\n=====================");
            System.out.println("Escolha a opção desejada abaixo:");
            System.out.println("Opção 1: Adicionar um novo ninja");
            System.out.println("Opção 2: Atualizar a habilidade especial dos ninjas");
            System.out.println("Opção 3: Mostrar todas as informações");
            System.out.println("Opção 4: Finalizar o programa");
            System.out.println("=====================");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:

            }
        }






    }
}
