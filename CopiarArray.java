import java.util.Arrays;
import java.util.Scanner;

public class CopiarArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] original = new int[10];

        System.out.println("Ingrese 10 números:");
        for (int i = 0; i < original.length; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            original[i] = scanner.nextInt();
        }

        int[] copia = Arrays.copyOf(original, original.length);

        System.out.println("\nArray original:");
        for (int n : original) System.out.print(n + " ");

        System.out.println("\nArray copia:");
        for (int n : copia) System.out.print(n + " ");
        
        scanner.close();
    }
}