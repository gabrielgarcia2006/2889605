package es.ieslosalbares;
import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día de la semana: ");
        int dia = sc.nextInt();

        if (dia == 1) {
            System.out.println("El 1º día de la semana es Lunes.");
        } else if (dia == 2) {
            System.out.println("El 2º día de la semana es Martes.");
        } else if (dia == 3) {
            System.out.println("El 3º día de la semana es Miércoles.");
        } else if (dia == 4) {
            System.out.println("El 4º día de la semana es Jueves.");
        } else if (dia == 5) {
            System.out.println("El 5º día de la semana es Viernes.");
        } else if (dia == 6) {
            System.out.println("El 6º día de la semana es Sábado.");
        } else if (dia == 7) {
            System.out.println("El 7º día de la semana es Domingo.");
        } else {
            System.out.println("Número no válido. Debe ser entre 1 y 7.");
        }
    }
}
