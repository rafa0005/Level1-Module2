package _02_smurf;

public class SmurfRunner {
	public static void main(String[] args) {
		Smurf handySmurf = new Smurf("Handy");
		handySmurf.eat();
		System.out.println(handySmurf.getName());
		Smurf papaSmurf = new Smurf("Papa");
		System.out.println(papaSmurf.getName());
		System.out.println("papaSmurfs hat is " + papaSmurf.getHatColor());
		System.out.println("papaSmurf is a " + papaSmurf.isGirlOrBoy());
		Smurf smurfette = new Smurf("Smurfette");
		System.out.println(smurfette.getName());
		System.out.println("smurfettes hat is " + smurfette.getHatColor());
		System.out.println("smurfette is a " + smurfette.isGirlOrBoy());
	}

}
