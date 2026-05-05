package NivelIntermediario.aula3;

public abstract class Ninja implements EstrategiaDeBatalha {

    //TODO: Incluir novos 2 novos atributos: numeroDeMissoesConcluidas , rank
    //TODO: Rank: Gennin, Chunnin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;
    final double altura = 2.10;

    public Ninja() {
    }

    // TODO NINJA VAI FAZER OBRIGATORIAMENTE
    final void tacarKunai() {
        System.out.println("EU SOU UM METODO DA CLASSE MÃE");
    }

    // Metodo existente: Primeiro metodo
    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // TODO Sobrecarga do construtor chamando os novos atributos
    // TODO Sobregarga de metodo você não redeclarar o construtor so os novos atributos

    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    public void habilidadeEspecial() {
        System.out.println("Meu nome é: " + nome + " e esse é meu ataque especial");
    }


    // Sobreescrevendo o metodo da interface
    @Override
    public void EstrategiaDeBatalhaNinja() {
        System.out.println("Essa é minha estrategia de batalha");
    }

    // Inteligencia de combate - metodo padrão

    public void inteligenciaDeCombate() {
        System.out.println(nome + " Essa é minha inteligencia de combate");
    }

    // Sobrecarga de motodo - Sobrecarga de metodo

    public void inteligenciaDeCombate(int qi) {
        if (qi > 150) {
            System.out.println("Seu QI é: " + qi + "  e você é um genio");
        } else if (qi >= 130) {
            System.out.println("Seu QI é: " + qi + "  e você é um ninja promissor");
        } else {
            System.out.println("Seu QI é: " + qi + "  e você precisa treinar mais suas estrategias");
        }
    }

    // Metodo sem Override
    public void metodoProvisorio() {
        System.out.printf("Teste na classe ninja");
    }

    @Override
    public String toString() {
        return "Meu nome é: " + nome + " sou da: " + aldeia + " e eu tenho: " + idade + " anos!";
    }
}
