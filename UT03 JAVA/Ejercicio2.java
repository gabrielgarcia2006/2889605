import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce tu edad: ");
        int edad = sc.nextInt();
        System.out.print("Introduce tu género (V o M): ");
        char genero = sc.next().toUpperCase().charAt(0);

        int precio = 0;

        if (genero == 'V') {
            if (edad < 30) {
                precio = 450;
            } else if (edad <= 50) {
                precio = 400;
            } else {
                precio = 350;
            }
        } else if (genero == 'M') {
            if (edad < 25) {
                precio = 400;
            } else {
                precio = 350;
            }
        }

        System.out.println("El precio de tu seguro es: " + precio + "€");
    }
}
