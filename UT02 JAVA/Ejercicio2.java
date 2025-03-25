import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("¿Qué nota has obtenido? ");
        double nota = sc.nextDouble();

        if (nota >= 0 && nota < 3) {
            System.out.println("Vaya, eso es un Muy Deficiente.");
        } else if (nota >= 3 && nota < 5) {
            System.out.println("Vaya, eso es un Insuficiente.");
        } else if (nota >= 5 && nota < 6) {
            System.out.println("Eso es un Bien.");
        } else if (nota >= 6 && nota < 9) {
            System.out.println("Eso es un Notable.");
        } else if (nota >= 9 && nota <= 10) {
            System.out.println("¡Eso es un Sobresaliente!");
        } else {
            System.out.println("Nota no válida.");
        }
    }
}
