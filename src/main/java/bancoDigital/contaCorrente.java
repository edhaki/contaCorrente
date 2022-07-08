/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancoDigital;

/**
 *
 * @author Ederson .A Silva
 */
public class contaCorrente {
    private String alterarNome;
    private int deposito,saque;
    private float saldo;

    public contaCorrente(String alterarNome, int deposito, int saque, float saldo) {
        this.alterarNome = alterarNome;
        this.deposito = deposito;
        this.saque = saque;
        this.saldo = saldo;


    }

    public String getAlterarNome() {
        return alterarNome;
    }

    public int getDeposito() {
        return deposito = deposito;
    }

    public int getSaque() {
        return saque;
    }

    public float getSaldo() {
        return saldo = saldo;
    }

    public void setAlterarNome(String alterarNome) {
        this.alterarNome = alterarNome;
    }

    public void setDeposito(int deposito) {
        this.deposito = deposito;
    }

    public void setSaque(int saque) {
        this.saque = saque;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }


    
}
