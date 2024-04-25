import java.util.*;

public class DetectorDePosNeg {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Detector de numeros positivos y negativos");
            x = leer.nextInt();

            if (x == 1) {

                int num;

                System.out.println("\nIngresa un numero");
                num = leer.nextInt();

                while (num != 0) {

                    if (num > 0) {

                        System.out.println("\n" + num + " Es un numero positivo ");
                        System.out.println("\nIngresa otro numero ");
                        num = leer.nextInt();
                    }

                    else if (num < 0) {

                        System.out.println("\n" + num + " Es un numero negativo");
                        System.out.println("\nIngresa otro numero ");
                        num = leer.nextInt();

                    }

                }
                System.out.println("\nIngresa un numero positivo o negativo");

            }

        } while (x == 1);

    }

}