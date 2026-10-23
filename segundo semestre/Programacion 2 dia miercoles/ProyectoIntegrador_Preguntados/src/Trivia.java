   import java.util.Scanner;

public class Trivia {

    public static void jugarTrivia(String[] preguntas, String[] respuestas, int[] puntajeGlobal) {
        // Limpieza de consola simulada en Java
        for (int j = 0; j < 50; j++) System.out.println();
        
        System.out.println("=================");
        System.out.println("COMIENZA EL JUEGO");
        System.out.println("=================");
        esperarTecla();

        Scanner leer = new Scanner(System.in);
        int puntajeLocal = 0;

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 50; j++) System.out.println(); // Limpiar pantalla
            
            System.out.println("Pregunta " + (i + 1) + ": " + preguntas[i]);
            System.out.print("> ");
            String respuesta = leer.nextLine();

            // Comparamos ignorando mayúsculas y espacios extra
            if (respuesta.trim().equalsIgnoreCase(respuestas[i].trim())) {
                System.out.println("¡Correcto!");
                puntajeLocal++;
            } else {
                System.out.println("Incorrecto. Respuesta correcta: " + respuestas[i]);
            }
            System.out.println();
            esperarTecla();
        }

        mostrarPuntaje(puntajeLocal);
        puntajeGlobal[0] = puntajeLocal; // Actualizamos el puntaje por referencia simulada
        volverMenu();
    }

    public static void mostrarPuntaje(int puntaje) {
        for (int j = 0; j < 50; j++) System.out.println();
        System.out.println("=================");
        System.out.println(" RESULTADO FINAL");
        System.out.println("=================");
        System.out.println("Puntaje: " + puntaje + " de 10");

        if (puntaje >= 8) {
            System.out.println("¡EXCELENTE, te felicito!");
        } else if (puntaje >= 7) {
            System.out.println("¡BIEN, DEBES ESFORZARTE MÁS!");
        } else {
            System.out.println("¡DEJA EL CELULAR Y ESTUDIA MÁS!");
        }
    }

    public static void volverMenu() {
        esperarTecla();
        for (int j = 0; j < 50; j++) System.out.println();
        System.out.println("Volviendo al menú...");
        esperarTecla();
        for (int j = 0; j < 50; j++) System.out.println();
    }

    public static void esperarTecla() {
        System.out.println("[Presiona Enter para continuar...]");
        Scanner leer = new Scanner(System.in);
        leer.nextLine();
    }

    // --- BANCOS DE PREGUNTAS ---
    
    public static void triviaGeneral(String nivel, int[] puntajeGlobal) {
        String[] preguntas = new String[10];
        String[] respuestas = new String[10];

        if (nivel.equals("básico")) {
            preguntas[0] = "¿Cuánto es 2 + 2?"; respuestas[0] = "4";
            preguntas[1] = "¿Cuánto es 5 + 3?"; respuestas[1] = "8";
            preguntas[2] = "¿Color del cielo?"; respuestas[2] = "azul";
            preguntas[3] = "¿Cuánto es 10 - 5?"; respuestas[3] = "5";
            preguntas[4] = "¿Animal que ladra?"; respuestas[4] = "perro";
            preguntas[5] = "¿Cuánto es 3 + 6?"; respuestas[5] = "9";
            preguntas[6] = "¿Color del pasto?"; respuestas[6] = "verde";
            preguntas[7] = "¿Cuánto es 7 - 2?"; respuestas[7] = "5";
            preguntas[8] = "¿Cuánto es 1 + 1?"; respuestas[8] = "2";
            preguntas[9] = "¿Animal que vuela?"; respuestas[9] = "pájaro";
        } else if (nivel.equals("intermedio")) {
            preguntas[0] = "¿Capital de Argentina?"; respuestas[0] = "buenos aires";
            preguntas[1] = "¿Cuánto es 12 / 3?"; respuestas[1] = "4";
            preguntas[2] = "¿Color mezcla de rojo y azul?"; respuestas[2] = "violeta";
            preguntas[3] = "¿Cuánto es 9 * 2?"; respuestas[3] = "18";
            preguntas[4] = "¿Planeta en el que vivimos?"; respuestas[4] = "tierra";
            preguntas[5] = "¿Cuánto es 15 - 5?"; respuestas[5] = "10";
            preguntas[6] = "¿Idioma de Argentina?"; respuestas[6] = "español";
            preguntas[7] = "¿Cuánto es 6 * 2?"; respuestas[7] = "12";
            preguntas[8] = "¿Animal que maúlla?"; respuestas[8] = "gato";
            preguntas[9] = "¿Cuánto es 20 / 4?"; respuestas[9] = "5";
        } else {
            preguntas[0] = "¿Cuánto es 5 * 6?"; respuestas[0] = "30";
            preguntas[1] = "¿Raíz cuadrada de 81?"; respuestas[1] = "9";
            preguntas[2] = "¿Lenguaje de programación que usas?"; respuestas[2] = "java";
            preguntas[3] = "¿Cuánto es 100 / 4?"; respuestas[3] = "25";
            preguntas[4] = "¿Sistema operativo de Microsoft?"; respuestas[4] = "windows";
            preguntas[5] = "¿Cuánto es 7 * 8?"; respuestas[5] = "56";
            preguntas[6] = "¿Capital de Francia?"; respuestas[6] = "parís";
            preguntas[7] = "¿Cuánto es 9 * 9?"; respuestas[7] = "81";
            preguntas[8] = "Dispositivo para ingresar caracteres"; respuestas[8] = "teclado";
            preguntas[9] = "¿Cuánto es 50 + 25?"; respuestas[9] = "75";
        }
        jugarTrivia(preguntas, respuestas, puntajeGlobal);
    }

    public static void triviaMatematica(String nivel, int[] puntajeGlobal) {
        String[] preguntas = new String[10];
        String[] respuestas = new String[10];

        if (nivel.equals("básico")) {
            preguntas[0] = "¿Cuánto es 5 + 13?"; respuestas[0] = "18";
            preguntas[1] = "¿Cuánto es 12 - 7?"; respuestas[1] = "5";
            preguntas[2] = "¿Cuánto es 4 x 6?"; respuestas[2] = "24";
            preguntas[3] = "¿Cuánto es 18 / 3?"; respuestas[3] = "6";
            preguntas[4] = "¿Cuál es el doble de 9?"; respuestas[4] = "18";
            preguntas[5] = "¿Cuál es la mitad de 20?"; respuestas[5] = "10";
            preguntas[6] = "¿Cuánto es 0 x 22?"; respuestas[6] = "0";
            preguntas[7] = "Cuál es el triple de 3"; respuestas[7] = "9";
            preguntas[8] = "¿Cuánto es 10 x 0?"; respuestas[8] = "0";
            preguntas[9] = "¿Cuánto es 9 + 8?"; respuestas[9] = "17";
        } else if (nivel.equals("intermedio")) {
            preguntas[0] = "¿Cuánto es 15 x 8?"; respuestas[0] = "120";
            preguntas[1] = "¿Cuánto es 72 / 12?"; respuestas[1] = "6";
            preguntas[2] = "¿Cuál es el 25% de 200?"; respuestas[2] = "50";
            preguntas[3] = "¿Cuánto es 7 al cuadrado?"; respuestas[3] = "49";
            preguntas[4] = "¿Cuánto es 3 al cubo?"; respuestas[4] = "27";
            preguntas[5] = "Si un producto cuesta $80 y aumenta un 10% ¿cuál es el nuevo precio?"; respuestas[5] = "88";
            preguntas[6] = "¿Cuál es el siguiente número de la secuencia: 2, 4, 8, 16?"; respuestas[6] = "32";
            preguntas[7] = "¿Cuánto es (5 + 4) x 3?"; respuestas[7] = "27";
            preguntas[8] = "¿Cuánto mide el perímetro de un triángulo con lados de 3, 4 y 5?"; respuestas[8] = "12";
            preguntas[9] = "¿Cuánto es 81 / 9 + 6?"; respuestas[9] = "15";
        } else {
            preguntas[0] = "Si A = {1,2} y B = {2,3} ¿cuántos elementos tendrá su unión?"; respuestas[0] = "3";
            preguntas[1] = "Si A = {1,2,3,4} y B = {3,4,5,6} ¿cuántos elementos tendrá su intersección?"; respuestas[1] = "2";
            preguntas[2] = "Si A = {2,4,6,8} ¿el número 5 pertenece al conjunto? (si/no)"; respuestas[2] = "no";
            preguntas[3] = "¿Cuál es el valor de X en: 2x + 5 = 15?"; respuestas[3] = "5";
            preguntas[4] = "¿Cuánto es 5 factorial (5!)?"; respuestas[4] = "120";
            preguntas[5] = "¿Raíz cuadrada de 144?"; respuestas[5] = "12";
            preguntas[6] = "¿Cuántos grados mide un ángulo recto?"; respuestas[6] = "90";
            preguntas[7] = "¿Cuál es el logaritmo en base 10 de 100?"; respuestas[7] = "2";
            preguntas[8] = "¿Cuánto es 2 elevado a la quinta potencia (2^5)?"; respuestas[8] = "32";
            preguntas[9] = "Si lanzas un dado regular, ¿cuántas caras tiene?"; respuestas[9] = "6";
        }
        jugarTrivia(preguntas, respuestas, puntajeGlobal);
    }

    public static void triviaJavaScript(String nivel, int[] puntajeGlobal) {
        String[] preguntas = new String[10];
        String[] respuestas = new String[10];

        if (nivel.equals("básico") || nivel.equals("intermedio")) {
            preguntas[0] = "¿Con qué palabra reservada se define una clase?"; respuestas[0] = "class";
            preguntas[1] = "¿Qué tipo de dato se usa para texto? (String/int/char)"; respuestas[1] = "String";
            preguntas[2] = "¿Qué método es el punto de entrada de un programa?"; respuestas[2] = "main";
            preguntas[3] = "¿Qué operador se usa para comparar si dos números son iguales? (== o =)"; respuestas[3] = "==";
            preguntas[4] = "¿Cómo se llama el archivo ejecutable compilado de Java? (.exe o .class)"; respuestas[4] = ".class";
            preguntas[5] = "¿Qué tipo de dato almacena verdadero o falso?"; respuestas[5] = "boolean";
            preguntas[6] = "¿Qué palabra se usa para heredar una clase?"; respuestas[6] = "extends";
            preguntas[7] = "¿Con qué comando imprimes en consola con salto de línea? (System.out...)"; respuestas[7] = "println";
            preguntas[8] = "¿Qué tipo de dato entero es más común? (int/double/float)"; respuestas[8] = "int";
            preguntas[9] = "¿Qué palabra define una constante cuyo valor no cambia?"; respuestas[9] = "final";
        } else {
            preguntas[0] = "¿Qué sigla define a la Máquina Virtual de Java?"; respuestas[0] = "JVM";
            preguntas[1] = "¿Cuál es la superclase de la que heredan todas las clases en Java?"; respuestas[1] = "Object";
            preguntas[2] = "¿Qué palabra clave se usa para crear un objeto?"; respuestas[2] = "new";
            preguntas[3] = "¿Cómo se le llama a ocultar los datos internos de una clase?"; respuestas[3] = "encapsulamiento";
            preguntas[4] = "¿Qué palabra se usa para capturar excepciones? (try o catch)"; respuestas[4] = "catch";
}


