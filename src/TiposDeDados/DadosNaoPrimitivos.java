package TiposDeDados;

public class DadosNaoPrimitivos {
    static void main() {

        /*
        * Dados não primitivos: String, Array, Class, enum
        * Objetivo: Criar um ninja, e atribuir metodos a ele.
        * */

        String nome = "Naruto";
        String nomeUpperCase = nome.toUpperCase(); // toUpperCase vai deixar tudo em CAPSLOCK
        System.out.println("nome em CAPSLOCK é: " + nomeUpperCase);
        System.out.println("nome sem CAPSLOCK é: " + nome);

        String aldeia = "Aldeia da Folha";
        String aldeiaLowerCase = aldeia.toLowerCase(); // toLowerCase vai remover o CAPSLOCK
        System.out.println(aldeiaLowerCase);
    }
}
