import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Jor el";
        String tipoConta = "Corrente";
        Scanner leitor = new Scanner(System.in);
        double saldo = 250.00;

        System.out.println("***************************");
        System.out.println("\nNome do Cleinte: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Seu saldo Atual R$" +saldo);
        System.out.println("\n***************************\n");

        while (true) {
            System.out.println("\nO que deseja fazer? ");
            System.out.println("Ver Saldo, tecle 1 ");
            System.out.println("Realizar um Deposito, tecle 2 ");
            System.out.println("Realizar uma transferencia, tecle 3 ");
            System.out.println("Se deseja encerrar, Tecle 0 \n");
            int opcaoDigitada = leitor.nextInt();


            switch (opcaoDigitada) {
                case 0:
                    System.out.println("Encerrando o programa...");
                    return; // Sair do programa
                case 1:
                    System.out.printf("Seu Saldo é de R$ %.2f \n", saldo);// Lógica para ver saldo
                    break;
                case 2:
                    System.out.println("Qual será o valor do Deposito?");
                    double valorDeposito = leitor.nextInt();
                    saldo += valorDeposito; // Lógica para realizar depósito
                    System.out.printf("Seu Saldo atual é de R$ %.2f \n", saldo);
                    break;
                case 3:
                    System.out.println("Qual será o valor da Transferencia?");
                    double valorTransferencia = leitor.nextInt();
                    if (valorTransferencia > saldo){
                        System.out.println("Saldo insuficiente para realizar essa operação.");
                    }else {
                    saldo -= valorTransferencia; //Lógica para realizar transferência
                    System.out.printf("Seu Saldo atual é de R$ %.2f \n", saldo);
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}


