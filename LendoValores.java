import java.util.Scanner;
public class LendoValores{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System,in);
    
        int a;
        float b;
        double c;
        System.out.prinln("Digite um valor inteiro: ");
        a = teclado.nextInt();
        System.out.prinln("Digite um valor real(FLOAT): ");
        b = teclado.nextFloat();
        System.out.prinln("Digite um valor real(DOUBLE): ");
        c = teclado.nextDouble();



        System.out.println("Você digitou " + a + " - " + b + " - " +c);





    }






}