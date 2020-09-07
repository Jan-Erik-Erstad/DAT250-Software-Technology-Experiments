package bank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Bank {
    @Id
    private String name;
    private List<CreditCard> creditCards = new ArrayList<>();

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @OneToMany
    public List<CreditCard> getCreditCards() {
        return creditCards;
    }
    public void setCreditCards(List<CreditCard> creditCards) {
        this.creditCards = creditCards;
    }
}
