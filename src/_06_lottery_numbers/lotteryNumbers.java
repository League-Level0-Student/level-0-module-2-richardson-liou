package _06_lottery_numbers;

import java.util.Random;

import javax.swing.JOptionPane;

public class lotteryNumbers {
public static void main(String[] args) {
	
	Random rand = new Random();
	int randomNumber1 = rand.nextInt(5);
	Random ran = new Random();
	int randomNumber2 = rand.nextInt(5);
	Random rando = new Random();
	int randomNumber3 = rand.nextInt(5);
	Random random = new Random();
	int randomNumber4 = rand.nextInt(5);
	Random randomo = new Random();
	int randomNumber5 = rand.nextInt(5);
	
	JOptionPane.showMessageDialog(null, "Your lottery numbers are "+ randomNumber1 + ", "+ randomNumber2 +", " +randomNumber3+ ", "+ randomNumber4+", "+ randomNumber5 );
	
}
}
