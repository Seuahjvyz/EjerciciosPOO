import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("\nIngresa el primer valor: ");
        int X = leer.nextInt();
        System.out.print("\nIngresa el segundo valor: ");
        int Y = leer.nextInt();

        Resta r1 = new Resta();

        r1.x = X;
        r1.y = Y;

        r1.Restar();

    }
}