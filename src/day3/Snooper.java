package day3;

import javax.swing.JOptionPane;

public class Snooper {
public static void main(String[] args) { 
	String Mew = "Congradulations you have been choosen by Nintendo to recieve a free Mew and Mewtwo";
	speak(Mew);
	JOptionPane.showMessageDialog(null, "Congradulations you have been choosen by Nintendo to recieve a free Mew and Mewtwo");
	
	String Mewtwo = "All you have to do is enter your gmail acount and password so we know who to send the Mew and Mew 2 to. Put your username then enter and put your password";
	speak(Mewtwo);
	String gmail = JOptionPane.showInputDialog("All you have to do is enter your gmail acount and password so we know who to send the Mew and Mew 2 to. Put your username then enter and put your password");
	
	String dollars = "Wait as we were going through your account it seems that you have spent 2000 dollars on Pokemon Go coins. Is this true?";
	speak(dollars);
	String answer = JOptionPane.showInputDialog("Wait as we were going through your account it seems that you have spent 2000 dollars on Pokemon Go coins. Is this true?");

	String money = "You didn't! Quickly send us your bank account number and we will reverse this transaction";
	speak(money);
	String bank = JOptionPane.showInputDialog("You didn't! Quickly send us your bank account number and we will reverse this transaction" );

	
	String end = "The transaction has been reversed the free Mew and Mewtwo should appear on you screen any moment. Thank You.";
	speak(end);
	JOptionPane.showMessageDialog(null, "The transaction have been reversed the free Mew and Mewtwo should appear on you acreen any moment. Thank You.");

}


static void speak(String words) {
	try {
		Runtime.getRuntime().exec("say " + words).waitFor();
	} catch (Exception e) {
		e.printStackTrace();
	}
}
}
