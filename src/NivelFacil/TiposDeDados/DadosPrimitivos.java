package NivelFacil.TiposDeDados;

public class DadosPrimitivos {
    static void main() {

        /*
        * Dados Primitivos - int, double, float, char, boolean, short.
        * Objetivo da aula: Criar um ninja - Naruto
        * */

        int idade = 16; // Valor maximo: 2 147 483 647
        double altura = 1.65;
        char inicial = 'N';
        boolean VivoOuMorto = true;
        Long saldoBancario = 999999L; // valor maximo: 9,223,372,036,854,775,807

        System.out.println(idade); // comando para mostrar para o usuario
        System.out.println(saldoBancario);
        System.out.println("saldo bancario é: = " + saldoBancario);
        System.out.println("Minha idade é: " + idade);
    }
}
