package studying;

public class arrays2d {
    static void main() {

        String[][] ninjasEAldeia = new String[3][3];

        ninjasEAldeia[0][0] = "Konoha";
        ninjasEAldeia[0][1] = "Naruto";
        ninjasEAldeia[0][2] = "Sasuke";

        ninjasEAldeia[1][0] = "Nevoa";
        ninjasEAldeia[1][1] = "Zabuza";
        ninjasEAldeia[1][2] = "Haku";

        ninjasEAldeia[2][0] = "Deserto";
        ninjasEAldeia[2][1] = "Gaara";
        ninjasEAldeia[2][2] = "Temari";

        for (int i = 0; i < ninjasEAldeia.length; i++) {
            System.out.println("Aldeia: " + ninjasEAldeia[i][0]); System.out.println("Ninja 1: " + ninjasEAldeia[i][1]); System.out.println("Ninja 2: " + ninjasEAldeia[i][2]);

        }



    }
}
