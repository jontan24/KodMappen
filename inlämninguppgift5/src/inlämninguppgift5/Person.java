package inlämninguppgift5;
import java.util.ArrayList;
public class Person {
	
	private ArrayList<Account> Account = new ArrayList<Account>();
	public void setAccount(ArrayList<Account> a) {
		Account = a;
	}
	private String pNbr;
	private String name;
	
	public String getPNbr() {
		return pNbr;
	}
	public void setPNbr(String pNbr) {
		this.pNbr = pNbr;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void addAccount(Account a) {
		Account.add(a);
	}
	
	}

