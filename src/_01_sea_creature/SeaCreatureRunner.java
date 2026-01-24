package _01_sea_creature;

public class SeaCreatureRunner {

	public static void main(String[] args) {
		SeaCreature spongeBob = new SeaCreature("spongeBob");
		spongeBob.eat();
		spongeBob.laugh();
		SeaCreature patrick = new SeaCreature("patrick");
		patrick.eat();
		patrick.laugh();
		SeaCreature squidward = new SeaCreature("squidward");
		squidward.eat();
		squidward.laugh();
	}
}
