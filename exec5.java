import java.util.Scanner;
public class exec5{
    public static void main (String args[]){
        Scanner teclado;
        teclado = new Scanner(System.in);

        float tempo,velocidade_media,distancia,a,b,quantidade_litros;
        

        System.out.println("Quanto tempo demorou a viagem  ");
        tempo = teclado.nextInt();
        System.out.println("Qual foi a distancia da viagem ");
        distancia = teclado.nextInt();
        System.out.println("Qual foi a velocidade media ");
        velocidade_media = teclado.nextInt();
        
        a = velocidade_media * tempo;
        b = distancia / 12;
        quantidade_litros = a - b;

        System.out.println("Voce gastou " +quantidade_litros+ "litros");








    }





}
