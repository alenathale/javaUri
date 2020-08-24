import java.util.Scanner;
public class uri1047{
    public static void main(String args []){
        Scanner teclado = new Scanner(System.in);

        int h_i,h_f,m_i,m_f,total_fim,total_ini,duracao,duracao_h,duracao_min;

        h_i = teclado.nextInt();
        m_i = teclado.nextInt();
        h_f = teclado.nextInt();
        m_f = teclado.nextInt();

        total_ini = (h_i*60)+m_i;
        total_fim = (h_f*60)+m_f;

        duracao = total_fim - total_ini;

        if (duracao <= 0){
           duracao = duracao + 24*60;

        }

        duracao_h = duracao/60;
        duracao_min = duracao%60;

        System.out.println("O JOGO DUROU " +duracao_h+ " HORA(S) E " +duracao_min+ " MINUTO(S)");


    }
}