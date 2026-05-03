package NivelIntermediario.desafios.desafio4;

public class ContaPoupanca extends ContaBancaria{

    @Override
    public void depositar(double valor) {
        double valorFinal = valor * 0.99;
        saldo += valorFinal;
        System.out.println(nome + "Você depositou: " + valorFinal);
    }

    @Override
    public void consultarSaldo() {
        System.out.println(nome + " Seu saldo é de: " + saldo);
    }

    public ContaPoupanca(String nome, String aldeia, int idade, double saldo) {
        super(nome, aldeia, idade, saldo, TipoConta.POUPANCA);
    }
}
