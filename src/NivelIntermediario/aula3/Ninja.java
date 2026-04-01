package NivelIntermediario.aula3;

public abstract class Ninja implements EstrategiaDeBatalha {

    String nome;
    String aldeia;
    int idade;

    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial");
    }


    // Sobreescrevendo o metodo da interface
    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estrategia de batalha");
    }

}
