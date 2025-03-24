package es.ieslosalbares;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Escribe un valor para la variable num1: ");
        int num1 = sc.nextInt();
        System.out.print("Escribe un valor para variable num2: ");
        int num2 = sc.nextInt();

        int suma = num1 + num2;
        int producto = num1 * num2;
        double cociente = (double) num1 / num2;
        int resto = num1 % num2;

        System.out.println("La suma de " + num1 + " y " + num2 + " es: " + suma);
        System.out.println("El producto de " + num1 + " por " + num2 + " es: " + producto);
        System.out.println("El cociente de dividir " + num1 + " entre " + num2 + " es: " + cociente);
        System.out.println("El resto de dividir " + num1 + " entre " + num2 + " es: " + resto);
    }
}
