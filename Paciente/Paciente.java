public class Paciente {

    String nombre, apellido;
    int nss;

    Paciente() {
    }

    public void mostrarNombre() {
        System.out.println("\nMi nombre es " + this.nombre + " " + this.apellido);
    }

    public void mostrarNSS() {
        System.out.println("Mi numero de seguridad social es " + this.nss + "\n");
    }

}