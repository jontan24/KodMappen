package ovning41;

public class Test {

	public static void main(String[] args) {
		Anst�lld j = new Anst�lld();
		j.setnamn("Jonathan");
		j.setPersonnummer("9612248832");
		j.setTiml�n(125);
		j.setArbetadeTimmar(40);

		System.out.println("Din m�nadsl�n �r " + j.m�nadsl�n());
		System.out.println("Ditt namn �r " + j.getNamn());
		System.out.println("Ditt personnummer �r " + j.getPersonnummer());
		System.out.println("Din timl�n �r " + j.getTiml�n());
		System.out.println("Du har arbetat " + j.getArbetadeTimmar ());

	}

}// ITS WORKING!!!!!!!
