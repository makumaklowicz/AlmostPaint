package paint;
import java.awt.Dimension;
import java.awt.Color;

//Klasa do zapisywania Elips

public class Elipsa {
	private Dimension srodek;
	Color kolor, kolorWyp;
	int wysokosc,szerokosc;

	public Dimension getSrodek() {
		return srodek;
	}

	public void setSrodek(Dimension srodek) {
		this.srodek = srodek;
	}
	
	public Elipsa (Dimension srodek, Color i,Color a,int newWysokosc,int newSzerokosc) {
		this.srodek = srodek;
		this.kolor=i;
		wysokosc=newWysokosc;
		szerokosc=newSzerokosc;
		this.kolorWyp=a;
		
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
	public Color getKolorWyp() {
		return kolorWyp;
	}

}