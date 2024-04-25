public class Persona {

    String nombre, apellido;
    int edad;
    double altura;

    Persona(){}

    public void mostrarNombreCompleto(){
        System.out.println("\nMi nombre es "+this.nombre+" "+this.apellido);        
    }

    public void mostrarEdad(){
        System.out.println("Tengo "+this.edad+" años");
    }

    public void mostrarAltura(){
        System.out.println("Mido " + this.altura + " metros\n");
    }
}