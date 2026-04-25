package NivelIntermediario.aula3;

public class Uchiha extends Ninja implements ShariganInterface{


    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void estrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estrategia de batalha");
    }

    // Sobreescrever o metodo da classe Ninja
    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial. Ja conclui: " + numeroDeMissoesConcluidas);
    }

    // Esse metodo vem direto da interface!
    public void shariganAtivado() {
        System.out.println(nome + ": Ativou o sharigan");
    }

    @Override
    public void inteligenciaDeCombate() {
        System.out.println(nome + " Essa é minha inteligencia de combate");
    }

    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + "  e você é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + "  e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + "  e você precisa treinar mais suas estrategias");
        }
    }

    // É uma padronização do java! 
    @Override
    public void metodoProvisorio() {
        System.out.println("Teste na classe Uchiha");
    }


}
