import java.util.Scanner;
public class uri1046{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        int horaini,horafim,duracao;

        horaini = teclado.nextInt();
        horafim = teclado.nextInt();

        if (horaini == horafim){
            System.out.println("O Jogo durou 24 horas(s)");
        }
        else if (horafim > horaini){
            duracao = horafim - horaini;
            System.out.println("O Jogo durou " +duracao+ " horas(s)");
        }
        else if (horafim < horaini){
            duracao = (horafim - horaini)+24;
            System.out.println("O Jogo durou " +duracao+ " horas(s)");
        }



    }
}