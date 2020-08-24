import java.util.Scanner;
public class uni1003{
    public static void main(String args []){
       Scanner teclado;
       teclado = new Scanner(System.in);
    
        int a,b,soma;

        a = teclado.nextInt();
        b = teclado.nextInt();
        soma = a + b;

        System.out.println("A soma é " + soma);

    }



}
