import java.util.Scanner;

public class Orden3Numeros {

    public static void main(String[] args) {

        Scanner on = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Mostrar los numeros ordenados de menor a mayor");
            x = on.nextInt();

            if (x == 1) {

                int a, b, c;

                System.out.println("\nIngresa tres numeros:");
                a = on.nextInt();
                b = on.nextInt();
                c = on.nextInt();

                if (a < b && b < c) {

                    System.out.println("\n"+ a + ", " + b + ", " + c);

                }

                else if (a < c && c < b) {

                    System.out.println("\n"+a + ", " + c + ", " + b);

                }

                else if (b < a && a < c) {

                    System.out.println("\n"+b + ", " + a + ", " + c);

                }

                else if (b < c && c < a) {

                    System.out.println("\n"+b + ", " + c + ", " + a);

                }

                else if (c < a && a < b) {

                    System.out.println("\n"+c + ", " + a + ", " + b);

                }

                else if (c < b && b < a) {

                    System.out.println("\n"+c + ", " + b + ", " + a);

                }

            }

        } while (x == 1);

    }

}