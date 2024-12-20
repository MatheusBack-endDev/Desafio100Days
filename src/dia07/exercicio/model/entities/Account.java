package dia07.exercicio.model.entities;

import dia07.exercicio.model.exception.Limitexception;

public class Account {

    private Integer number;
    private String holder;
    protected Double balance;
    private  Double withdrawLImit;

    public Account() {

    }

    public Account(Integer number, String holder, Double balance, Double withdrawLImit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLImit = withdrawLImit;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLImit() {
        return withdrawLImit;
    }

    public void setWithdrawLImit(Double withdrawLImit) {
        this.withdrawLImit = withdrawLImit;
    }

    public void withdraw(double amount) throws Limitexception {
        if (withdrawLImit < amount) {
            throw new Limitexception(" limite insuficiente");
        } else if (amount > balance){
            throw new Limitexception("saldo insuficiente");
        } else {
            balance -= amount;
        }
    }

    public void deposit(double amount){
        balance += amount;
    }

}
