import java.util.Scanner;
public class uni1005{
    public static void main(String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        double a,b,media;

        a = teclado.nextDouble();
        b = teclado.nextDouble();

        media = (a * 3.5 + b * 7.5) / 11;

        System.out.printf("A sua media é %.5f\n " , media);

    }
}