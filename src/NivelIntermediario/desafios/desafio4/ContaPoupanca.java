package NivelIntermediario.desafios.desafio4;

public class ContaPoupanca extends ContaCorrente{


    @Override
    public void depositar(double valor) {
        double taxa = 0.01;
        double valorLiquido = valor * (1 - taxa);

        saldo += valorLiquido;
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }
}
