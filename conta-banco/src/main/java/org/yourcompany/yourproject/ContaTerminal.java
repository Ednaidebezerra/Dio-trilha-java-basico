/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.yourcompany.yourproject;

import java.util.Scanner;

/**
 *
 * @author Ednaide Bezerra
 */
public class ContaTerminal {

    int numeroConta = 1021;
    String agencia = "067-8";
    String nomeCliente = "Mario Andrade";
     Double saldo = 237.48;

    public static void main(String[] args) {

        System.out.println("Por favor, digite o número da agencia !");
     
        Scanner var1 = new Scanner ( System.in);
        int numero = var1.nextInt();

    }
}
