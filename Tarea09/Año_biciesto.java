//Realizar un programa que lea un año y calcule si un año es bisiesto.
import java.util.Scanner;

public class Año_biciesto {

    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        int año, esBisiesto;

        System.out.println("Digite un anio para saber si es bisiesto:");
        año = leer.nextInt();

        esBisiesto = año % 4;

        // 2000 2004 2008 año bisiesto tienen multiplo de 4 

        if (esBisiesto == 0) {
            System.out.println("El anio " + año + " si es bisiesto:");
        } else {
            System.out.println("El anio " + año + " no es bisiesto:");
        }

    }

}