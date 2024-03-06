import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

public class Principal {
    public static void main(String[] args) {

        Filme meuFilme = new Filme(); // tipo referencia.
        meuFilme.setNome("O Poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        meuFilme.avalia(7);
        System.out.println("O total de avaliações é: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("A media das avaliações é: " + meuFilme.exibeMedia());


        Filme outroFilme = new Filme(); // tipo referencia.
        outroFilme.setNome("Avatar");
        outroFilme.setAnoDeLancamento(2023);
        outroFilme.setDuracaoEmMinutos(220);

        Serie lost = new Serie();
        lost.setTemporada(10);
        lost.setEpisodiosPorTemporada(10);
        lost.setMinutosPorEpisodio(25);
        lost.setNome("Lost");
        lost.setAnoDeLancamento(2013);
        lost.setDuracaoEmMinutos(896);
        lost.setIncluidoNoPlano(true);
        lost.exibeFichaTecnica();

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();

        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(lost);
        System.out.println(calculadora.getTempoTotal());

    }
}