package Day14;

public class Country {

	String name;
	int states;
	int ut;
	String villan;

	public Country(String name, int states, int ut, String villan) {
		super();
		this.name = name;
		this.states = states;
		this.ut = ut;
		this.villan = villan;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", states=" + states + ", ut=" + ut + ", villan=" + villan + "]";
	}

	public boolean equals(Object obj1) {
		if (obj1 instanceof Country) {
			Country obj = (Country) obj1;

			if (this.name != obj.name) {
				return false;
			} else if (this.states != obj.states) {
				return false;
			} else if (this.ut != obj.ut) {
				return false;
			} else if (this.villan != obj.villan) {
				return false;
			} else {
				return true;
			}
		}
		return false;
	}

}
