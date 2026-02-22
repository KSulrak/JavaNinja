package NivelFacil.Condicoes;

public class IFeELSE {
    static void main() {

        /*
        * If e Else - confições
        * Else If
        * Objetivo: Passar o ninja de nivel de acordo com o numero de missoes
        * */


        // Ninja - Naruto
        String nome = "Naruto";
        String rank;
        int idade = 14;
        boolean hokage = false;
        short NumeroDeMissoes = 9;

        /*
        * If (confição) {resultado}
        * Else If (condição) {resultado}
        * Else {resultado caso nada seja verdadeiro}
        * */


        // se (confição) {faça isso}
        if (NumeroDeMissoes == 10&& idade > 15 ) {
            System.out.println("Rank: Chunnin");
        } else if (NumeroDeMissoes >= 20) {
            System.out.println("Rank: Jounin");
        } else {
            System.out.println("Rank: Gennin");
        }



    }
}
