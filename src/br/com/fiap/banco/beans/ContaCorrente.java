package br.com.fiap.banco.beans;

public class ContaCorrente extends Conta {

    private String tipo;
    private double chequeEspecial;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getChequeEspecial() {
        return chequeEspecial;
    }

    public void setChequeEspecial(double chequeEspecial) {
        this.chequeEspecial = chequeEspecial;
    }

    public double getSaldoDisponivel() {
        return super.getSaldo() + chequeEspecial;
    }

    // Sobrescrita de Método
    /*
    Desse modo, ao utilizarmos o método "retirar" a partir de um objeto de ContaCorrente(),
    o método "retirar" chamado passa a não ser mais o da superclasse Conta.
     */

    @Override
    public void retirar(double valor) {
        valor += 10;
        super.retirar(valor);
    }

}
