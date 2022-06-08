//Programa para comprobar si un número de tres cifras es capicúa. 
import java.util.Scanner;

public class Tres_sifras_capicuas {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String numero;

        System.out.println("Digite un numero para saber si es capicua:");
        numero = leer.next();

        StringBuilder aVoltear = new StringBuilder(numero);
        String volteada = aVoltear.reverse().toString();
        
        if (numero.equals(volteada)) {  // equals es lo mismo que ==
            System.out.println( numero + " si es capicua:");
        } else {
            System.out.println(numero + " no es capicua:");
        }

    }

}
