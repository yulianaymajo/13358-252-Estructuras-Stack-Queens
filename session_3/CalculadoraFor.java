
import java.util.Scanner;

public class CalculadoraFor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         
        for (int i = 1; i <= 5; i++) {
            System.out.println("CALCULADORA ");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            int opcion = sc.nextInt();

            if (opcion == 5) {
                System.out.println("Saliste correctamente");
                break; 
            }

            if (opcion >= 1 && opcion <= 4) {
                System.out.print("Ingresa el primer número: ");
                double num1 = sc.nextDouble();

                System.out.print("Ingresa el segundo número: ");
                double num2 = sc.nextDouble();

                if (opcion == 1) {
                    System.out.println("Resultado: " + (num1 + num2));
                } else if (opcion == 2) {
                    System.out.println("Resultado: " + (num1 - num2));
                } else if (opcion == 3) {
                    System.out.println("Resultado: " + (num1 * num2));
                } else if (opcion == 4) {
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Error: no se puede dividir entre 0.");
                    }
                }
            } else {
                System.out.println("Opción invalida, intenta de nuevo.");
            }

            System.out.println(); 
        }

        sc.close();
                        }
}