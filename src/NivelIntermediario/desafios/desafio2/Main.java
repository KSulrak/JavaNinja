package NivelIntermediario.desafios.desafio2;

public class Main {
    static void main() {

        Ninja naruto = new NinjaBasico("Naruto", 18, "Modo Sábio");
        Ninja minato = new NinjaAvancado("Minato", 38, "Hiraishin", "Rasengan");

        naruto.mostrarInformacoes();
        naruto.executarHabilidade();

        System.out.println("---------------");

        minato.mostrarInformacoes();
        minato.executarHabilidade();
    }
}
