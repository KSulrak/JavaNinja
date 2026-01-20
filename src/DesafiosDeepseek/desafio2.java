package DesafiosDeepseek;

public class desafio2 {
    static void main() {


        // Somando os numeros de 1 a 100
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            soma = soma + i;

        }
        System.out.println(soma);

        // Somandos os numeros pares de 1 a 100
        int somaPar = 0;

        for (int i = 0; i <= 100; i+= 2) {
            somaPar += i;
            
        }
        System.out.println(somaPar);



    }
}
