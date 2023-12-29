
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = (int)(Math.random() * 100)+1;
       Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero que crees que es: ");
        int numIntroducido = sc.nextInt();
        int numeroIntentos=0;


        while (n != numIntroducido && numeroIntentos<=10){
            numeroIntentos++;

            if (numIntroducido < n) {
                System.out.println("El numero que buscas es MAYOR, Introduce el numero que crees que es: ");
            }
            else {
                System.out.println("El numero que buscas es MENOR, introduce el numero que crees que es: ");
            }
            numIntroducido = sc.nextInt();
        }
        if (numeroIntentos <=10){
                System.out.println("El numero introducido es: "+ numIntroducido + " el numero generado es: "+n+". Has acertado el numero en "+numeroIntentos+ " intentos");}

        else {
            System.out.println("No has acertado, has consumido todos los intentos");
        }




    }
}