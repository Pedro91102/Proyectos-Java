/*Programa que lea un número y luego determine si es un numero primo. 
Un numero primo es aquel que solo es divisible entre 1 y el mismo. 
Por ejemplo: el 3 es un numero primo que solo es divisible entre 3 y 1.*/
import java.util.Scanner;

public class Numero_primo {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int numero;
        boolean isPrimo = true;

        System.out.println("Digite un numero para saber si es primo:");
        numero = leer.nextInt();

        for (int i = 2; i < 10; i++) {
            if (i == numero) {
                break;
            }
            int result = numero % i;
            if (result == 0) {
                isPrimo = false;
                break;
            }
        }

        if (isPrimo) {
            System.out.println(numero + " es un numero primo.");
        } else {
            System.out.println(numero + " no es un numero primo.");
        }
    }
}
