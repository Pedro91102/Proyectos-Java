/*Una tienda de Ropas vende los Jeans a RD$2,000.00 pesos la unidad.
Dependiendo la cantidad de Jeans que el cliente compre,
se le aplican los siguientes descuentos al total de la compra:

· Mayor de 5 unidades, se le aplica un 10 % de descuento.

· Mayor 10 unidades, pero menor de 20, se le aplica un 15% de descuento.

· Mayor de 35 unidades, se le aplica un 25 % descuento.*/

import java.util.Scanner;

public class Descuetis_unidades {
 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        int cantidad, precio = 2000, subtotal;
        double descuento = 0, total;
        String textoDescuento = "0%";

        System.out.println("Cantidad de jeans a comprar:");
        cantidad = leer.nextInt();

        subtotal = precio * cantidad;

        if (cantidad > 35) {
            descuento = subtotal * 0.25;
            textoDescuento = "25%";
        }
        else if (cantidad > 10 && cantidad < 20) {
            descuento = subtotal * 0.15;
            textoDescuento = "15%";
        }
        else if (cantidad > 5) {
            descuento = subtotal * 0.10;
            textoDescuento = "10%";
        }
        
        total = subtotal - descuento;

        System.out.println("El subtotal es: " + subtotal + ", con un descuento de(" + textoDescuento + "): " + descuento + ", para un total de: " + total);

    }

}


