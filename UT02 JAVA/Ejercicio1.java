import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el día de tu nacimiento: ");
        int dia = sc.nextInt();
        System.out.print("Introduce el mes de tu nacimiento: ");
        int mes = sc.nextInt();
        System.out.print("Introduce el año de tu nacimiento: ");
        int anio = sc.nextInt();

        int diaActual = 8;
        int mesActual = 10;
        int anioActual = 2022;

        int edad = anioActual - anio;
        if (mes > mesActual || (mes == mesActual && dia > diaActual)) {
            edad--;
        }

        System.out.println("Hoy es " + diaActual + "-" + mesActual + "-" + anioActual + ", por lo tanto tienes " + edad + " años.");
    }
}
