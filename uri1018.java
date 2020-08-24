import java.util.Scanner;
public class uri1018{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);
        
        int valor = teclado.nextInt();
        int nota100,nota50,nota20,nota10,nota5,nota2,nota1;
        int resto;

        nota100 = valor / 100;
        resto   = valor % 100;
        
        nota50  = resto / 50;
        resto  = resto % 50;
        
        nota20  = resto / 20;
        resto = resto % 20;
        
        nota10 = resto / 10;
        resto = resto % 10;
        
        nota5 = resto / 5;
        resto = resto % 5;
        
        nota2 = resto / 2;
        resto = resto % 2;
        
        nota1 = resto / 1;

        System.out.println(" Valor total" + valor);
        System.out.println(nota100 + " notas de 100");
        System.out.println(nota50 + " notas de 50");
        System.out.println(nota20 + " notas de 20");
        System.out.println(nota10 + " notas de 10");
        System.out.println(nota5 + " notas de 5");
        System.out.println(nota2 + " notas de 2");
        System.out.println(nota1 + " notas de 1");


    }
}
