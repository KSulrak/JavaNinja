package NivelIntermediario;

public class Main {
    static void main() {

        // Criar ninja Zed - Zed é um objeto
        Ninja Zed = new Ninja();

        Zed.nome = "Zed";
        Zed.aldeia = "Ilha das Sombras";
        Zed.idade = 20;


        // Criar ninja Sasuke Uchiha - Sasuke é um objeto

        Ninja Sasuke = new Ninja();

        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.aldeia = "Aldeia da Folha";
        Sasuke.idade = 71;


        // Aplicando metodo aos meus objetos
        Sasuke.shariganAtivado();
        String chamandoMetodo = Sasuke.EuSouUmNinja();
        System.out.println(chamandoMetodo);

        int quantoTempoFalta = Sasuke.anosParaSeTornarHokage(70);
        System.out.println("Você tem: " + Sasuke.idade + " anos " + "faltam " + quantoTempoFalta + " anos para poder se tornar hokage!");


    }
}
