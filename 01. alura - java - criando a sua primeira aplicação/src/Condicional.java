public class Condicional {
    public static void main(String[] args) {
        int anoDeLancamento = 1998;
        boolean incluidoNoPlano = true;
        double notaDoFilme = 8.1;
        String tipoPlano = "Normal";

        if (anoDeLancamento >= 2022) {
            System.out.println("Lançamentos que os clientes estão curtindo!");
        } else {
            System.out.println("Filme retrô que vale a pena assistir!");
        }

        if(incluidoNoPlano && tipoPlano.equals("plus")){
            System.out.println("Filme liberado");
        } else {
            System.out.println("Deve pagar a locação");
        }
    }



}
