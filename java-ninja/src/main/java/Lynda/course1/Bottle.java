package Lynda.course1;

class MedicineBottle extends Bottle {
	String medName;
	public MedicineBottle(String medName) {
		super("beer", "hagu", 1.0);
		this.item = "medicine";
		this.medName = medName;
	}
}
class BeerBottle extends Bottle {
	public BeerBottle() {
		super("beer", "hagu", 10.0);
		this.item = "beer";
	}
}
public class Bottle {
	private String name;
	private String colour;
	private double strength;
	String item;

	public Bottle(String name, String colour, double strength) {
		super();
		this.setName(name);
		this.colour = colour;
		this.strength = strength;

	}

	public Bottle fight(Bottle b) {
		if (b.strength > this.strength)
			return (b);
		else if (b.strength < this.strength)
			return (this);
	    else
		return null;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
