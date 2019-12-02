package ovning41;

public class Test {

	public static void main(String[] args) {
		Anställd j = new Anställd();
		j.setnamn("Jonathan");
		j.setPersonnummer("9612248832");
		j.setTimlön(125);
		j.setArbetadeTimmar(40);

		System.out.println("Din månadslön är " + j.månadslön());
		System.out.println("Ditt namn är " + j.getNamn());
		System.out.println("Ditt personnummer är " + j.getPersonnummer());
		System.out.println("Din timlön är " + j.getTimlön());
		System.out.println("Du har arbetat " + j.getArbetadeTimmar ());

	}

}// ITS WORKING!!!!!!!
