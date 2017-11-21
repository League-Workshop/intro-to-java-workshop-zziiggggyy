package day4;

import java.util.Random;

import javax.swing.JOptionPane;

public class AwesomeOrNot {
	public static void main(String[] args) {
	// 1. Make a main method that includes all the steps below…

	// 2. Make a variable that will hold a random number and put a random number into this variable using "new Random().nextInt(4)"
		Random cheese = new Random();
		int x = cheese.nextInt(4);
	// 3. Print out this variable
		String thing = JOptionPane.showInputDialog("What is something you think is awesome?");
	// 4. Get the user to enter something that they think is awesome

	// 5. If the random number is 0
		if(x==0) {
			JOptionPane.showMessageDialog(null,thing +" is awesome!");
		}
	// -- tell the user whatever they entered is awesome!

	// 6. If the random number is 1
		else if(x==1) {
			JOptionPane.showMessageDialog(null,thing +" is ok.");
		}
	// -- tell the user whatever they entered is ok.

	// 7. If the random number is 2
		else if(x==2) {
			JOptionPane.showMessageDialog(null,thing +" is boring.");
		}
	// -- tell the user whatever they entered is boring.

	// 8. If the random number is 3
		else if(x==3) {
			JOptionPane.showMessageDialog(null,thing +" is the stupidest thing ever!!!");
		}
	// -- write your own answer

}


}