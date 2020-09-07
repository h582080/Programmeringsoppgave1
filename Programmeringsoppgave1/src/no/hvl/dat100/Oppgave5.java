package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave5 {
	public static void main(String[] args) {
		int a = 10;
		String melding = "Skriv inn poengsum";
		for (int i=1; i<=a; i++) {
			int poeng = Integer.parseInt(showInputDialog(melding));
		
	    
		if (0 <= poeng && poeng <=39 ) {
			showMessageDialog (null, "Karkateren er F " + "For Student: " + i);
		}
		else if (40 <= poeng && poeng <=49 ) {
			showMessageDialog (null, "Karkateren er E " + "For Student: " + i);
		}
		else if (50 <= poeng && poeng <=59 ) {
			showMessageDialog (null, "Karkateren er D " + "For Student: " + i);
		}
		else if (60 <= poeng && poeng <=79 ) {
			showMessageDialog (null, "Karkateren er C " + "For Student: " + i);
		}
		else if ( 80<= poeng && poeng <=89 ) {
			showMessageDialog (null, "Karkateren er B " + "For Student: " + i);
		}
		else if (90 <= poeng && poeng <=100 ) {
			showMessageDialog (null, "Karkateren er A " + "For Student: " + i);
		} else {
			showMessageDialog (null, "ERROR: SKRIV EN PEONGSUM MELLOM 0-100");
			i--;
		}
	}
		
	}

}