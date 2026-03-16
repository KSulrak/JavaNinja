package NivelIntermediario.aula2;

public class Hokages {

    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;


    // No args constructor
    public Hokages() {
        // Construtor vazio, sem argumentos
    }

        // Croar um construtor com argumentos
        public Hokages(String nome) {
            this.nome = nome;
        }

        public Hokages(int idade) {
            this.idade = idade;
        }


        // all args constructor = construtor com todos os argumentos
        public Hokages(String nome, int idade, boolean vivoOuNao) {
            this.nome = nome;
            this.idade = idade;
            this.vivoOuNao = vivoOuNao;
        }


        // usando o comando "Ctrl + n" para criar todos os construtores rapidamente
    public Hokages(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes, double saldoBancario, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
        this.saldoBancario = saldoBancario;
        this.altura = altura;
    }
}
