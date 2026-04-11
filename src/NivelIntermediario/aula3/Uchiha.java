package NivelIntermediario.aula3;

public class Uchiha extends Ninja implements ShariganInterface{


    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estrategia de batalha");
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial");
    }

    // Esse metodo vem direto da interface!
    public void shariganAtivado() {
        System.out.println(nome + ": Ativou o sharigan");
    }
}
