/*Realizar un programa que muestre la tabla de multiplicar
 hasta el 10 de un numero digitado.*/
import java.util.Scanner;
public class  Tabla_multiplicar{
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int numero;

        System.out.println("Digite el numero a sacar la tabla:");
        numero = leer.nextInt();

        for (int i = 0; i < 11; i++) {

            int resultado = numero * i;
            System.out.println(numero + " X " + i + " = " + resultado);

        }

    }

}
