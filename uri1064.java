import java.util.Scanner;
public class uri1064{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float valor;
        int positivo=0;
        float soma=0;
        float media;

        for (int cont=1; cont<=6; cont++){
            valor = teclado.nextFloat();
            if (valor > 0){
                positivo++;
                soma = soma + valor;
            }

        }
        System.out.println(positivo+ " valores positivos");
        media = soma/positivo;
        System.out.printf("%.1f\n" ,media);
    }
}