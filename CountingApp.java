/*
 *CountingApp.java
 *@author:Rich Mangan
 *Date: 21/11/2013
 *BSHC1B
 */
import javax.swing.JOptionPane;
public class CountingApp{
	public static void main (String args[]){
		String sentence;
		int spaces, vow, cons;

		Counting myCounting = new Counting();

		sentence=JOptionPane.showInputDialog(null, "Enter a sentence ");

		myCounting.setSentence(sentence);

		myCounting.compute();
		spaces=myCounting.getSpaces();
		vow=myCounting.getVow();
		cons=myCounting.getCons();
		JOptionPane.showMessageDialog(null, "There are "+spaces+" spaces, "+vow+" Vowels and "+cons+" consenants in that sentence");
	}
}

