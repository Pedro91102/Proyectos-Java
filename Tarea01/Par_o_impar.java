/*Realizar un programa que lea un número entero,
 y calcule si es par o impar*/
import java.util.Scanner;

public class Par_o_impar{
  public static void main(String args[]){
    
    Scanner leer = new Scanner(System.in);
      int numero, es_par;
        System.out.println("Digite un Numero");
          numero = leer.nextInt();
             es_par = numero % 2;
    if(es_par == 0){
        System.out.println("El numero: " + numero + " es par. ");
      }
    else{
        System.out.println("El numero: " + numero + " es impar. "); 
    }   
  }
}