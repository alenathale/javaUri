import java.util.Scanner;
public class uri1007{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

        int a,b,c,d,diferenca;

        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();

        diferenca = (a * b - c * d);

        System.out.println("a diferença é = " +diferenca);
    }
}