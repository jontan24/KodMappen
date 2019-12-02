package lektion6;

public abstract class Vara {
private String varuNummer;
private double inkPris;
private String namn;

public String getVaruNummer() {
	return varuNummer;
}
public void setVaruNummer(String vNr) {varuNummer = vNr;
}
public double getInkPris() {
	return inkPris;
}
public void setInkPris(double nyttPris) {
	inkPris = nyttPris;
}
public String getNamn() {
	return namn;
}
public void setNamn(String nyttNamn) {
	namn = nyttNamn;
}
public abstract double fpris();

}


