package br.com.alura.screenmatch.modelos;

public class Titulo {
    private String titulo;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private boolean incluidoNoPlano;

    public int getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void exibeFichaTecnica(){
        System.out.println("O nome do filme é " + titulo);
        System.out.println("O ano de lançamento é " + this.anoDeLancamento);
        System.out.println("A duração desse filme é de " + this.duracaoEmMinutos);
    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double exibeMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

}
