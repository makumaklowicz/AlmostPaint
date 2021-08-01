package paint;

import javax.swing.SwingUtilities;

//Utworzenie okna

public class Run {
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			public void run() {
				Okno okno=new Okno();
			}
		});
	}
}

