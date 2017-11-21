package day4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		// 2.  Ask the user a question 
				String answer1 = JOptionPane.showInputDialog("What is love?");
		if(answer1.equalsIgnoreCase("Baby don't hurt me, don't hurt me, no more")) {
			score+=1;
		}
		String answer2 = JOptionPane.showInputDialog("What is the meaning of life?");
		if(answer2.equalsIgnoreCase("42")) {
			score+=1;
		}
		String answer3 = JOptionPane.showInputDialog("What does 1+1 =?");
		if(answer3.equalsIgnoreCase("window")) {
			score+=1;
		}
		String answer4 = JOptionPane.showInputDialog("How do you make a table?");
		if(answer4.equalsIgnoreCase("You make a chair, and don't sit on it.")) {
			score+=1;
		}
		String answer5 = JOptionPane.showInputDialog("What is the best color?");
		if(answer5.equalsIgnoreCase("Black, it is the most dominanat.")) {
			score+=1;
		}
		String answer6 = JOptionPane.showInputDialog("Who controls the Senate?");
		if(answer6.equalsIgnoreCase("Chancellor Palpatine")) {
			score+=1;
		}
		JOptionPane.showMessageDialog(null,"Your score is: "+score+"/6");
		
		
		
		// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
