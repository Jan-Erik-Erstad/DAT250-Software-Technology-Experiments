package bank;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private String id;
    private String street;
    private int number;
    private List<Person> persons = new ArrayList<>();

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    @ManyToMany
    public List<Person> getPersons() {
        return this.persons;
    }

    public void setPersons(List<Person> Persons) {
         this.persons = persons;
    }
}
