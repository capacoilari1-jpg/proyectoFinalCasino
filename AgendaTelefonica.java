import java.util.ArrayList;
import java.util.Scanner;

public class AgendaTelefonica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> agenda = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- AGENDA TELEFÓNICA ---");
            System.out.println("1. Agregar contacto");
            System.out.println("2. Mostrar contactos");
            System.out.println("3. Buscar contacto");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del contacto: ");
                    String nombre = scanner.nextLine();
                    agenda.add(nombre);
                    System.out.println("Contacto agregado.");
                    break;
                case 2:
                    System.out.println("\nContactos:");
                    for (String contacto : agenda) {
                        System.out.println("- " + contacto);
                    }
                    break;
                case 3:
                    System.out.print("Nombre a buscar: ");
                    String buscar = scanner.nextLine();
                    if (agenda.contains(buscar)) {
                        System.out.println("El contacto existe en la agenda.");
                    } else {
                        System.out.println("Contacto no encontrado.");
                    }
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (opcion != 4);

        scanner.close();
    }
}