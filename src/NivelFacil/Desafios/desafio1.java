package NivelFacil.Desafios;

public class desafio1 {
    static void main() {

        // Ninja 1
        String Ninja1 = "Naruto";
        String Missao1 = "Proteger a vila";
        String Status1 = "Completo";
        char Dificuldade1 = 'S';
        int idade1 = 13;

        System.out.println("Nome do terceiro ninja: " + Ninja1);
        System.out.println("Missão do ninja: " + Missao1);
        System.out.println("Status da missão: " + Status1);
        System.out.println("Dificuldade da missão: " + Dificuldade1);
        System.out.println("Idade do ninja: " + idade1);

        if (idade1 < 15) {
            if (Dificuldade1 == 'C' || Dificuldade1 == 'D') {
                Status1 = "Concluida";
            } else {
                Status1 = "Não concluida, idade insuficiente";
            }
        } else {
            Status1 = "Concluido";
        }

        System.out.println(Status1);

        System.out.println("---------------------------------------");

        // Ninja 2
        String Ninja2 = "Zed";
        String Missao2 = "Proteger o mestre";
        String Status2 = "Incompleto";
        char Dificuldade2 = 'D';
        int idade2 = 14;

        System.out.println("Nome do terceiro ninja: " + Ninja2);
        System.out.println("Missão do ninja: " + Missao2);
        System.out.println("Status da missão: " + Status2);
        System.out.println("Dificuldade da missão: " + Dificuldade2);
        System.out.println("Idade do ninja: " + idade2);

        if (idade2 < 15) {
            if (Dificuldade2 == 'C' || Dificuldade2 == 'D') {
                Status2 = "Concluida";
            } else {
                Status2 = "Não concluida, idade insuficiente";
            }
        } else {
            Status2 = "Concluido";
        }

        System.out.println(Status2);

        System.out.println("---------------------------------------");

        // Ninja 3
        String Ninja3 = "Sasuke";
        String Missao3 = "Reconhecimento";
        String Status3 = "Completo";
        char Dificuldade3 = 'S';
        int idade3 = 14;

        System.out.println("Nome do terceiro ninja: " + Ninja3);
        System.out.println("Missão do ninja: " + Missao3);
        System.out.println("Status da missão: " + Status3);
        System.out.println("Dificuldade da missão: " + Dificuldade3);
        System.out.println("Idade do ninja: " + idade3);

        if (idade3 < 15) {
            if (Dificuldade3 == 'C' || Dificuldade3 == 'D') {
                Status3 = "Concluida";
            } else {
                Status3 = "Não concluida, idade insuficiente";
            }
        } else {
            Status3 = "Concluido";
        }

        System.out.println(Status3);

        System.out.println("---------------------------------------");





    }
}
