package Day_3;

//Basic input with a dialog box.
import javax.swing.JOptionPane;

public class GetAnInput {
	public static void main(String args[]) {
		String name = JOptionPane.showInputDialog("What is your name?");
		// create the message
		String message = String.format("Welcome, %s!", name);

		// display the message to welcome the user by name
		JOptionPane.showMessageDialog(null, message);
	} // end main
}