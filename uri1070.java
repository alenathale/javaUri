import java.util.Scanner;
public class uri1070{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int x = teclado.nextInt();
        int impar=0;
        if(x%2==0){
            x = x+1;
        }
        for (int i = 0; i < 6; i++){
            System.out.println(x);
            x = x+2;
        } 
    }
}