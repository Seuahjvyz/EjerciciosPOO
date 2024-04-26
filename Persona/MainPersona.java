import java.util.Scanner;

class MainPersona {
    public static void main(String[] args) {

        Scanner op = new Scanner(System.in);

        System.out.print("\nIngresa tu nombre: ");
        String name = op.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String lastname = op.nextLine();
        System.out.print("Ingresa tu edad: ");
        int age = op.nextInt();
        System.out.print("Ingresa tu altura: ");
        double height = op.nextDouble();

        Persona p1 = new Persona();

        p1.nombre = name;
        p1.apellido = lastname;
        p1.edad = age;
        p1.altura = height;

        p1.mostrarNombreCompleto();
        p1.mostrarEdad();
        p1.mostrarAltura();
    }
}