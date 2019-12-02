package ovning41;

public class Anställd {
	private String namn;
	private String personnummer;
	private int timlön;
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
	public int getTimlön() {
		return timlön;
	}
	public void setTimlön(int tLön) {
		timlön = tLön;
	}
	public int getArbetadeTimmar() {
		return arbetadeTimmar;
	}
	public void setArbetadeTimmar(int arbTim) {
		arbetadeTimmar = arbTim;
	}
	public int månadslön() {
		return timlön * arbetadeTimmar;
		
	}
}