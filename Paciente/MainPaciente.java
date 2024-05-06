import java.util.Scanner;

public class MainPaciente {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.print("\nIngresa tu nombre: ");
        String name = leer.nextLine();
        System.out.print("Ingresa tu apellido: ");
        String lastname = leer.nextLine();
        System.out.print("Ingresa tu numero de seguridad social: ");
        int NSS = leer.nextInt();

        Paciente p1 = new Paciente();

        p1.nombre = name;
        p1.apellido = lastname;
        p1.nss = NSS;

        p1.mostrarNombre();
        p1.mostrarNSS();

    }
}