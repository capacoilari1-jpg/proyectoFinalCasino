import java.util.Random;
import java.util.Scanner;

public class Casinojava {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // Variables iniciales
        int monedas = 100;
        int partidas = 0;
        int victorias = 0;
        int derrotas = 0;

        final int COSTO = 10;

        int opcion;

        do {
            System.out.println("\n============================");
            System.out.println("        CASINO JAVA");
            System.out.println("============================");
            System.out.println("Monedas: " + monedas);
            System.out.println("1. Lanzar dado");
            System.out.println("2. Lanzar moneda");
            System.out.println("3. Tragamonedas");
            System.out.println("4. Ruleta");
            System.out.println("5. Piedra, Papel o Tijera");
            System.out.println("6. Carrera de Caballos");
            System.out.println("7. Ver estadísticas");
            System.out.println("8. Salir");
            System.out.print("Seleccione una opción: ");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1: // Lanzar dado
                    if (monedas < COSTO) {
                        System.out.println("No tienes suficientes monedas para jugar.");
                        break;
                    }

                    monedas -= COSTO;
                    partidas++;

                    System.out.println("\nLanzando dado...");
                    int dado = random.nextInt(6) + 1;
                    System.out.println("Resultado: " + dado);

                    int premioDado = 0;

                    if (dado == 6) {
                        premioDado = 30;
                    } else if (dado == 5) {
                        premioDado = 20;
                    } else if (dado == 4) {
                        premioDado = 10;
                    }

                    if (premioDado > 0) {
                        monedas += premioDado;
                        victorias++;
                        System.out.println("¡Ganaste " + premioDado + " monedas!");
                    } else {
                        derrotas++;
                        System.out.println("No ganaste monedas.");
                    }

                    break;

                case 2: // Lanzar moneda
                    if (monedas < COSTO) {
                        System.out.println("No tienes suficientes monedas para jugar.");
                        break;
                    }

                    monedas -= COSTO;
                    partidas++;

                    System.out.println("\n1. Cara");
                    System.out.println("2. Sello");
                    System.out.print("Elige: ");
                    int eleccion = sc.nextInt();

                    int moneda = random.nextInt(2) + 1;

                    System.out.println("La moneda salió: " + (moneda == 1 ? "Cara" : "Sello"));

                    if (eleccion == moneda) {
                        monedas += 20;
                        victorias++;
                        System.out.println("¡Acertaste! Ganaste 20 monedas.");
                    } else {
                        derrotas++;
                        System.out.println("Fallaste. No ganaste monedas.");
                    }

                    break;

                case 3: // Tragamonedas
                    if (monedas < COSTO) {
                        System.out.println("No tienes suficientes monedas para jugar.");
                        break;
                    }

                    monedas -= COSTO;
                    partidas++;

                    System.out.println("\nGirando tragamonedas...");

                    int s1 = random.nextInt(5) + 1;
                    int s2 = random.nextInt(5) + 1;
                    int s3 = random.nextInt(5) + 1;

                    mostrarSimbolo(s1);
                    mostrarSimbolo(s2);
                    mostrarSimbolo(s3);
                    System.out.println();

                    int premioSlot = 0;

                    if (s1 == s2 && s2 == s3) {
                        premioSlot = 100;
                        System.out.println("¡¡JACKPOT!!");
                    } else if (s1 == s2 || s1 == s3 || s2 == s3) {
                        premioSlot = 30;
                        System.out.println("¡¡Dos iguales!!");
                    }

                    if (premioSlot > 0) {
                        monedas += premioSlot;
                        victorias++;
                        System.out.println("Ganaste " + premioSlot + " monedas.");
                    } else {
                        derrotas++;
                        System.out.println("No obtuviste premio.");
                    }

                    System.out.println("Monedas actuales: " + monedas);
                    break;

                case 4: // Ruleta
                    if (monedas < COSTO) {
                        System.out.println("No tienes suficientes monedas para jugar.");
                        break;
                    }

                    monedas -= COSTO;
                    partidas++;

                    System.out.print("\nApuesta un número (0-36): ");
                    int apuesta = sc.nextInt();

                    int ruleta = random.nextInt(37);

                    System.out.println("La ruleta cayó en: " + ruleta);

                    if (apuesta == ruleta) {
                        monedas += 100;
                        victorias++;
                        System.out.println("¡Ganaste 100 monedas!");
                    } else {
                        derrotas++;
                        System.out.println("No ganaste.");
                    }

                    break;

                case 5: // Piedra Papel Tijera
                    if (monedas < COSTO) {
                        System.out.println("No tienes suficientes monedas para jugar.");
                        break;
                    }

                    monedas -= COSTO;
                    partidas++;

                    System.out.println("\n1. Piedra");
                    System.out.println("2. Papel");
                    System.out.println("3. Tijera");
                    System.out.print("Elige: ");

                    int jugador = sc.nextInt();
                    int pc = random.nextInt(3) + 1;

                    System.out.println("Computadora eligió: " + nombrePPT(pc));

                    if (jugador == pc) {
                        monedas += 10; // devolución
                        System.out.println("Empate. Se te devuelven las 10 monedas.");
                    } else if ((jugador == 1 && pc == 3) ||
                               (jugador == 2 && pc == 1) ||
                               (jugador == 3 && pc == 2)) {

                        monedas += 20;
                        victorias++;
                        System.out.println("¡Ganaste 20 monedas!");
                    } else {
                        derrotas++;
                        System.out.println("Perdiste.");
                    }

                    break;

                case 6: // Carrera de Caballos
                    if (monedas < COSTO) {
                        System.out.println("No tienes suficientes monedas para jugar.");
                        break;
                    }

                    monedas -= COSTO;
                    partidas++;

                    System.out.print("\nElige un caballo (1-5): ");
                    int elegido = sc.nextInt();

                    int c1 = 0, c2 = 0, c3 = 0, c4 = 0, c5 = 0;
                    int meta = 20;
                    int ganador = 0;

                    while (ganador == 0) {

                        c1 += random.nextInt(3) + 1;
                        c2 += random.nextInt(3) + 1;
                        c3 += random.nextInt(3) + 1;
                        c4 += random.nextInt(3) + 1;
                        c5 += random.nextInt(3) + 1;

                        System.out.println("C1:" + c1 + " C2:" + c2 + " C3:" + c3 +
                                           " C4:" + c4 + " C5:" + c5);

                        if (c1 >= meta) ganador = 1;
                        else if (c2 >= meta) ganador = 2;
                        else if (c3 >= meta) ganador = 3;
                        else if (c4 >= meta) ganador = 4;
                        else if (c5 >= meta) ganador = 5;
                    }

                    System.out.println("Ganó el caballo " + ganador);

                    if (elegido == ganador) {
                        monedas += 50;
                        victorias++;
                        System.out.println("¡Tu caballo ganó! +50 monedas.");
                    } else {
                        derrotas++;
                        System.out.println("Tu caballo perdió.");
                    }

                    break;

                case 7: // Estadísticas
                    System.out.println("\n======================");
                    System.out.println("     ESTADÍSTICAS");
                    System.out.println("======================");
                    System.out.println("Monedas actuales: " + monedas);
                    System.out.println("Partidas jugadas: " + partidas);
                    System.out.println("Victorias: " + victorias);
                    System.out.println("Derrotas: " + derrotas);

                    double porcentaje = 0;
                    if (partidas > 0) {
                        porcentaje = (victorias * 100.0) / partidas;
                    }

                    System.out.printf("Porcentaje de victorias: %.2f%%\n", porcentaje);
                    System.out.println("======================");
                    break;

                case 8:
                    System.out.println("\n======================");
                    System.out.println("    FIN DEL CASINO");
                    System.out.println("======================");
                    System.out.println("Monedas finales: " + monedas);
                    System.out.println("Partidas jugadas: " + partidas);
                    System.out.println("Victorias: " + victorias);
                    System.out.println("Derrotas: " + derrotas);
                    System.out.println("Gracias por jugar.");
                    System.out.println("======================");
                    break;

                default:
                    System.out.println("Opción inválida.");
            }

        } while (opcion != 8);

        sc.close();
    }

    // Método para mostrar símbolos del tragamonedas
    public static void mostrarSimbolo(int s) {
        switch (s) {
            case 1:
                System.out.print("[C]");
                break;
            case 2:
                System.out.print("[L]");
                break;
            case 3:
                System.out.print("[U]");
                break;
            case 4:
                System.out.print("[E]");
                break;
            case 5:
                System.out.print("[7]");
                break;
        }
    }

    // Método para Piedra Papel Tijera
    public static String nombrePPT(int n) {
        switch (n) {
            case 1:
                return "Piedra";
            case 2:
                return "Papel";
            case 3:
                return "Tijera";
            default:
                return "";
        }
    }
