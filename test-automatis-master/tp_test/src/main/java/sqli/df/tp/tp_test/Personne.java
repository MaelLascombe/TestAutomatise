package sqli.df.tp.tp_test;

public class Personne {
	private String nom;
	private int note, totaldrinked;
	private boolean hasPaid;
	
	public Personne(String nom) {
		this.nom = nom;
		this.note = 0;
		this.totaldrinked = 0;
		this.hasPaid = false;
	}

	public String getNom() {
		return this.nom;
	}

	public void addDrink(int price) {
		this.note = this.getNote() + price;
		this.totaldrinked +=1;
	}
	
	public void offerDrink(int price) {
		this.note = this.getNote() + price;
	}
	
	public void haveFreeDrink() {
		this.totaldrinked +=1;
	}
	
	public boolean isMrPignonHappy() {
		if (this.nom == "Mr Pignon") {
			if (this.totaldrinked <= 1) {
				return true;
			}else{return false;}
		} else {return true;}
	}

	public int getNote() {
		return note;
	}

	public String toString() {
		return this.nom;
	}

	public boolean paid() {
		// TODO Auto-generated method stub
		hasPaid = true;
		return this.hasPaid;
	}

}
