import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int aciertos = 0;

        System.out.println("1. ¿Cuál es la capital de Francia?");
        System.out.println("a) Madrid");
        System.out.println("b) Berlín");
        System.out.println("c) París");
        System.out.print("Tu respuesta: ");
        char r1 = sc.next().toLowerCase().charAt(0);
        if (r1 == 'c') aciertos++;

        System.out.println("2. ¿Cuánto es 5 x 6?");
        System.out.println("a) 30");
        System.out.println("b) 20");
        System.out.println("c) 25");
        System.out.print("Tu respuesta: ");
        char r2 = sc.next().toLowerCase().charAt(0);
        if (r2 == 'a') aciertos++;

        System.out.println("3. ¿Cuál es el elemento químico del agua?");
        System.out.println("a) CO2");
        System.out.println("b) H2O");
        System.out.println("c) O2");
        System.out.print("Tu respuesta: ");
        char r3 = sc.next().toLowerCase().charAt(0);
        if (r3 == 'b') aciertos++;

        System.out.println("Has acertado " + aciertos + " de 3 preguntas.");
    }
}
