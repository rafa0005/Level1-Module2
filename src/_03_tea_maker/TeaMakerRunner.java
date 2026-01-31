package _03_tea_maker;

import javax.swing.JOptionPane;

public class TeaMakerRunner {

	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("what type of tea would you like?");
		TeaBag green = new TeaBag(flavor);
		Kettle pot = new Kettle();
		pot.boil();
		Cup mug = new Cup();
		mug.makeTea(green, pot.getWater());
		
		
	}
}
