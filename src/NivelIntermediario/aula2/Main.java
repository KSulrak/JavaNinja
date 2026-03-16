package NivelIntermediario.aula2;

public class Main {
    static void main() {

        Hokages tobirama = new Hokages("Tobirama");
        System.out.println(tobirama.nome);


        Hokages hiruzen = new Hokages(40);
        System.out.println(hiruzen.idade);

        Hokages minato = new Hokages("Minato", 32, false);



    }
}
