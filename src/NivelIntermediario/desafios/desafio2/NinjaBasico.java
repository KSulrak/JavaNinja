package NivelIntermediario.desafios.desafio2;

public class NinjaBasico implements Ninja{

    String nome;
    int idade;
    String habilidade;

    public NinjaBasico(String nome, int idade, String habilidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Habilidade basica: " + habilidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println(nome + " usou sua habilidade basica: " + habilidade);
    }

}
