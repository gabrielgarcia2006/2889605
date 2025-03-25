import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Introduce horas trabajadas esta semana: ");
        double horas = sc.nextDouble();

        double tarifaNormal = 20;
        double tarifaExtra = tarifaNormal * 1.5;
        double horasNormales = Math.min(35, horas);
        double horasExtras = Math.max(0, horas - 35);

        double salarioBruto = (horasNormales * tarifaNormal) + (horasExtras * tarifaExtra);

        double impuestos = 0;
        if (salarioBruto > 700) {
            impuestos += (salarioBruto - 700) * 0.45;
            impuestos += 350 * 0.25;
        } else if (salarioBruto > 350) {
            impuestos += (salarioBruto - 350) * 0.25;
        }

        double salarioNeto = salarioBruto - impuestos;

        System.out.println("Hola, " + nombre + " esta semana has trabajado " + horasNormales + " horas a " + tarifaNormal + "€ y " + horasExtras + " horas a " + tarifaExtra + "€.");
        System.out.println("Tu salario bruto es de " + salarioBruto + "€.");
        System.out.println("Parte del salario sin impuestos: 350€.");
        if (salarioBruto > 700) {
            System.out.println("Parte del salario al 25%: 350€.");
            System.out.println("Parte del salario al 45%: " + (salarioBruto - 700) + "€.");
        } else if (salarioBruto > 350) {
            System.out.println("Parte del salario al 25%: " + (salarioBruto - 350) + "€.");
        }
        System.out.println("Total impuestos: " + impuestos + "€.");
        System.out.println("Tu sueldo semanal neto es de " + salarioNeto + "€.");
    }
}
