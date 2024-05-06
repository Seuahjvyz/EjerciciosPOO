public class Persona {

    private String nombre, apellido;
    private int edad;
    private double altura;

    Persona() {
    }

    public String getMostrarNombreCompleto() {

        return (this.nombre + " " + this.apellido);
    }

    public int getMostrarEdad() {
        return this.edad;
    }

    public double getMostrarAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return "\nPersona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", altura=" + altura + "]";
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}