import java.util.Scanner;
public class uri1073{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        int calc;

        for(int i=2; i<=x; i+=2){
            calc = i*i;
            System.out.println(i+ "^2 = " +calc);
        }
        
    }
}