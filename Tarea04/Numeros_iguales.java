// Realizar un programa que lea dos números y comprueba si son iguales.
import java.util.Scanner;

public class Numeros_iguales{
   public static void main(String args[]){
    
      Scanner leer = new Scanner(System.in);
      int primer_numero, segundo_numero;

      System.out.println("Digite el primer numero");
      primer_numero = leer.nextInt();

      System.out.println("Digite el segundo numero");
      segundo_numero = leer.nextInt();

      if (primer_numero == segundo_numero){
          System.out.println("Los numeros son iguales ");
        }   else {
           System.out.println("Los numeros no son iguales ");
        }

    }
}