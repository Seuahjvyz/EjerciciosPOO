import java.util.*;

public class DescendentesEn7 {
    public static void main(String[] args) {

        Scanner desc = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Imprimir del 100 al 0 de 7 en 7 ");
            x = desc.nextInt();

            if (x == 1) {

                System.out.println("\n");

                for (int num = 100; num >= 0; num -= 7) {

                    System.out.println(num);

                }

            }

        } while (x == 1);

    }
}