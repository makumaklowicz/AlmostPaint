package paint;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;

public class MyJPanel extends JPanel{
	//Listy na których zapisywane s¹ poszczególne objekty
	List<Kolo> lista = new ArrayList<>();
	List<Prostokat> lista1 = new ArrayList<>();
	List<Elipsa> lista2 = new ArrayList<>();
	List<Prosta> lista3 = new ArrayList<>();
	List<Linia> lista4 = new ArrayList<>();
	List<Siatka> lista5 = new ArrayList<>();
	//Ró¿ne zmienne
	Dimension srodek;
	protected int rTemp;
	Color currentColor=Color.BLACK;
	Color currentColorWyp=Color.white;
	int xs,ys,xss,yss;
	int wybor=0;
	int xas=0;
	int prevX=0;
	int prevY=0;
	int setX=1000;
	int setY=1000;
	boolean wypelnienie=false;

	//Funkcje
	
public int getWybor() {
	return wybor;
}
public int getWysokosc() {
	return xss-xs;
}
public int getDlugosc() {
	return yss-ys;
}
	
	public void setWypelnienie(boolean x) {
		wypelnienie=x;
	}
		
	public void CzyscSiatke() {
		lista5.clear();
		repaint();
	}
	public void ZapelnijSiatke() {
		lista5.clear();
		int pom1=getPreferredSize().width;
		int pom2=getPreferredSize().height;
		int wiersze=0;
		int kolumny=0;
		while (wiersze<pom2) {
			kolumny=0;
			while(kolumny<pom1) {
				lista5.add( new Siatka(kolumny,wiersze,2,2 ));
				kolumny=kolumny+20;
			}
			wiersze=wiersze+20;
		}
	}
	
	
	public void Wymaz() {
		lista.clear();
		lista1.clear();
		lista2.clear();
		lista3.clear();
		lista4.clear();
		repaint();
	}
	
	public void setDim(int a, int b) {
		setX=a;
		setY=b;
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(setX,setY);
	}

	//Zdarzenia zwi¹zane z myszk¹
	
	MyJPanel() {
		addMouseListener( new MouseAdapter() {

			public void mousePressed(MouseEvent e) {
				if(wybor==3) {
				if(e.getButton()==MouseEvent.BUTTON1) {
					
					
					xas++;
					if(xas>1) {
					lista3.add( new Prosta( srodek ,currentColor,yss,xss));
					repaint();
					xs=e.getX();
					ys=e.getY();
					srodek = new Dimension( xs, ys );
					}
					if(xas<=1) {
					srodek = new Dimension( e.getX(), e.getY() );
					xs=e.getX();
					ys=e.getY();
					}
					
				}
				else if(e.getButton()==MouseEvent.BUTTON3) {
					xas=0;
					srodek = null;
					repaint();
				}
				}
				else {
				srodek = new Dimension( e.getX(), e.getY() );
				xs=e.getX();
				ys=e.getY();
				repaint();
				}
			}

			public void mouseReleased(MouseEvent e) {
				if (wybor==0) {
				int r = (int)Math.sqrt( (e.getX()-srodek.width)*(e.getX()-srodek.width) + (e.getY()-srodek.height)*(e.getY()-srodek.height) );
				lista.add( new Kolo( srodek, r ,currentColor,currentColorWyp));
				srodek = null;
				rTemp = 2;
				repaint();
				}
				else if (wybor==1) {
					lista1.add( new Prostokat( srodek ,currentColor,currentColorWyp,yss,xss));
					srodek = null;
					rTemp = 2;
					repaint();
				}
				else if (wybor==2) {
					lista2.add( new Elipsa( srodek ,currentColor,currentColorWyp,yss,xss));
					srodek = null;
					rTemp = 2;
					repaint();
				}
				
				
			}

		} );
		addMouseMotionListener( new MouseAdapter() {
			
			public void mouseDragged(MouseEvent e) {
				if(wybor!=3 & wybor!=4) {
					
				rTemp = (int)Math.sqrt( (e.getX()-srodek.width)*(e.getX()-srodek.width) + (e.getY()-srodek.height)*(e.getY()-srodek.height) );
				xss=e.getX();
				yss=e.getY();
				repaint();
				}
				if(wybor==4) {
					xss=e.getX();
					yss=e.getY();
					lista3.add( new Prosta( srodek ,currentColor,yss,xss));
					srodek = new Dimension( e.getX(), e.getY() );
					repaint();
					
				}
				
			};
			public void mouseMoved(MouseEvent e) {
				if(wybor==3) {
					xss=e.getX();
					yss=e.getY();
					repaint();
				}
			    }

		});
	}
	//Funkcje zwi¹zane z wyborem koloru oraz figury
	public void ustawKolor(Color newKolor) {
		currentColor=newKolor;
	}
	public void ustawKolorWyp(Color newKolor) {
		currentColorWyp=newKolor;
	}
	public void wybor(int i) {
		wybor=i;
	}
	
