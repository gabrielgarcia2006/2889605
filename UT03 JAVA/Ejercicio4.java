import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce la nota de la primera prueba: ");
        double nota1 = sc.nextDouble();
        System.out.print("Introduce la media deseada: ");
        double mediaDeseada = sc.nextDouble();

        double nota2 = (mediaDeseada - 0.4 * nota1) / 0.6;

        System.out.println("Para tener una media de " + mediaDeseada + ", necesitas sacar " + nota2 + " en la segunda prueba.");
    }
}
