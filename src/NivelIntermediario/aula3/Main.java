package NivelIntermediario.aula3;

public class Main {
    static void main() {




        // Obj Uzumaki
        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 16;
        Naruto.habilidadeEspecial();
        Naruto.EstrategiaDeBatalhaNinja();

        // Obj Uchiha
        Uchiha Sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 20, NivelNinja.CHUUNIN);
        Sasuke.habilidadeEspecial();

        // Obj Uchiha 2

        Uchiha Itachi = new Uchiha("Itcha Uchiha", "Aldeia da folha", 27);
        Itachi.habilidadeEspecial();

        // Obj hatake

        Hatake kakashi = new Hatake();
        kakashi.nome = "Kakashi Hatake";
        kakashi.aldeia = "Aldeia da folha";
        kakashi.idade = 48;
        kakashi.boasVindas();
        kakashi.shariganAtivado();
        kakashi.ninjaDeElite();
        kakashi.hokageAtivo();

        // Obj Uchiha 3

        Uchiha madara = new Uchiha("Madara", "Aldeia da folha", 45, 900, NivelNinja.KAGE);
        madara.habilidadeEspecial();
        madara.estrategiaDeBatalhaNinja();


    }
}
