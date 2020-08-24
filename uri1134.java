import java.util.Scanner;
public class uri1134{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tipo = teclado.nextInt();
        int alcool=0,gasolina=0,diesel=0;

        while (tipo !=4){
            if (tipo ==1){
                alcool = alcool+1;
            }
            else if (tipo ==2){
                gasolina = gasolina+1;
            }
            else if (tipo ==3){
                diesel = diesel+1;
            }
            tipo = teclado.nextInt();
        }
        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " +alcool);
        System.out.println("Gasolina: " +gasolina);
        System.out.println("Diesel: " +diesel);

    }
}