package org.yourcompany.yourproject;

import java.util.Scanner;

public class ContaTerminal {
// declaração de variaveis da classe principal

    public static void main(String[] args) {

        int numeroConta = 1021;
        String agencia = "067-8";
        String nomeCliente = "Mario Andrade";
        Double saldo = 237.48;

       Double saque;
       double deposito;

        Scanner leitura = new Scanner(System.in);

         System.out.println("Por favor, digite o número da conta !");

            numeroConta = leitura.nextInt();
            System.out.println(" Conta: " + numeroConta);

         System.out.println("Por favor, digite o número da Agencia!");

            agencia = leitura.next();
            System.out.println(" Agencia: " + agencia);

         System.out.println("Por favor, digite seu nome completo!");

            nomeCliente = leitura.next();
            System.out.println(" Nome:" + nomeCliente);

         System.out.println(" Olá, " + nomeCliente + "Obrigado por criar uma conta em nosso banco, sua Agencia é:" +
         agencia + "Conta" + numeroConta + " E seu saldo já está disponível para saque." );


         int opçao = 0;
          String menu = """
                    ** Digite uma opção ** 
                    1- Consultar saldo
                    2- Depositar
                    3- Sacar
                    4- Sair
                    """;
         while ( opçao != 4) {
            System.out.println( menu);
            opçao = leitura.nextInt();

         } if ( opçao == 1){
            System.out.println("Seu saldo é:" + saldo);

         } else if ( opçao == 2) {
            System.out.println(" Qual valor deseja sacar ?");
            Double valor = leitura.nextDouble();

            System.out.println( "Seu novo saldo é:" + (saldo + valor));

         } else if (opçao== 3){
             System.out.println("Digite o valor que deseja sacar:");

         }
         
    

    }
}
