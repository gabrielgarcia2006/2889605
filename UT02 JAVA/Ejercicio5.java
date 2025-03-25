import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce valor para el radio: ");
        double radio = sc.nextDouble();

        double longitud = 2 * Math.PI * radio;
        double area = Math.PI * radio * radio;
        double volumen = (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);

        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);
        System.out.println("El volumen de la esfera es: " + volumen);
    }
}
