import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // tipo referencia.

        meuFilme.setTitulo("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(183);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(7);

        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());
        // private - não funciona // System.out.println(meuFilme.totalDeAvaliacoes);
        System.out.println("A media das avaliações é: " + meuFilme.exibeMedia());

        Serie lost = new Serie();

        lost.setEpisodiosPorTemporada(10);

    }
}