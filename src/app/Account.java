package app;

public class Account {

    private double balance;
    private int number;
    private int agency;
    private Client holder;
    private static int total;

    public Account (int agency, int number){
        this.setAgency(agency);
        this.setAgency(agency);
        Account.total++;
    }

    public void deposit(double value){
        this.balance += value;
    }

    public boolean drawOut(double value){
        if (this.balance >= value) {
            this.balance -= value;
            return true;
        } else {
            return false;
        }
    }

    public boolean transfer(double value, Account destiny){
        if (this.balance >= value){
            this.drawOut(value);
            destiny.deposit(value);
            return true;
        } else {
            return false;
        }
    }

    public double getBalance() {
        return this.balance;
    }

    public void setNumber(int number) {
        if (number > 0){
            this.number = number;
        } else {
            return;
        }
    }

    public int getNumber() {
        return this.number;
    }

    public void setAgency(int agency) {
        if (agency > 0){
            this.agency = agency;
        } else {
            return;
        }
    }

    public int getAgency() {
        return this.agency;
    }

    public void setHolder(Client holder) {
        this.holder = holder;
    }

    public Client getHolder() {
        return this.holder;
    }

    public static int getTotal() {
        return Account.total;
    }
}