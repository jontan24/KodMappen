package ovning41;

public class Anst�lld {
	private String namn;
	private String personnummer;
	private int timl�n;
	private int arbetadeTimmar;

	public String getNamn() {
		return namn;
}
	public void setnamn(String nyttNamn) { 
		namn = nyttNamn;
}
	public String getPersonnummer() {
		return personnummer;
	}
	public void setPersonnummer(String pNr) {
		personnummer = pNr;
	}
	public int getTiml�n() {
		return timl�n;
	}
	public void setTiml�n(int tL�n) {
		timl�n = tL�n;
	}
	public int getArbetadeTimmar() {
		return arbetadeTimmar;
	}
	public void setArbetadeTimmar(int arbTim) {
		arbetadeTimmar = arbTim;
	}
	public int m�nadsl�n() {
		return timl�n * arbetadeTimmar;
		
	}
}