import bank.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class Main {
    private static final String PERSISTENCE_UNIT_NAME = "bank";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {
        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();


        Address address = new Address();
        address.setStreet("Money street");
        address.setNumber(13);
        Person person = new Person("Bob ross");
        person.getAddress().add(address);
        address.getPersons().add(person);
        CreditCard creditCard = new CreditCard(94147, 9999, 999);
        person.getCreditCards().add(creditCard);
        Pincode pincode = new Pincode("9922");
        creditCard.setPincode(pincode);
        creditCard.setPerson(person);
        Bank bank = new Bank();
        bank.getCreditCards().add(creditCard);
        bank.setName("Forest Bank");
        creditCard.setBank(bank);


        em.getTransaction().begin();
        em.persist(address);
        em.persist(person);
        em.persist(creditCard);
        em.persist(pincode);
        em.persist(bank);
        em.getTransaction().commit();


    }
}
