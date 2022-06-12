//Realizar un programa que diga si dos números enteros terminan con la misma cifra.
import java.util.Scanner;

public class Comparacion_de_cifras {
    public static void main(String[] args) {
    
        Scanner leer = new Scanner(System.in);
        int numeroUno, numeroDos, resultadoUno, resultadoDos;
        String numeroUnoATexto, numeroDosATexto;
        String[] textoUno, textoDos;

        System.out.println("Digite el primer numero:");
        numeroUno = leer.nextInt();

        System.out.println("Digite el segundo numero:");
        numeroDos = leer.nextInt();

        numeroUnoATexto = numeroUno + "";
        numeroDosATexto = numeroDos + "";

        textoUno = numeroUnoATexto.split(""); // 50 int -> '50' String -> ['5', '0']
        textoDos = numeroDosATexto.split("");

        resultadoUno = Integer.parseInt(textoUno[textoUno.length - 1]); // String '0' -> int 0
        resultadoDos = Integer.parseInt(textoDos[textoDos.length - 1]);

        if ( resultadoUno == resultadoDos ) {
            System.out.println("La ultima cifra de estos dos numeros son iguales");
        } else {
            System.out.println("La ultima cifra de estos dos numeros no son iguales");
        }

    }

}