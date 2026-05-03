package NivelIntermediario.desafios.desafio4;

public class main {
    static void main() {

        ContaCorrente naruto = new ContaCorrente("Naurto Uzumaki", "Konoha", 20, 0);

        naruto.depositar(200);
        naruto.depositar(100);
        naruto.consultarSaldo();

        ContaPoupanca sasuke = new ContaPoupanca("Sasuke Uchiha", "Konoha", 21, 0);

        sasuke.depositar(200);
        sasuke.depositar(400);
        sasuke.consultarSaldo();

        BancoKonoha banco = new BancoKonoha();

        banco.transferir(naruto, sasuke, 200);

        naruto.consultarSaldo();
        sasuke.consultarSaldo();

    }
}
