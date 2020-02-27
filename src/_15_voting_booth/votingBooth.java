package _15_voting_booth;

import javax.swing.JOptionPane;

public class votingBooth {
public static void main(String[] args) {
	String birth = JOptionPane.showInputDialog("How old are you?");
	int age = Integer.parseInt(birth);
	if (age >= 18) {
		String president = JOptionPane.showInputDialog("Who do you want to be President?");
	}
	else {
		JOptionPane.showMessageDialog(null, "NO ONE CARES WHAT YOU THINK!!!");
	}
	
}
}
