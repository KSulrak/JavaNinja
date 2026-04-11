package NivelIntermediario.aula3;

public class Hatake extends Ninja implements ShariganInterface, AnbuInterface{

    public void boasVindas() {
        System.out.println(nome + ": eu sou um Hatake");
    }

    // Metodo da interface
    public void shariganAtivado() {
        System.out.println(nome + ": ativou o sharigan");
    }

    public void ninjaDeElite() {
        System.out.println(nome + ": eu sou um ninja de elite da Anbu");
    }
}
