import java.util.Scanner;

class MainPersona {

    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.print("\nIngresa tu nombre: ");
        String name = op.nextLine();
        System.out.print("\nIngresa tu apellido: ");
        String lastname = op.nextLine();
        System.out.print("\nIngresa tu edad: ");
        int age = op.nextInt();
        System.out.print("\nIngresa tu altura: ");
        double height = op.nextDouble();

        Persona p1 = new Persona();

        p1.setNombre(name);
        p1.setApellido(lastname);
        p1.setEdad(age);
        p1.setAltura(height);

        System.out.println(p1);

        System.out.println("\nMi nombre es " + p1.getMostrarNombreCompleto());

        System.out.println("Tengo " + p1.getEdad() + " años");

        System.out.println("Mido " + p1.getAltura() + " metros\n");

    }

}