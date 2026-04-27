package NivelIntermediario.aula3;

public class Main {
    static void main() {

        System.out.println("----------------Naruto Uzumaki----------------");
        Uzumaki naruto = new Uzumaki("Naruto Uzumaki", "Aldeia da folha", 16, 30, NivelNinja.JOUNIN);
        System.out.println(naruto);


        System.out.println("----------------Sasuke Uchiha----------------");
        Uchiha sasuke = new Uchiha("Sasuke Uchiha", "Aldeia da folha", 18, 50, NivelNinja.JOUNIN);
        System.out.println(sasuke);
    }
}
