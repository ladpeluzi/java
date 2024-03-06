public class PrimeiraClasse {

    static void convertCelsiusToFahrenheit(double Celsius) {
        double result = (Celsius * 1.8) + 32;
        System.out.println("valor em Fahrenheit: " + result);
        System.out.println("valor inteiro em Faremheit: " + (int) result);
    }
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match");
        System.out.println("Filme: Top Gun: Maveric");

        String nome = "Luciano";
        int anoDeLancamento = 2021;
        System.out.println("Ano de Lancamento: " + anoDeLancamento);

        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.2;

        if (String.valueOf(anoDeLancamento).equals("2022") && incluidoNoPlano){
            System.out.println("Ano passado!");
        } else {
            System.out.println("Não foi no ano passado");
        }

        System.out.println(""" 
                podemos utilizar TEXT BLOCKS
                para formatar sout com
                quebra de linhas.
                Isso a partir do java 15
                """);

        System.out.println(String.format("Meu nome é %s e assisti Top Gun: Maveric em %d que possui média %f",nome,anoDeLancamento,notaDoFilme));
        convertCelsiusToFahrenheit(34);
    }


}