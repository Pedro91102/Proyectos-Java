/*Realizar un programa que lea un número entero
 y calcule si es positivo o negativo. */
import java.util.Scanner; 

public class Positivo_o_negativo{
   public static void main(String args[]){

      Scanner leer = new Scanner(System.in);
      int numero;

      System.out.println("Digite un Numero");
      numero = leer.nextInt();

      if (numero < 0) {
          System.out.println("El numero es " + numero + " negativo.");
        }   else {
          System.out.println("El numero es " + numero + " positivo.");
        }

    }
}