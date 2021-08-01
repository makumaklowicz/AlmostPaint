package paint;

import java.awt.Dimension;
import java.awt.Color;

//Klasa do zapisywania kó³ek

public class Kolo {
	
	Color kolor,kolorWyp;

	public Dimension getSrodek() {
		return srodek;
	}

	public void setSrodek(Dimension srodek) {
		this.srodek = srodek;
	}

	public int getR() {
		return r;
	}

	public void setR(int r) {
		this.r = r;
	}

	private Dimension srodek;
	private int r;

	public Kolo(Dimension srodek, int r,Color i,Color a) {
		this.srodek = srodek;
		this.r = r;
		this.kolor=i;
		this.kolorWyp=a;
	}
	
	
	
	public Color getKolor() {
		return kolor;
	}
	public Color getKolorWyp() {
		return kolorWyp;
	}

}
