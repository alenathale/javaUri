import java.util.Scanner;
public class uri1008{
    public static void main(String arg[]){
        Scanner teclado;
        teclado = new Scanner (System.in);

    int numero,horas;
    float valorhora,salario;

    numero = teclado.nextInt();
    horas = teclado.nextInt();
    valorhora = teclado.nextFloat();

    salario = horas *valorhora;

    System.out.printf("Seu salario e R$ %.5f\n " ,salario);
    }
}