package NivelIntermediario.desafios.desafio4;

public class Main {
    static void main() {

        ContaCorrente naruto = new ContaCorrente(0);
        naruto.depositar(200);
        naruto.consultarSaldo();


        ContaPoupanca sasuke = new ContaPoupanca(0);
        sasuke.depositar(200);
        sasuke.consultarSaldo();

    }
}
