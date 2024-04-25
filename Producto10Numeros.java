import java.util.*;

public class Producto10Numeros {

    public static void main(String[] args) {

        Scanner pro = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Imprimir multiplicacion de los primeros 10 numeros impares");
            x = pro.nextInt();

            if (x == 1) {

                long producto = 1;

                for (int contador = 1; contador <= 20; contador++) {

                    if (contador % 2 != 0) {

                        System.out.println(contador);

                        producto *= contador;

                    }

                }

                System.out.println("\nEl producto total es: " + producto);

            }

        } while (x == 1);

    }

}
