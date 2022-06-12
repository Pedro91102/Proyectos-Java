/*	Programa que lea dos números por teclado y
muestre el resultado de la división del primero por el segundo.
Se debe comprobar que el divisor no puede ser cero. */
import java.util.Scanner;

public class Divicion_numero {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n1, n2, result;

        System.out.println("Digite el primer numero:");
        n1 = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        n2 = leer.nextInt();

        while (n2 == 0) {
            System.out.println("El segundo numero no puede ser 0, Digite el segundo numero otra vez:");
            n2 = leer.nextInt();
        }

        result = n1 / n2;
        System.out.println("El resultado de su division es: " + result);

    }

}