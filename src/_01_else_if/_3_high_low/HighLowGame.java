
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {

		int random = new Random().nextInt(1000);

		//JOptionPane.showMessageDialog(null, random);

		int win = 0;
		
		JOptionPane.showMessageDialog(null, "You must guess the random\nnumber between 1-1000 to win!");
		JOptionPane.showMessageDialog(null, "You will have 10 attempts\nto guess the number and\nwill recieve a hint after\neach guess.");
		JOptionPane.showOptionDialog(null, "Can you do it?", "Info", 0, JOptionPane.INFORMATION_MESSAGE, null, new String[] { "YES" }, null);
		
		for (int i = 0; i < 10; i++) {
			
			String userGuess = JOptionPane.showInputDialog("Guess the number!");

			int usersGuess = Integer.parseInt(userGuess);
			
			if (usersGuess == random) {
				JOptionPane.showOptionDialog(null, "Congratulations, you win!", "Win Screen", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Hooray" }, null);
				win = 1;
				break;
			}

			if (usersGuess > random) {
				JOptionPane.showOptionDialog(null, "Your guess is too high!", "Hint screen", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "OK" }, null);
			}

			if (usersGuess < random) {
				JOptionPane.showOptionDialog(null, "Your guess is too low!", "Hint screen", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "OK" }, null);
			}
			
		}
			
			if (win == 1) {
				
			}
			else if (win == 0) {
				JOptionPane.showOptionDialog(null, "You lose! Do better next time!", "Lose Screen", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "OK" }, null);
		}	
	}
}


