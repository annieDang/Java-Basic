package Day_6.fundamental.ifelse;

import javax.swing.JOptionPane;

public class AreYouCrazyV2 {
	public static void main(String args[]) {
		boolean areYouNut = false;
		if (areYouNut) {
			System.out.println("Oh...No! Please see a doctor!");
		} else {
			System.out.println("Nice! I was worried that you are.");
		}
		String answer = JOptionPane.showInputDialog("Are you nut? Type Y or N");
		
		String responseMessage;
		if (answer.equals("Y")) {
			responseMessage = "Oh...No! Please see a doctor!";
		} else {
			responseMessage = "Nice! I was worried that you are.";
		}

		// display the message to welcome the user by name
		JOptionPane.showMessageDialog(null, responseMessage);
	}
}
