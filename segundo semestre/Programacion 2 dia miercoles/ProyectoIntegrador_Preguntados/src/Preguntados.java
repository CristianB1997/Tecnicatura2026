import java.util.Scanner;

public class Preguntados {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int opcionMenu = 0;
        int edad;
        String nombre, nivel;
        
        // El puntaje se guarda en un arreglo de un elemento para poder mutarlo por referencia
        int[] puntajeGlobal = {0}; 

        System.out.println("");
        System.out.println("=== BIENVENIDO AL JUEGO TRIVIA ===");
        System.out.print("> Ingrese su nombre: ");
        nombre = leer.nextLine();
        System.out.print("> Ingrese su edad: ");
        edad = leer.nextInt();

        // Determinar el nivel según la edad
        if (edad < 13) {
            nivel = "básico";
        } else if (edad < 18) {
            nivel = "intermedio";
        } else {
            nivel = "avanzado";
        }

        System.out.println("\nHola " + nombre + ", tu nivel es: " + nivel + "\n");

        while (opcionMenu != 6) {
            System.out.println("==================================");
            System.out.println("              TRIVIA");
            System.out.println("==================================");
            System.out.println("1. Trivia General");
            System.out.println("2. Trivia de Matemáticas");
            System.out.println("3. Trivia de Java");
            System.out.println("4. Trivia de JavaScript");
            System.out.println("5. Trivia de Python");
            System.out.println("6. Salir");
            System.out.println("");
            System.out.print("> Elija una opción: ");
            
            opcionMenu = leer.nextInt();
            System.out.println("");

            switch (opcionMenu) {
                case 1:
                    Trivia.triviaGeneral(nivel, puntajeGlobal);
                    break;
                case 2:
                    Trivia.triviaMatematica(nivel, puntajeGlobal);
                    break;
                case 3:
                    Trivia.triviaJava(nivel, puntajeGlobal);
                    break;
                case 4:
                    Trivia.triviaJavaScript(nivel, puntajeGlobal);
                    break;
                case 5:
                    Trivia.triviaPython(nivel, puntajeGlobal);
                    break;
                case 6:
                    System.out.println("¡Gracias por jugar, " + nombre + "!");
                    break;
                default:
                    System.out.println("Opción no válida. Ingrese nuevamente.");
                    Trivia.esperarTecla();
                    break;
            }
        }
    }
}
