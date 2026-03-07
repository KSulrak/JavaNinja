package NivelIntermediario;

public class Main {
    static void main() {

        // Criar ninja Zed - Zed é um objeto
        Ninja Zed = new Ninja();
        Zed.nome = "Zed";
        Zed.aldeia = "Ilha das Sombras";
        Zed.idade = 20;

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da folha";
        Sasuke.idade = 20;
        Sasuke.shariganAtivado();

        Ninja Naruto = new Ninja();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 19;

    }
}
