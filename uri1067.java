import java.util.Scanner;
public class uri1067{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x;
        x = teclado.nextInt();

        for (int impar=1; impar<x; impar+=2){
            System.out.println(impar);
        }
    }
}