package NivelIntermediario.desafios.desafio4;

public class BancoKonoha{

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor) {
        if (origem.saldo >= valor) {
            origem.saldo -= valor;
            destino.saldo += valor;

            System.out.println("Transferencia realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public void transferir(ContaBancaria origem, ContaBancaria destino, double valor, double taxa) {
        double valorComTaxa = valor + taxa;

        if (origem.saldo >= valorComTaxa) {
            origem.saldo -= valorComTaxa;
            destino.saldo += valor;

            System.out.println("Transferencia com taxa realizada!");
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
