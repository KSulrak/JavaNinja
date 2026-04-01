package NivelIntermediario.aula3;

public class Uchiha extends Ninja{


    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estrategia de batalha");
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial");
    }

}
