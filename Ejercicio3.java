package es.ieslosalbares;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cantidad: ");
        int centimos = sc.nextInt();

        int euros = centimos / 100;
        int resto = centimos % 100;

        System.out.println(centimos + " céntimos son " + euros + " euros y " + resto + " céntimos.");
    }
}
