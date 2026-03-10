package NivelIntermediario.desafios.desafio1;

public class uchiha extends ninja {

    String habilidadeEspecial;

    public void mostrarHabilidade() {
        System.out.println("A Habilidade especial " + habilidadeEspecial + " ativou!");
    }


    /* versão com @Override
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidade();
    }

     */

    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Missão: " + missao);
        System.out.println("Nivel de dificuldade: " + nivelDificuldade);
        System.out.println("Status da missão: " + statusMissao);
        System.out.println("Habilidade especial uchiha");

    }


}
