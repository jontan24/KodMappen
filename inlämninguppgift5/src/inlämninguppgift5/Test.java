package inlämninguppgift5;

public class Test {
	public static void main(String[] args) {
		Account accountA = new Account();
		Account accountB = new Account();
		Account accountC = new Account();
		Account accountD = new Account();
		Personregister register = new Personregister();
		Person person1 = new Person();
		Person person2 = new Person();

		person1.setPNbr("9612248832");
		person1.setName("jonathan");
		person1.addAccount(accountA);
		person1.addAccount(accountB);
		person2.setPNbr("6609091223");
		person2.setName("Gregorius");
		person2.addAccount(accountC);
		person2.addAccount(accountD);

		accountA.setBalance(66000);
		accountA.setNbr("96");
		accountB.setBalance(1000);
		accountB.setNbr("88");
		accountC.setBalance(20000);
		accountC.setNbr("12");
		accountD.setBalance(10);
		accountD.setNbr("120");

		register.add(person1);
		register.add(person2);

		
		System.out.println(person1.getNbr);
	}

}
