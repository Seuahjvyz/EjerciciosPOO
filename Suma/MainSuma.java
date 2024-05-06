import java.util.Scanner;

public class MainSuma {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.print("\nIngresa el primer valor: ");
        int x1 = op.nextInt();
        System.out.print("\nIngresa el segundo valor: ");
        int y1 = op.nextInt();

        Suma s1 = new Suma();

        s1.setX(x1);
        s1.setY(y1);
        
        System.out.println(s1);

        System.out.println("\nLa suma es: "+s1.getSumar()+"\n");

    }

}