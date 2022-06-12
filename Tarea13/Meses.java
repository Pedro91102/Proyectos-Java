/*Programa que lea una variable entera mes y compruebe si el valor
corresponde a un mes de 30, 31 o 28 días. Se mostrará además
el nombre del mes. Se debe comprobar que el valor introducido
esté comprendido entre 1 y 12.*/
import java.util.Scanner;

public class Meses {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;
        String[] meses = { "enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre" };
        int[] diasDeLosMeses = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; 

        System.out.println("Digite el numero para saber el mes:");
        numero = leer.nextInt();

        while (numero > 12 || numero < 1) {
            System.out.println("El numero " + numero + " no es un mes valido. Escribalo otra vez:");
            numero = leer.nextInt();
        }

        System.out.println(meses[numero - 1] + ", de " + diasDeLosMeses[numero - 1] + " dias.");

    }

}


