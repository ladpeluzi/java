package br.com.alura.desafio;

public class Carro {
    int ano;
    int preco;
    String modelo;


    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getPreco() {
        return preco;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }
    public void getModelo(int ano) {

        if (ano > 2024) {
            modelo = "Hatch";
        } else if (ano == 2023) {
            modelo = "SUV";
        } else {
            modelo = "Picapes";
        }
        System.out.println("No ano " + ano + " o modelo é " + modelo );

    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }



}
