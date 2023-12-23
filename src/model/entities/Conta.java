package model.entities;

import model.exception.DomainException;

public class Conta {
    private Integer numeroDaConta;
    private String nomeDaConta;
    private Double saldo;
    private Double limiteDeSaldo;

    public Conta() {
    }

    public Conta(Integer numeroDaConta, String nomeDaConta, Double saldo, Double limiteDeSaldo)  {
        this.numeroDaConta = numeroDaConta;
        this.nomeDaConta = nomeDaConta;
        this.saldo = saldo;
        this.limiteDeSaldo = limiteDeSaldo;
    }

    public void saque (double saque) throws DomainException{
        if(saldo == 0 || saque > limiteDeSaldo){
            throw new DomainException("Saque negado, não pode sacar uma conta com valor 0, ou o saque for maior que o limite de saque!");
        }
         saldo -= saque;
    }

    public Integer getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(Integer numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public String getNomeDaConta() {
        return nomeDaConta;
    }

    public void setNomeDaConta(String nomeDaConta) {
        this.nomeDaConta = nomeDaConta;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Double getLimiteDeSaldo() {
        return limiteDeSaldo;
    }

    public void setLimiteDeSaldo(Double limiteDeSaldo) {
        this.limiteDeSaldo = limiteDeSaldo;
    }

}
