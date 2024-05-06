package PalabraInversa;

public class PalabraInversa {

    String palabra;

    public String getmostrarPalabraInversa() {

        StringBuilder builder = new StringBuilder(palabra);
        // Esto no

        return palabra = builder.reverse().toString();
        // return new StringBuilder(palabra).reverse().toString();
    }

    @Override
    public String toString() {
        return "\nPalabraInversa [palabra=" + palabra + "]";
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

}