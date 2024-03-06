import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        double mediaAvaliacao = 0;
        double nota = 0;
        int numeroDeAvaliacoes = 3;
        String filme = "";

        for (int i = 0; i < numeroDeAvaliacoes; i++) {
            System.out.println("Qual o filme?");
            filme = leitura.next();
            System.out.println("Diga sua avaliacao para esse filme ");
            nota = leitura.nextDouble();
            mediaAvaliacao += nota;
        }

        System.out.println("Media de avaliacoes " + mediaAvaliacao/numeroDeAvaliacoes );
    }

}
