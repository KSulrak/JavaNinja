package DesafiosDeepseek;

import java.util.Scanner;

public class calculadorDeViagem {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distancia da sua viagem (Km): ");
        double km = scanner.nextDouble();

        System.out.print("Digite o consumo do carro (Km/K): ");
        double consumo = scanner.nextDouble();

        System.out.print("Digite o preço do combustivel (R$): ");
        double combustivel = scanner.nextDouble();


        double litrosTotal = km / consumo;
        double custoTotal = litrosTotal * combustivel;
        double tanques = litrosTotal / 50;

        System.out.println("Litros necessarios: " + litrosTotal);
        System.out.println("Custo total: " + custoTotal);
        System.out.println("Tanques: " + tanques);


        scanner.close();

    }
}
