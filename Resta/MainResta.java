import java.util.Scanner;

public class MainResta {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("\nIngresa el primer valor: ");
        int x1 = leer.nextInt();
        System.out.print("\nIngresa el segundo valor: ");
        int y1 = leer.nextInt();

        Resta r1 = new Resta();

        r1.setX(x1);
        r1.setY(y1);

        System.out.println(r1);

        System.out.println("\nLa resta es: " + r1.getRestar() + "\n");

    }
}