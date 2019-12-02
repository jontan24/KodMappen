package lektion6;
//övning sida 96
public class Test {

	public static void main(String[] args) {
		VaraA va = new VaraA();
		va.setVaruNummer("OH1");
		va.setInkPris(100);
		va.setNamn("overhead");
		System.out.println(va.getInkPris());
		
		
		VaraB vb = new VaraB();
		vb.setVaruNummer("st1");
		vb.setNamn("stol");
		vb.setInkPris(150);
		System.out.println(vb.getNamn());
		
		System.out.println(va.fPris());
		System.out.println(vb.fPris());
	}
	
}
