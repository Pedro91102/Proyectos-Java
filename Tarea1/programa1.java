import java.util.Scanner;

public class programa1{
  public static void main(String args[]){
    
    Scanner leer = new Scanner(System.in);
      int numero, es_par;
        System.out.println("Digite un Numero");
          numero = leer.nextInt();
             es_par = numero % 2;
    if(es_par == 0){
        System.out.println("El numero:" + numero + " es par ");
      }
    else{
        System.out.println("El numero:" + numero + " es impar "); 
    }   
  }
}