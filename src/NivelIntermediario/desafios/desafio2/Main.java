package NivelIntermediario.desafios.desafio2;

public class Main {
    static void main() {

        NinjaBasico naruto = new NinjaBasico("Naruto", 17, "Modo Sabio");

        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        NinjaAvancado paiDoNaruto = new NinjaAvancado("Pai do Naruto", 38, "Modo sabio", "sair pra comprar cigarro");

        paiDoNaruto.mostrarInformacoes();
        paiDoNaruto.executarHabilidade();



    }
}
