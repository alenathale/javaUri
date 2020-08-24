import java.util.Scanner;
public class uri1043{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        float A,B,C,Area,Perimetro;

        A = teclado.nextFloat();
        B = teclado.nextFloat();
        C = teclado.nextFloat();

        if ((A + B > C) && (B + C > A) && (A + C > B)){
            Perimetro = A + B + C;
            System.out.printf("Perimetro = %.1f\n" , Perimetro);
        }
        else{
            Area = ((A + B)*C)/2;
            System.out.printf("Area = %.1f\n" , Area);
        }

    }
}