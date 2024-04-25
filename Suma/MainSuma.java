import java.util.Scanner;

class MainPersona {
    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.print("\nIngresa el primer valor: ");
        int X = op.nextInt();
        System.out.print("\nIngresa el segundo valor: ");
        int Y = op.nextInt();

        Suma s1 = new Suma();

        s1.x = X;
        s1.y = Y;
        
        s1.Sumar();

    }
}