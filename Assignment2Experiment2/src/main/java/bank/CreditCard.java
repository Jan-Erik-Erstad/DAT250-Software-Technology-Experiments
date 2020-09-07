package bank;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private int number;
    private int limit;
    private int balance;
    private Person person;
    private Bank bank;
    private Pincode pincode;

    public CreditCard(int number, int limit, int balance) {
        this.number = number;
        this.limit = limit;
        this.balance = balance;
    }

    public CreditCard() {

    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getLimit() {
        return limit;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    @ManyToOne
    public Person getPerson() {
        return this.person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    @ManyToOne
    public Bank getBank() {
        return this.bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @ManyToOne
    public Pincode getPincode() {
        return this.pincode;
    }
    public void setPincode(Pincode pincode) {
        this.pincode = pincode;
    }


}
