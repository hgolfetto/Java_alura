import java.util.Scanner;

public class fiinal {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int opcao = 0;
        double saldo = 2500;

        System.out.println("************************************");
        System.out.println("Dados iniciais do cliente: \n");
        System.out.println("Nome:                  Henrique Golfetto");
        System.out.println("Tipo conta:            Corrente");
        System.out.println("Saldo inicial:         R$ 2500,00");
        System.out.println("************************************ \n \n" );
        System.out.println("Operações \n");

       String menu = """
                Digite sua opção
                1 - Consultar saldo
                2 - Receber valor
                3 - Transferir valor
                4 - Sair

               """;
        while(opcao != 4){
            System.out.println(menu);
            opcao = read.nextInt();

            if (opcao == 1) {
                System.out.println("O saldo atual é R$ " + saldo);
            } else if (opcao == 2) {
                System.out.println("Informe o valor a receber:");
                double receber = read.nextDouble();
                saldo += receber;
                System.out.println("Saldo atualizado R$ " + saldo);
            } else if (opcao == 3) {
                System.out.println("Informe o valor que deseja transferir: ");
                double transferir = read.nextDouble();
                if (transferir > saldo) {
                    System.out.println("Não há saldo suficiente para fazer essa transferência");
                } else {
                    saldo -= transferir;
                    System.out.println("Saldo atualizado R$ " + saldo);
                }
            } else if (opcao != 4){
                System.out.println("Erro, digite uma opção válida.");
            }
        }
         System.out.println("Programa fechado.");
        
        }
    }

