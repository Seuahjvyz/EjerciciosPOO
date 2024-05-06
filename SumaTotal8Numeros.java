import java.util.*;

public class SumaTotal8Numeros {
    
    public static void main(String[] args) {

        Scanner st = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Sumar 8 numeros ");
            x = st.nextInt();

            if (x == 1) {

                int suma = 0, num;

                for (int contador = 1; contador <= 8; contador++) {

                    System.out.println("\nIngresa el " + contador + "° numero");
                    num = st.nextInt();

                    suma = suma + num;

                }

                System.out.println("\nLa suma total es: " + suma);

            }

        } while (x == 1);

    }

}
