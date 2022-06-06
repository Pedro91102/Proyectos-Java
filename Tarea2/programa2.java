import java.util.Scanner;

public class programa2{
   public static void main(String args[]){

      Scanner leer = new Scanner(System.in);
      int numero;

      System.out.println("Digite un Numero");
      numero = leer.nextInt();

      if (numero < 0) {
          System.out.println("El numero es " + numero + " negativo");
        }   else {
          System.out.println("El numero es " + numero + " positivo");
        }

    }
}