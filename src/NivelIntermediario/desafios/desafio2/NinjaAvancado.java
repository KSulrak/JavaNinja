package NivelIntermediario.desafios.desafio2;

public class NinjaAvancado implements Ninja{

    String nome;
    int idade;
    String habilidade;
    String especialidade;


    public NinjaAvancado(String nome, int idade, String habilidade, String especialidade) {
        this.nome = nome;
        this.idade = idade;
        this.habilidade = habilidade;
        this.especialidade = especialidade;
    }

    @Override
    public void mostrarInformacoes() {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(habilidade);
        System.out.println(especialidade);
    }

    @Override
    public void executarHabilidade() {
        System.out.println("usou " + habilidade);
        System.out.println("tambem usou " + especialidade);
    }
}
