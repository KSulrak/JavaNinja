package NivelIntermediario.aula3;

public interface NinjaInterface {

    // Tudo é automaticamente FINAL
    // Não é possivel setar os valores depois

    String nome = "Naruto Uzumaki";
    String aldeia = "Aldeia da folha";
    int idade = 16;

    // Ele é obrigatoriamente abstrato
    public void tacaUmaShuriken();

}
