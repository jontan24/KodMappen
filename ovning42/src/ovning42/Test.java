package ovning42;

public class Test {

	public static void main(String[] args) {
		L�genhet l�gga = new L�genhet();
		
		l�gga.sethyra(10000);
		l�gga.setYta(400);
		l�gga.setIdnummer(96);
		
		
		System.out.println(l�gga.prisPerKvm());
		System.out.println(l�gga.prisPerKvmPer�r());
		System.out.println(l�gga.prisPer�r());
	}

}
