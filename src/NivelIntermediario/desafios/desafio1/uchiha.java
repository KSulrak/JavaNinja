package NivelIntermediario.desafios.desafio1;

public class uchiha extends ninja {

    String habilidadeEspecial;

    public void mostrarHabilidade() {
        System.out.println("A Habilidade especial " + habilidadeEspecial + " ativou!");
    }

    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes();
        mostrarHabilidade();
    }
}
