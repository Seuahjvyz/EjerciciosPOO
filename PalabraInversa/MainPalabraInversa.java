package PalabraInversa;

import java.util.*;

public class MainPalabraInversa {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("\nIngresa una palabra: ");
        String palabra1 = leer.nextLine();

        PalabraInversa p1 = new PalabraInversa();

        p1.setPalabra(palabra1);

        System.out.println(p1);
 
        System.out.println("\nLa palabra inversa es: " + p1.getmostrarPalabraInversa()+"\n");
    }

}