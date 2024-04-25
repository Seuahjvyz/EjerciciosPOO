import java.util.Scanner;

public class NumerosCuadrados {
    public static void main(String[] args) {

        Scanner nc = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerrar progrma");
            System.out.println("Ingresa 1: Elevar un numero al cuadrado");
            x = nc.nextInt();

            if (x == 1) {
                double num;

                System.out.print("\nIngresa un número: ");
                num = nc.nextInt();

                while (num >= 0) {

                    num = Math.pow(num, 2);

                    System.out.println(num);

                    System.out.print("Ingresa otro número: ");
                    num = nc.nextInt();
                }

                System.out.println("\nIngresa un numero positivoxd");
                
            }

        } while (x == 1);

    }

}