package com.dio.desafio;

import com.dio.desafio.banco.Conta;

import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Conta conta = new Conta();
        Scanner sc = new Scanner(System.in);

        System.out.println("Olá, bem vindo(a) ao nosso banco!");
        System.out.println("Vamos dar início ao processo de abertura de conta.");

        System.out.println("\nPor favor digite o número da agencia:");
        conta.setAgencia(sc.nextLine());

        System.out.println("\nPor favor informe o número da conta:");
        conta.setNumero(sc.nextInt());
        sc.nextLine();

        System.out.println("\nPor favor informe o nome do cliente:");
        conta.setCliente(sc.nextLine());

        System.out.println("\nPor favor informe o saldo inicial da conta:");
        conta.depositar(sc.nextDouble());

        System.out.println("\nProcessando...\n");

        System.out.println(conta.mensagemDeBoasVindas());
    }
}
