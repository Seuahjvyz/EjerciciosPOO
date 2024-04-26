import java.util.Scanner;

public class MainMultiplicacion {
    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.print("\nIngresa el primer valor: ");
        int X = op.nextInt();
        System.out.print("\nIngresa el segundo valor: ");
        int Y = op.nextInt();

        Multiplicacion m1 = new Multiplicacion();

        m1.x = X;
        m1.y = Y;

        m1.Multiplicar();

    }
}