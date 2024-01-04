package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }
    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void exibeFichaTecnica(){
        System.out.println("O nome do filme é " + nome);
        System.out.println("O ano de lançamento é " + this.anoDeLancamento);
        System.out.println("A duração desse filme é de " + this.duracaoEmMinutos);
        System.out.println(this.incluidoNoPlano ? "O filme está incluido no plano" : "O filme não está incluído no plano");
    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double exibeMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
