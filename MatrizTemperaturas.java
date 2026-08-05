import java.util.Scanner;

public class MatrizTemperaturas{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] temperaturas = new double[4][7];

        for (int semana = 0; semana < 4; semana++) {
            System.out.println("--- Registro Semana " + (semana + 1) + " ---");
            for (int dia = 0; dia < 7; dia++) {
                System.out.print("Día " + (dia + 1) + ": ");
                temperaturas[semana][dia] = scanner.nextDouble();
            }
        }

        System.out.println("\n--- Tabla de Temperaturas ---");
        for (int semana = 0; semana < 4; semana++) {
            System.out.print("Semana " + (semana + 1) + ": ");
            for (int dia = 0; dia < 7; dia++) {
                System.out.print(temperaturas[semana][dia] + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}