import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] edades = new int[10];

        for (int i = 0; i < edades.length; i++) {
            System.out.print("Ingrese edad " + (i + 1) + ": ");
            edades[i] = scanner.nextInt();
        }

        int mayor = edades[0];
        int menor = edades[0];
        int suma = 0;

        for (int edad : edades) {
            if (edad > mayor) mayor = edad;
            if (edad < menor) menor = edad;
            suma += edad;
        }

        double promedio = (double) suma / edades.length;

        System.out.println("\nEdad mayor: " + mayor);
        System.out.println("Edad menor: " + menor);
        System.out.println("Promedio: " + promedio);
        scanner.close();
    }
}