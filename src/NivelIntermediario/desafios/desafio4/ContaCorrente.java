package NivelIntermediario.desafios.desafio4;

public class ContaCorrente extends ContaBancaria {



    @Override
    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Você depositou: " + valor);
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Você tem: " + saldo);
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }
}
