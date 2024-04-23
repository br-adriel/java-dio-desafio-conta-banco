package com.dio.desafio.banco;

public class Conta {
    private int numero;
    private String agencia;
    private String cliente;
    private double saldo;

    public Conta(int numero, String agencia, String cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= this.saldo) {
            this.saldo -= valor;
            return;
        }
        ;
        throw new RuntimeException("Saldo insuficiente");
    }

    public String mensagemDeBoasVindas() {
        return "Olá " + cliente + ", obrigado por criar uma conta em nosso " +
               "banco, sua agência é " + agencia + ", conta " + numero +
               " e seu saldo de R$ " + String.format("%.2f", saldo) +
               " já está disponível para saque.";
    }
}
