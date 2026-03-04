package NivelIntermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    /*
    * O metodo VOID não retorna valor nenhum
    * */

    // Criar um metodo publico personalizado
    public void shariganAtivado() {
        System.out.println("O Sharigan ativou!");
    }

    /*
    * Metodo String vai ter que retornar uma string
    * */

    public String EuSouUmNinja() {
        return "Oi, Eu sou um ninja!";
    }

    /*
    * Metodo Int que vai retornar um int
    * */


    //
    public int anosParaSeTornarHokage(int idadeMinimaParaSerHokage) {
        return idadeMinimaParaSerHokage - idade;
    }

}
