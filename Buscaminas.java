import java.util.Random;

public class Buscaminas {
    public static void main(String[] args) {
        char[][] tablero = new char[5][5];
        Random random = new Random();

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                tablero[i][j] = random.nextBoolean() ? 'X' : '*';
            }
        }

        System.out.println("--- Buscaminas ---");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}