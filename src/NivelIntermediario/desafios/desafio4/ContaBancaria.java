package NivelIntermediario.desafios.desafio4;

public abstract class ContaBancaria implements Conta {

    protected String nome;
    protected String aldeia;
    protected int idade;
    protected double saldo;
    protected TipoConta tipoConta;

    @Override
    public abstract void depositar(double valor);

    @Override
    public abstract void consultarSaldo();

    public ContaBancaria(String nome, String aldeia, int idade, double saldo, TipoConta tipoConta) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
        this.saldo = saldo;
        this.tipoConta = tipoConta;
    }
}
