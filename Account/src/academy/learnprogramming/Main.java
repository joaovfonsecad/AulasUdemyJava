package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
	Account bobsAcount = new Account();
	// "12345", 0.00, "Bob brown", "myemail@bob.com", "(087) 123-4567");
//	bobsAcount.setNumber("12345");
//	bobsAcount.setBalance(0.00);
//	bobsAcount.setCustomerName("Robert Brown");
//	bobsAcount.setCustomerEmailAdress("myemail@bob.com");
//	bobsAcount.setCustomerPhoneNumber("(087) 123-4567");

		System.out.println(bobsAcount.getNumber());
		System.out.println(bobsAcount.getBalance());

		bobsAcount.withdrawal(100.0);

		bobsAcount.deposit(50.0);
		bobsAcount.withdrawal(100.0);

		bobsAcount.deposit(51.0);
		bobsAcount.withdrawal(100.0);

		System.out.println("");

		Account timsAccount = new Account("Tim", "tim@email.com", "12345");
		System.out.println(timsAccount.getNumber() + " name " + timsAccount.getCustomerName());

		System.out.println("");

		VipCustomer vip = new VipCustomer("Jonn", 9000, "jonnmclane@gmail.com");
		System.out.println("Name: " + vip.getName() + "\nEmail: " + vip.getEmailAdress() + "\nLimit: " + vip.getCreditLimit() + "\n");

		VipCustomer vip2 = new VipCustomer("Jonn", 9000);
		System.out.println("Name: " + vip2.getName() + "\nEmail: " + vip2.getEmailAdress() + "\nLimit: " + vip2.getCreditLimit() + "\n");

		VipCustomer vip3 = new VipCustomer();
		System.out.println("Name: " + vip3.getName() + "\nEmail: " + vip3.getEmailAdress() + "\nLimit: " + vip3.getCreditLimit() + "\n");

    }
}
