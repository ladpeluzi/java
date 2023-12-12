import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito!");
        String filme = leitura.nextLine();
        System.out.println(filme);
        System.out.println("Qual o ano de lançamento?");
        int anodeLancamento = leitura.nextInt();
        System.out.println(anodeLancamento);
        System.out.println("Diga a sua avaliação para o filme");
        double avaliacao = leitura.nextDouble();
        System.out.println(avaliacao);


    }
}
