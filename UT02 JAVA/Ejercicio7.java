import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce cantidad: ");
        double cantidad = sc.nextDouble();
        System.out.println("Para cambiar de euros a libras pulsa a.");
        System.out.println("Para cambiar de libras a euros pulsa b.");
        System.out.print("Introduce opción: ");
        char opcion = sc.next().charAt(0);

        double resultado;
        if (opcion == 'a') {
            resultado = cantidad * 0.87;
            System.out.println(cantidad + " euros son " + resultado + " libras.");
        } else if (opcion == 'b') {
            resultado = cantidad * 1.1377;
            System.out.println(cantidad + " libras son " + resultado + " euros.");
        } else {
            System.out.println("Opción no válida.");
        }
    }
}
