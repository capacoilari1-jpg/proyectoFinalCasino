import java.util.ArrayList;
import java.util.Scanner;

public class ListaCompras {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> compras = new ArrayList<>();
        int opcion;

        do {
            System.out.println("\n--- LISTA DE COMPRAS ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Eliminar producto");
            System.out.println("3. Modificar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    compras.add(scanner.nextLine());
                    break;
                case 2:
                    System.out.print("Índice del producto a eliminar (1 a " + compras.size() + "): ");
                    int idxEliminar = scanner.nextInt() - 1;
                    if (idxEliminar >= 0 && idxEliminar < compras.size()) {
                        compras.remove(idxEliminar);
                        System.out.println("Producto eliminado.");
                    } else {
                        System.out.println("Índice fuera de rango.");
                    }
                    break;
                case 3:
                    System.out.print("Índice a modificar (1 a " + compras.size() + "): ");
                    int idxMod = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if (idxMod >= 0 && idxMod < compras.size()) {
                        System.out.print("Nuevo nombre: ");
                        compras.set(idxMod, scanner.nextLine());
                        System.out.println("Producto modificado.");
                    } else {
                        System.out.println("Índice fuera de rango.");
                    }
                    break;
                case 4:
                    System.out.println("\nLista de Compras:");
                    for (int i = 0; i < compras.size(); i++) {
                        System.out.println((i + 1) + ". " + compras.get(i));
                    }
                    break;
                case 5:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 5);

        scanner.close();
    }
}