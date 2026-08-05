import java.util.Scanner;

public class Registrar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[10];

        for (int i = 0; i < edades.length; i++) {
            System.out.print("Ingrese edad " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        System.out.println("\nEdades registradas:");
        for (int edad : edades) {
            System.out.println(edad);
        }
        scanner.close();
    }
}