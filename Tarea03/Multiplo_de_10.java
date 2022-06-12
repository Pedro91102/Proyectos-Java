/*Realizar un Programa que lea un número entero
 y muestre si el número es múltiplo de 10.*/
import java.util.Scanner;

public class Multiplo_de_10{
  public static void main(String args[]){
    
    Scanner leer = new Scanner(System.in);
      int numero, Multiplo;
        System.out.println("Digite un Numero");
          numero = leer.nextInt();
             Multiplo = numero % 10;
    if(Multiplo == 0){
        System.out.println("El numero:" + numero + " es Multiplo de 10 ");
      }
    else{
        System.out.println("El numero:" + numero + " No es Multiplo de 10 "); 
    }   
  }
}