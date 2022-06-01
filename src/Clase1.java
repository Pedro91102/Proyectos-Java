import java.util.Scanner;

public class Clase1 {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("Digite el valor 1");
        int numeroUno = leer.nextInt();

        System.out.println("Digite el valor 2");
        int numeroDos = leer.nextInt();

        int total = numeroUno * numeroDos;

        System.out.println("el resultado es: " + total);
    }
}