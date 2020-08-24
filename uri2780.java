import java.util.Scanner;
public class uri2780{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int distancia;

        distancia = teclado.nextInt();

        if (distancia <=800){
            System.out.println("1");
        }
        else if (distancia > 800 && distancia <= 1400){
            System.out.println("2");
        }
        else if (distancia > 1400 && distancia <= 2000){
            System.out.println("3");
        }
    }
}