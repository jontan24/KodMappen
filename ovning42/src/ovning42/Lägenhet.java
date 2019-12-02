package ovning42;

public class L�genhet {
	private int idnummer;
	private int hyra;
	private int yta;

	public int getIdnummer() {
		return idnummer;
	}

	public void setIdnummer(int idNr) {
		idnummer = idNr ;
	}

	public int gethyra() {
		return hyra;
	}
	public void sethyra(int hr) {
		hyra=hr;
	}
	public int getYta() {
		return yta;
	}
	public void setYta(int yt) {
		yta = yt;
	}
	public int prisPerKvmPer�r() {
		return (hyra*12) / yta;
	}
	public int prisPerKvm() {
		return hyra / yta;
	}
	public int prisPer�r() {
		return hyra * 12;
	}
}
