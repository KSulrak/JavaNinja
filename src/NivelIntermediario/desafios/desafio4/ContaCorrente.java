package NivelIntermediario.desafios.desafio4;

public class ContaCorrente extends ContaBancaria {

    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println(nome + "Você depositou: " + valor);
    }

    @Override
    public void consultarSaldo() {
        System.out.println(nome + "Seu saldo é de: " + saldo);
    }

    public ContaCorrente(String nome, String aldeia, int idade, double saldo) {
        super(nome, aldeia, idade, saldo, TipoConta.CORRENTE);
    }
}
