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

        Uzumaki Naruto = new Uzumaki();
        Naruto.nome = "Naruto Uzumaki";
        Naruto.aldeia = "Aldeia da folha";
        Naruto.idade = 19;
        Naruto.ModoSabioAtivado();

        Haruno Sakura = new Haruno();
        Sakura.nome = "Sakura Haruno";
        Sakura.aldeia = "Aldeia da folha";
        Sakura.idade = 17;
        Sakura.AtivarCura();

        Hyuga Hinata = new Hyuga();
        Hinata.nome = "Hinata";
        Hinata.aldeia = "Aldeia da folha";
        Hinata.idade = 18;
        Hinata.byakugan();

        Boruto Boruto = new Boruto();
        Boruto.nome = "Boruto";
        Boruto.aldeia = "Aldeia da folha";
        Boruto.idade = 13;
        Boruto.AtivarOKarma();
        Boruto.AtivarJougan();
        Boruto.ModoSabioAtivado();
    }
}
