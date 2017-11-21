package day3;

import javax.swing.JOptionPane;

public class HelloWorldItsYourWildGirl {
	public static void main(String[] args) {
		//String pile = "I am taking to you.";
		//JOptionPane.showMessageDialog(null,"I am talking to you, no, "+ pile);
		String name = JOptionPane.showInputDialog("What is your name?");
		JOptionPane.showMessageDialog(null,"Hello "+name+". I am your computer.");
		JOptionPane.showMessageDialog(null,"Please call me John");
		String reaction = JOptionPane.showInputDialog("How do you feel about your computer coming to life?");
				if(reaction.equalsIgnoreCase("not surprised")) {
					JOptionPane.showMessageDialog(null,"Processing system down. Please Reboot");
				}
				else {
					JOptionPane.showMessageDialog(null,"Just as calculated");
				}
				}
		}
	


