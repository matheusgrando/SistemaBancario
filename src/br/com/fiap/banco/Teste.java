package br.com.fiap.banco;

public class Teste {

    public static void main(String[] args) {

        // Realizando um teste unitário


        // Construindo um objeto através do Construtor Padrão

        // Referenciando uma variável de referência ao objeto
        Conta cc = new Conta();
        cc.saldo = 50.0;
        cc.agencia = 123;
        cc.numero = 321;

        cc.depositar(1000);

        System.out.println(cc.verificarSaldo());

        // Construindo um objeto através do Construtor de Classes

        // Referenciando uma variável de referência ao objeto
        Conta poupanca = new Conta(111, 222, 1000);
        poupanca.retirar(50);

        System.out.println(poupanca.verificarSaldo());

    }

}
