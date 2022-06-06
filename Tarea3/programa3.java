//Realizar un Programa que lea un número entero y muestre si el número es múltiplo de 10.
import java.util.Scanner;

public class programa3{
  public static void main(String args[]){
    
    Scanner leer = new Scanner(System.in);
      int numero, es_par;
        System.out.println("Digite un Numero");
          numero = leer.nextInt();
             es_par = numero % 10;
    if(es_par == 0){
        System.out.println("El numero:" + numero + " es Multiplo de 10 ");
      }
    else{
        System.out.println("El numero:" + numero + " No es Multiplo de 10 "); 
    }   
  }
}