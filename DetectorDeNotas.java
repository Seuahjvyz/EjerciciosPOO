import java.util.Scanner;

public class DetectorDeNotas {
    public static void main(String[] args) {

        Scanner dn = new Scanner(System.in);

        int x;

        do {

            System.out.println("\nIngresa 0: Cerrar programa");
            System.out.println("Ingresa 1: Nota de calificacionxd");
            x = dn.nextInt();

            if (x == 1) {

                float n;

                System.err.println("\nIngresa una nota entre 0 y 10");
                n = dn.nextFloat();

                if (n == 10){

                    System.out.println("Excelente");
                    
                }      
                
                else if (9 >= n && n > 7){

                    System.out.println("Bien");
                    
                }                
                
                else if (n == 7) {

                    System.out.println("Suficiente");
                    
                } 

                else if (n <= 6 && n >= 0){

                    System.out.println("Insuficiente");
                    
                }

                else if (n != 0 ){ 

                    System.out.println("Ingresa una nota valida");

                    break;

                }

            }

        } while (x == 1); 

    }

}