	//RYSOWANIE
	
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		
		//Podgl¹d rysowanego obiektu w czasie rzeczywistym
		
		if (srodek != null) {
			Graphics2D g2d=(Graphics2D)g;
			g2d.setColor(currentColor);
			int x = srodek.width;
			int y = srodek.height;
			int r = rTemp;
			if(wybor==0) {
			g2d.drawOval(x-r,y-r,2*r,2*r);
			}
			else if(wybor==1) {
				int temp1=(int)Math.sqrt((xss-xs)*(xss-xs));
				int temp2=(int)Math.sqrt((yss-ys)*(yss-ys));
				g2d.drawRect(xs,ys,temp1,temp2);
			}
				else if(wybor==2) {
					int temp1=(int)Math.sqrt((xss-xs)*(xss-xs));
					int temp2=(int)Math.sqrt((yss-ys)*(yss-ys));
					g2d.drawOval(xs,ys,temp1,temp2);	
			}
				else if(wybor==3) {
					g2d.drawLine(xs,ys,xss,yss);	
			}
				else if(wybor==4) {
				g2d.drawLine(prevX, prevY, xss, yss);
					prevX=xss;
					prevY=yss;
			}
				
		}
		
		//Rysowanie kó³ek
		
		for (Kolo d:lista) {
			Graphics2D g2d=(Graphics2D)g;
			g2d.setColor(d.getKolor());
			int x = d.getSrodek().width;
			int y = d.getSrodek().height;
			int r = d.getR();
			g2d.drawOval(x-r,y-r,2*r,2*r);
			if(wypelnienie==true) {
			g2d.drawOval(x-r+1,y-r+1,2*(r-1),2*(r-1));
			g2d.setColor(d.getKolorWyp());
			g2d.fillOval(x-r+1,y-r+1,2*(r-1),2*(r-1));
			}
			
		}
		
		//Rysowanie prostok¹tów
		
		for (Prostokat d:lista1) {
			Graphics2D g2d=(Graphics2D)g;
			g2d.setColor(d.getKolor());
			int x = d.getSrodek().width;
			int y = d.getSrodek().height;
			int w = (int)Math.sqrt((d.getWysokosc()-y)*(d.getWysokosc()-y));
			int sz= (int)Math.sqrt((d.getSzerokosc()-x)*(d.getSzerokosc()-x));
			g2d.drawRect(x,y,sz,w);
			if(wypelnienie==true) {
			g2d.drawRect(x+1,y+1,sz-1,w-1);
			g2d.setColor(d.getKolorWyp());
			g2d.fillRect(x+1,y+1,sz-1,w-1);
			}
		}
		
		//Rysowanie Elips
		
		for (Elipsa d:lista2) {
			Graphics2D g2d=(Graphics2D)g;
			g2d.setColor(d.getKolor());
			int x = d.getSrodek().width;
			int y = d.getSrodek().height;
			int w = (int)Math.sqrt((d.getWysokosc()-y)*(d.getWysokosc()-y));
			int sz= (int)Math.sqrt((d.getSzerokosc()-x)*(d.getSzerokosc()-x));
			g2d.drawOval(x,y,sz,w);
			if(wypelnienie==true) {
			g2d.drawOval(x+1,y+2,sz-1,w-1);
			g2d.setColor(d.getKolorWyp());
			g2d.fillOval(x+1,y+1,sz-1,w-1);
			}
		}
		
		//Rysowanie linii prostych
		
		for (Prosta d:lista3) {
			Graphics2D g2d=(Graphics2D)g;
			g2d.setColor(d.getKolor());
			int x = d.getSrodek().width;
			int y = d.getSrodek().height;
			int xs =d.getSzerokosc();
			int ys =d.getWysokosc();
		    g2d.drawLine(x,y,xs,ys);
		}
		
		//Rysowanie linii dowolnej
		
		for (Linia d:lista4) {
			Graphics2D g2d=(Graphics2D)g;
			g2d.setColor(d.getKolor());
			int x = d.getSrodek().width;
			int y = d.getSrodek().height;
			int xs =d.getSzerokosc();
			int ys =d.getWysokosc();
		    g2d.drawLine(x,y,xs,ys);
		}
		
		//Rysowanie siatki
		
		for (Siatka d:lista5) {
			Graphics2D g2d=(Graphics2D)g;
			g2d.setColor(Color.BLACK);
			int x = d.getX1();
			int xs = d.getX2();;
			int y =d.getY1();
			int ys =d.getY2();
		    g2d.fillOval(x,y,xs,ys);
		}
		
			
		
	}
}

