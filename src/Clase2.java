import java.util.Scanner;

public class Clase2 {
    
    public static void main(String[] args) {

        String nombre, apellido, palabra;
        boolean sexo;
        int edad;
        float sueldo ;
        Scanner leer = new Scanner(System.in);

        System.out.println("Digite el nombre:");
        nombre = leer.next();

        System.out.println("Digite el apellido:");
        apellido = leer.next();

        System.out.println("Digite el sexo (M o F):");
        sexo = leer.nextBoolean();

        System.out.println("Digite la edad:");
        edad = leer.nextInt();

        System.out.println("Digite el sueldo:");
        sueldo = leer.nextInt();

        if (sexo) {
            palabra = "Masculino";
        } else {
            palabra = "femenino";
        }

        System.out.println("Usted se llama " + nombre + " " + apellido + ", de " + edad + " anios de edad, de sexo " + palabra + ", y un sueldo de $" + sueldo);

    }

}