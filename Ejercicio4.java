package es.ieslosalbares;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cantidad: ");
        double salario = sc.nextDouble();
        System.out.print("Introduce complemento: ");
        double complemento = sc.nextDouble();

        double aumento = salario * complemento / 100;
        double salarioFinal = salario + aumento;

        System.out.println("El sueldo base es de " + salario + "€");
        System.out.println("El complemento es del " + complemento + "%");
        System.out.println("El sueldo final es de " + salarioFinal + "€");
    }
}
