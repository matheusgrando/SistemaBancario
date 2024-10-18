package br.com.fiap.banco.teste;

import br.com.fiap.banco.beans.Conta;
import br.com.fiap.banco.beans.ContaCorrente;

public class Teste {

    public static void main(String[] args) {

        // Realizando um teste unitário


        // Construindo um objeto através do Construtor Padrão

        // Referenciando uma variável de referência ao objeto
        Conta cc = new Conta();
        cc.depositar(50.0);
        cc.setAgencia(123);
        cc.setNumero(321);

        cc.depositar(1000);

        System.out.println(cc.getSaldo());

        // Construindo um objeto através do Construtor de Classes

        // Referenciando uma variável de referência ao objeto
        Conta poupanca = new Conta(111, 222, 1000);
        poupanca.retirar(50);

        System.out.println(poupanca.getSaldo());




        System.out.println("-----------------");

        // Testando o Polimorfismo

        // Exemplo 1
        // Gerando um objeto da superclasse Conta, que será controlado
        // por uma variável de controle a partir da superclasse Conta.
        Conta conta1 = new Conta();
        conta1.depositar(1000);
        conta1.retirar(100);

        // Exemplo 2
        // Gerando um objeto da subclasse ContaCorrente, que será controlado
        // por uma variável de controle a partir da subclasse ContaCorrente.
        ContaCorrente conta2 = new ContaCorrente();
        conta2.depositar(1000);
        conta2.retirar(100);

        // Exemplo 3
        // Gerando um objeto da subclasse ContaCorrente, que será controlado
        // por uma variável de controle a partir da superclasse Conta.
        Conta conta3 = new ContaCorrente();
        conta3.depositar(1000);
        conta3.retirar(100);

        System.out.println("Conta1: " + conta1.getSaldo());
        System.out.println("Conta2: " + conta2.getSaldo());
        System.out.println("Conta3: " + conta3.getSaldo());


    }

}
