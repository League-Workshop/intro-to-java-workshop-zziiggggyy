package day4;

import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

public class DragonFight {
	// 1. Create a main method and put all of the code below inside of it
	public static void main(String[] args) {
		Random pie = new Random();
		ImageIcon dragon = new ImageIcon("src/test/dragonPicture.jpg");		
		
		JOptionPane.showMessageDialog(null, "Defeat the dragon to take its treasure!", "Dragon Fighter", 0, dragon);
		// 2. Create a variable called "playerHealth" to store your health (set it equal to 100)
		int playerHealth = 100;
		// 3. Create a variable called "dragonHealth" to store the dragon's health (set it equal to 100)
		int dragonHealth = 100;
		// 4. Create a variable to hold the damage the player's attack does each round
		
		
		// 6.  Delete the slashes at the beginning of the next line.  
		while(playerHealth>0 && dragonHealth>0) {    //this line of code keeps the battle going until someone's health reaches 0 
		
		// 7. Add a closing mustache at the very bottom of this program (since we just added an opening mustache on the previous step).
		
		// 8. Ask the player in a pop-up if they want to attack the dragon with a yell or a kick
		String attack = JOptionPane.showInputDialog("Would you like to yell or kick at the dragon?");
		// 9. If they typed in "yell":
			if(attack.equalsIgnoreCase("yell")) {
						dragonHealth=dragonHealth-pie.nextInt(11);}
			//-- Subtract that number from the dragon's health variable 
			
		// 10. If they typed in "kick":
			if(attack.equalsIgnoreCase("kick")) {
				dragonHealth=dragonHealth-pie.nextInt(26);}
			//-- Find a random number between 0 and 25 and store it in dragonDamage
			
			//-- Subtract that number from the dragon's health variable
			
			playerHealth=playerHealth-pie.nextInt(36);
		
		// 11.  Find a random number between 0 and 35 and store it in playerDamage
		
		// 12. Subtract this number from the player's health
		if(playerHealth<1) {
			JOptionPane.showMessageDialog(null,"You have died at the claw of a dragon.");
		}
		
		
		
		else if(dragonHealth<1) {
			JOptionPane.showMessageDialog(null,"You have slain the beast and taken the riches!");
	}
		else
			JOptionPane.showMessageDialog(null,"Players Health: "+playerHealth+"\n Dragon health: "+dragonHealth);
	   		}
	}
}
