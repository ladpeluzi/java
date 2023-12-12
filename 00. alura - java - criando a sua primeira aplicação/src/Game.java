import java.util.Scanner;
import java.util.Random;

public class Game {
    public static void main(String[] args) {

        int escolheu = 0;

        int totalTentativas, totalAcertos, totalErros;
        totalTentativas = totalAcertos = totalErros = 0;

        while (escolheu != -1) {
            int numeroSorteado = new Random().nextInt(5);
            Scanner suaEscolha = new Scanner(System.in);
            System.out.println("Escolha um número de 0 a 5!");
            escolheu = suaEscolha.nextInt();

            numeroSorteado = 5;

            System.out.println("Você escolheu " + escolheu + " e foi sorteado " + numeroSorteado);
            System.out.println(escolheu == numeroSorteado ? "PARABENS VC ACERTOU" : "VC ERROU");

            if (escolheu != -1) {
                if (escolheu == numeroSorteado) {
                    totalAcertos++;
                } else {
                    totalErros++;
                }
                totalTentativas++;
                
                double eficienciaAcerto = ((double) totalAcertos * 100d / totalTentativas) ;
                System.out.println("acertou: " + totalAcertos + " e errou " + totalErros);
                System.out.println("eficiencia de acertos: " + eficienciaAcerto + " %" );

                if (totalTentativas >= 5) { break; }
            }




        }



    }
}
