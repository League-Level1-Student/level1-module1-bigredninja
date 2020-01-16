package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
public static void main(String[] args) {
	PopcornMaker grinch = new PopcornMaker();
	Microwave m = new Microwave();
	String flavor= JOptionPane.showInputDialog("what flavor popcorn should I use.");
	Popcorn pop = new Popcorn(flavor);
	m.putInMicrowave(pop);
	m.setTime(1);
	m.startMicrowave();
	pop.applyHeat();
	
}
}
