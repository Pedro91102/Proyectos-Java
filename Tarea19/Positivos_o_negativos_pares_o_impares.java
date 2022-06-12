/*Realizar un programa que indique de un rango de número
(debe digitar dos números para el establecer el rango) 
si son positivos o negativos, pares o impares.*/
import java.util.Scanner;

public class Positivos_o_negativos_pares_o_impares {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int rangoBajo, rangoAlto;
        boolean retroceso = false;

        System.out.println("Digite el rango bajo:");
        rangoBajo = leer.nextInt();

        System.out.println("Digite el rango alto:");
        rangoAlto = leer.nextInt();

        if (rangoBajo > rangoAlto) {
            retroceso = true;
        }

        int rango = rangoAlto - rangoBajo;
        System.out.println("El rango en distancia es " + rango);

        while (rangoBajo != rangoAlto) {
            int isPar = rangoBajo % 2;
            String textoAMostrar = rangoBajo + " es";
            if (rangoBajo < 0) {
                textoAMostrar += " negativo";
            }
            else {
                textoAMostrar += " positivo";
            }
            if (isPar == 0) {
                textoAMostrar += " par.";
            }
            else {
                textoAMostrar += " impar.";
            }
            System.out.println(textoAMostrar);
            if (retroceso) {
                rangoBajo--;
            } else {
                rangoBajo++;
            }
        }

    }

}
