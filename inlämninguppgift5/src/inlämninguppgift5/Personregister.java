package inlämninguppgift5;

import java.util.ArrayList;

public class Personregister {
	private ArrayList<Person> persn = new ArrayList<Person>();

	public ArrayList<Person> getPersn() {
		return persn;
	}

	public void setPersn(ArrayList<Person> nyLista) {
		persn = nyLista;
	}

	public void add(Person p) {
		persn.add(p);
	}

	public Person findPerson(String nbr) {
		for (Person tmp : persn) {
			if (tmp.getPNbr().equals(nbr))
				return tmp;
		}
		return null;
	}
	public Person removePerson(String nbr) {
		this.persn.remove(findPerson(nbr));
		return null;
		}
	}

