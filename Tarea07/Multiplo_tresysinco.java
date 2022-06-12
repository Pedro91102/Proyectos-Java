/*Realizar un programa que compruebe
 si un número es múltiplo de tres y de cinco*/
import java.util.Scanner;

public class Multiplo_tresysinco {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero, esMultiploDeTres, esMultiploDeCinco;

        System.out.println("Digite un numero:");
        numero = leer.nextInt();

        esMultiploDeTres = numero % 3;
        esMultiploDeCinco = numero % 5;

        if (esMultiploDeTres == 0) {
            System.out.println("El numero " + numero + " es multiplo de 3.");
            if (esMultiploDeCinco == 0) {
                System.out.println("El numero " + numero + " es tambien multiplo de 5.");
            }
        } 
        else if (esMultiploDeCinco == 0) {
            System.out.println("El numero " + numero + " es multiplo de 5.");
        } 
        else {
            System.out.println("El numero " + numero + " no es multiplo ni de 3 ni de 5.");
        }

    }

}