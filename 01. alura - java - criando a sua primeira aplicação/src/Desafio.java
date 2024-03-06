import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {

        String nomeCompleto = "Jacqueline Oliveira";
        String tipoDeConta = "Corrente";
        double saldo = 2500.00;
        double chequeEspecial = 1000.00;
        double valorTransferido = 0.00;
        int opcaoEscolhida = 0;
        Scanner opcao = new Scanner(System.in);

        System.out.println("******************************");
        System.out.println("Dados iniciais do cliente\n");

        System.out.println("Nome: " + nomeCompleto);
        System.out.println("Tipo de conta: " + tipoDeConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("******************************");

        while (opcaoEscolhida != 4) {



            System.out.println("\nOperações\n");

            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");

            System.out.println("\nDigite a opção desejada:");
            opcaoEscolhida = opcao.nextInt();

            if (opcaoEscolhida == 1) {
                System.out.println("Seu saldo é de: " + saldo);
            }
            if (opcaoEscolhida == 2) {
                System.out.println("Qual o valor a ser recebido?");
                double valorRecebido = opcao.nextDouble();
                saldo += valorRecebido;
                System.out.println("Seu saldo aumentou " + valorRecebido + ", totalizando " + saldo + " de saldo");
            }
            if (opcaoEscolhida == 3) {

                System.out.println("Qual o valor a ser tranferido?");
                valorTransferido = opcao.nextDouble();

                if (valorTransferido > (saldo + chequeEspecial)){
                    System.out.println("Você não possui limite para efetuar essa transferência");
                } else {
                    saldo -= valorTransferido;
                    System.out.println("Seu saldo diminuiu " + valorTransferido + " totalizando " + saldo + " de saldo");
                }

            }
            if (opcaoEscolhida == 4) {
                System.out.println("Saindo do programa...");
            }

        }
    }
}
