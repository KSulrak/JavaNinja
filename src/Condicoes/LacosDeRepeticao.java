package Condicoes;

public class LacosDeRepeticao {
    static void main() {

        /*
        * Laços de repetição: Vão repetir infinitamente ou ate você antigir o paramentro desejado
        * WHILE = FOR
        * */

        // While
        // While (condição) {tudo aqui vai acontecer}

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;

        while (numeroDeClones <= numeroMaximoDeClones) {
            numeroDeClones++;
            System.out.println("O Naruto fez um clones! " + numeroDeClones) ;
        }

        // FOR
        for (int i = 0; i <= numeroMaximoDeClones ; i++) {
            System.out.println("O naruto ja fez: " + i);
        }




    }
}
