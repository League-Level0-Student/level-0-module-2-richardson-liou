package _14_rollercoaster;

import javax.swing.JOptionPane;

public class rollercoaster {
public static void main(String[] args) {
	String height = JOptionPane.showInputDialog("How tall are you?(inches)");
	int inches = Integer.parseInt(height);
	
	if (inches > 48) {
		JOptionPane.showMessageDialog(null, "You can ride!");
	}
	else {
		JOptionPane.showMessageDialog(null, "Sorry, you have to grow more first.");
	}
}
}
