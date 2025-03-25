import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cuántos teclados vas a comprar: ");
        int cantidad = sc.nextInt();

        int precioUnitario;
        if (cantidad > 8) {
            precioUnitario = 20;
        } else if (cantidad >= 4) {
            precioUnitario = 26;
        } else {
            precioUnitario = 30;
        }

        int total = cantidad * precioUnitario;
        System.out.println("Has comprado " + cantidad + " teclados.");
        System.out.println("Total a pagar: " + total + "€");
    }
}
