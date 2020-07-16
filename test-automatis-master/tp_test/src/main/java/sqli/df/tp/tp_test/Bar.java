package sqli.df.tp.tp_test;

import java.util.List;

public class Bar {
	private int capacite;
	private List<Personne> occupation;
	private boolean full;

	public Bar(int arg1) {
		this.capacite = arg1;
		this.full = false;
	}

	public boolean getFull() {
		return this.full;
	}

	public void setOccupation(List<Personne> list) {
		this.occupation = list;
		if (this.occupation.size() == this.capacite)
			this.full = true;
	}
	
	public boolean isItFull(List<Personne> people) {
		if (capacite >= (occupation.size() + people.size())) {
			this.occupation.addAll(people);
			if (this.occupation.size() == this.capacite)
				this.full = true;
			return false;
			}
		else {return true;}
	}
	
	public List<Personne> getOccupation(){
		return occupation;
	}
	
	public Personne getClientByName(String name) {
		for (int i=0; i<this.occupation.size();i++) {
			if (this.occupation.get(i).getNom().compareTo(name) == 0) {
				return this.occupation.get(i);
			}
		}

		return null;
		
			
		
	}
}
