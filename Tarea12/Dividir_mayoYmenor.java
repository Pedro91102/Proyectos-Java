
import java.util.Scanner;

public class Dividir_mayoYmenor {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int n1, n2, result;

        System.out.println("Digite el primer numero:");
        n1 = leer.nextInt();

        while (n1 == 0) {
            System.out.println("El segundo numero no puede ser 0, Digite el segundo numero otra vez:");
            n1 = leer.nextInt();
        }

        System.out.println("Digite el segundo numero:");
        n2 = leer.nextInt();

        while (n2 == 0) {
            System.out.println("El segundo numero no puede ser 0, Digite el segundo numero otra vez:");
            n2 = leer.nextInt();
        }
        
        if(n2 > n1){
            result = n1 / n2;
        } else {
            result = n2 / n1;
        }

        System.out.println("El resultado de su division es: " + result);

    }

}
