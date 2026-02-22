package NivelFacil.Condicoes;

public class Ternarios {
    static void main() {


        /*
         * Ternarios: Sâo maneiras de reduzir o codigo
         * variavel = (condição) ? valorSeVerdadeiro: valorFalso;
         * */



        short numeroDeMissoes = 9;
        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse Ninja esta com mais de 10 missões" : "Esse ninja tem menos de 10 missões";
        System.out.println(nivelDoNinja);


    }
}
