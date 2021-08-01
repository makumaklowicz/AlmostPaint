package paint;


//Klasa do zapisywania siatki

public class Siatka {
	int x1,x2,y1,y2;
	public Siatka(int newx1, int newy1,int newx2,int newy2) {
		x1=newx1;
		x2=newx2;
		y1=newy1;
		y2=newy2;	
	}
	public int getX1() {
		return x1;
	}
	public int getX2() {
		return x2;
	}	
	public int getY1() {
		return y1;
	}
	public int getY2() {
		return y2;
	}
}

