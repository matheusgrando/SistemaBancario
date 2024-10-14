package br.com.fiap.banco;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Matheus Grando
 * @version 1.0
 */

public class Conta {

    /* atributos encapsulados */
    private int agencia;
    private int numero;
    private double saldo;

    // Construtor Padrão
    public Conta() {

    }

    // Construtor de Classe
    public Conta(int agencia, int numero, double saldo) {

        this.agencia = agencia;
        this.numero = numero;
        this.saldo = saldo;

    }

    // Métodos Getters e Setters

    /* método que "obtém" o atributo "agência" do escopo da classe. */
    public int getAgencia() {
        return agencia;
    }

    /* método que altera o atributo "agência" (da classe) pelo novo "agência", que virá de parâmetro. */
    public void setAgencia(int Agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int Numero) {
        this.numero = numero;
    }


    /**
     * Acrescenta valor ao saldo da conta
     * @param valor que será depositado
     */
    public void depositar(double valor) {

        this.saldo += valor;
    }

    /**
     * Retira um valor do saldo da conta
     * @param valor
     * @see depositar
     */
    public void retirar(double valor) {

        this.saldo -= valor;
    }

    /**
     * Verifica o saldo da conta
     * @return Valor do Saldo da Conta
     */
    public double getSaldo() {

        return this.saldo;
    }


}
