import java.util.Scanner;
public class Leituras{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numFuncional;
        String nome;
        float salario;
        char  categoria;
        String texto;

        System.out.print("Digite a funcional:");
        texto = teclado.nextLine();
        numFuncional = Integer.parseInt(texto); // comando utilizado para converter string para int
        System.out.print("Digite o nome     :");
        nome = teclado.nextLine();
        System.out.print("Digite o salario  :");
        texto = teclado.nextLine().replace(",","."); // replace serve para quando existir duas possibilidades exemplo ponto e virgura
        salario = Float.parseFloat(texto); // comando para converter string para float

        System.out.print("Digite a categoria:");
        categoria = teclado.nextLine().charAt(0); // charAt utilizado para so pegar o primeiro caracter

        System.out.println("Cadastro Efetuado!");
        System.out.println(numFuncional+"/"+nome+"/"+salario+"/"+categoria);
;
    }
}