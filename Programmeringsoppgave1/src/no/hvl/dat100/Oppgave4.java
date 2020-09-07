package no.hvl.dat100;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {
	public static void main(String[] args) {
		double sats = 0; 
		
		String melding = "Skriv inn bruttoinntenkt"; 
		
			int brutto = Integer.parseInt(showInputDialog(melding));
			if ( 0 <= brutto && brutto <= 164100) {
				sats = 0;
		
                showMessageDialog(null, "Trinnskatt er: " + sats * brutto);
                }
                
			else if (164101 <= brutto && brutto <= 230950 ) {
    				sats = 0.0019;
    		
                    showMessageDialog (null, "Trinnskatt er: " + sats * brutto);    
			}
			else if (230951 <= brutto && brutto <= 580650 ) {
				sats = 0.042;
		
                showMessageDialog (null, "Trinnskatt er: " + sats * brutto);    
		    }
			else if ( 580651 <= brutto && brutto <= 934050) {
				sats = 0.132;
		
                showMessageDialog (null, "Trinnskatt er: " + sats * brutto);    
			}
                else if ( 934051 <= brutto) {
    				sats = 0.162;
    		
                    showMessageDialog (null, "Trinnskatt er: " + sats * brutto); 
            }
           
  }
}