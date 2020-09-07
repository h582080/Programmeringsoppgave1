package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave6 {
	
	public static void main(String[] args) {
		String melding = "Skriv inn et heltall";		
		int f = 1;
		int n = Integer.parseInt(showInputDialog(melding));
		if (n > 0) { 
			for (int i=1; i<=n; i++)
				f =f*i;
			

			showMessageDialog(null, n + "! =" + f);
		}  else  {
			showMessageDialog(null, "ERROR: HUSK Å SKRIVE HELTALL");
		}
	}
}
