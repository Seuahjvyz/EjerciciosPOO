import java.util.Scanner;

public class NotasNumericas {
    
    public static void main(String[] args) {

        Scanner nm = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Numerosxd");
            x = nm.nextInt();

            if (x == 1) {

                int z;

                System.out.println("\nIngresa un numero entre 0 y 10");
                z = nm.nextInt();

                switch (z) {

                    case 0:
                        System.out.println("Cero");
                        break;

                    case 1:
                        System.out.println("Uno");
                        break;

                    case 2:
                        System.out.println("Dos");
                        break;

                    case 3:
                        System.out.println("Tres");
                        break;

                    case 4:
                        System.out.println("Cuatro");
                        break;

                    case 5:
                        System.out.println("Cinco");
                        break;

                    case 6:
                        System.out.println("Seis");
                        break;

                    case 7:
                        System.out.println("Siete");
                        break;

                    case 8:
                        System.out.println("Ocho");
                        break;

                    case 9:
                        System.out.println("Nueve");
                        break;

                    case 10:
                        System.out.println("Diez");
                        break;

                    default:
                        break;

                }

            }

        } while (x == 1);

    }

}