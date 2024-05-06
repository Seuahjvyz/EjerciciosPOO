import java.util.Scanner;

public class MainMultiplicacion {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.print("\nIngresa el primer valor: ");
        int x1 = op.nextInt();
        System.out.print("\nIngresa el segundo valor: ");
        int y1 = op.nextInt();

        Multiplicacion m1 = new Multiplicacion();

        m1.setX(x1);
        m1.setY(y1);

        System.out.println(m1);

        System.out.println("\nLa multiplicacion es: " + m1.getMultiplicar() + "\n");

    }

}