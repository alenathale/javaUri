import java.util.Scanner;
public class uri1065{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float num,n;
        int par=0;

        for (int cont=1; cont<5; cont++){
            num = teclado.nextFloat();
            n = num % 2;
            if (n == 0){
                par++;
            }
        }
        System.out.println(par+ " valores pares");
    }       
}