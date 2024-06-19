package org.yourcompany.yourproject;

import java.util.Scanner;

public class ContaTerminal {
// declaração de variaveis da classe principal

    public static void main(String[] args) {

        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo = 237.48;

        Double valorSaque;
        Double valorDeposito;

        Scanner leitura = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta !");

        numeroConta = leitura.nextInt();
        System.out.println(" Conta: " + numeroConta);
        System.out.println("");


        System.out.println("Por favor, digite o número da Agencia!");

        agencia = leitura.next();
        System.out.println(" Agencia: " + agencia);
        System.out.println("");

        System.out.println("Por favor, digite seu nome completo!");
        nomeCliente = leitura.next();
        System.out.println(" Nome:" + nomeCliente);
        System.out.println("");

        System.out.println(" Olá, " + nomeCliente + "Obrigado por criar uma conta em nosso banco, sua Agencia é:"
                + agencia + "Conta" + numeroConta + " E seu saldo já está disponível para saque.");
        System.out.println("");
         
        int opçao = 0;
        String menu = """
                    ** Digite uma opção ** 
                    1- Consultar saldo
                    2- Depositar
                    3- Sacar
                    4- Sair
                    """;
        while (opçao != 4) {
            System.out.println(menu);
            opçao = leitura.nextInt();

            switch (opçao) {
                case 1:
                    System.out.println("Seu saldo é:" + saldo);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println(" Qual valor deseja Depositar ?");
                    valorDeposito = leitura.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.println("Seu novo saldo é:" + saldo);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja sacar:");
                    valorSaque = leitura.nextDouble();

                    if (valorSaque > saldo) {
                        System.out.println(" Saldo insuficiente");
                        System.out.println("");
                        break;
                    } else if (valorSaque < saldo) {
                        saldo = saldo - valorSaque;
                        System.out.println("Saque realizado com sucesso, seu novo saldo é:" + (saldo));
                        System.out.println("");
                    }

                case 4:
                    System.out.println("Obrigada por usar nossos serviços!");

            }

        }

    }
}
