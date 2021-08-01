package paint;

import java.awt.Dimension;
import java.awt.Color;

//Klasa do zapisywania linii dowolnej

public class Linia {
	
	Color kolor;
	int wysokosc,szerokosc;
	private Dimension srodek;

	public Dimension getSrodek() {
		return srodek;
	}

	public void setSrodek(Dimension srodek) {
		this.srodek = srodek;
	}

	public Linia (Dimension srodek, Color i,int newWysokosc,int newSzerokosc) {
		this.srodek = srodek;
		this.kolor=i;
		wysokosc=newWysokosc;
		szerokosc=newSzerokosc;
		
	}
	
	public int getWysokosc() {
		return wysokosc;
	}
	public int getSzerokosc() {
		return szerokosc;
	}

	
	public Color getKolor() {
		return kolor;
	}

}
