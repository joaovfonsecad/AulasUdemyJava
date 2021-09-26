package academy.learnprogramming;

public class VipCustomer {

    private String name;
    private double creditLimit ;
    private String emailAdress;

    public VipCustomer() {
        this("Unknow Name", 0.00, "unknown@email.com");
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "default@mail.br");
    }

    public VipCustomer(String name, double creditLimit, String emailAdress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAdress = emailAdress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAdress() {
        return emailAdress;
    }
}
