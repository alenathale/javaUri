import java.util.Scanner;
public class testeif{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        float n1,n2,me;

        n1 = teclado.nextFloat();
        n2 = teclado.nextFloat();
        me = (n1 + n2)/2;

        System.out.println("Sua media vale =" +me);

        if (me >= 6) {
            System.out.println("Parabens voce foi aprovado/a");
                }
                else{
                    System.out.println("Voce nao passou!");
                }
        System.out.println("Fim do Programa");
    }
}    