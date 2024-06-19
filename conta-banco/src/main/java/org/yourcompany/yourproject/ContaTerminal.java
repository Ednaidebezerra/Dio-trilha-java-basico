package org.yourcompany.yourproject;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        
        int numeroConta;
        String agencia;
        String nomeCliente;
        Double saldo = 237.48;

        Double valorSaque;
        Double valorDeposito;

        Scanner leitura = new Scanner(System.in);

        System.out.println(" Para iniciar, Por favor, digite o número da conta !");

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

        System.out.println(" Olá " + nomeCliente + " Sua conta foi criada com sucesso, Seja bem vindo (a)! Esses são os dados da sua nova conta: "+
        "\nAgencia: " + agencia + 
        "\nConta: " + numeroConta + 
        "\nSaldo disponivel: "+saldo);
        System.out.println("");

        int opçao = 0;
        String menu = """
                    ** Digite uma opção ou "4" para sair ** 
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
                    System.out.println("Seu saldo é: " + saldo);
                    System.out.println("");
                    break;

                case 2:
                    System.out.println(" Qual valor deseja Depositar ? ");
                    valorDeposito = leitura.nextDouble();
                    saldo = saldo + valorDeposito;
                    System.out.println("Seu novo saldo é: " + saldo);
                    System.out.println("");
                    break;

                case 3:
                    System.out.println("Digite o valor que deseja sacar: ");
                    valorSaque = leitura.nextDouble();

                    if (valorSaque > saldo) {
                        System.out.println(" Saldo insuficiente !");
                        System.out.println("");
                        break;
                    } else if (valorSaque < saldo) {
                        saldo = saldo - valorSaque;
                        System.out.println("Saque realizado com sucesso, seu novo saldo é:" + (saldo));
                        System.out.println("");
                    }

                case 4:
                    System.out.println("Obrigada por usar nossos serviços!");
                     System.out.println("");

            }

        }

    }
}
