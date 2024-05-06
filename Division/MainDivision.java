import java.util.Scanner;

public class MainDivision {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("\nIngresa un numero: ");
        double x1 = leer.nextDouble();
        System.out.println("\nIngresa otro numero: ");
        double y1 = leer.nextDouble();

        Division d1 = new Division();
        d1.setX(x1);
        d1.setY(y1);

        System.out.println(d1);
        System.out.println("\nLa division es: " + d1.getDividir() + "\n");

    }

}