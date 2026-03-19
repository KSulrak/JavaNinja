package NivelIntermediario.aula3;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    // Metodo abstrato
    public abstract void nomeDoNinja();

    // Metodo não abstrato
    public void tacarKunai() {
        System.out.println("Eu joguei uma kunai!");
    }


}
