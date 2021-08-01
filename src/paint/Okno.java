package paint;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JDialog;
import javax.swing.JScrollPane;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Okno extends JFrame {
	 
	//Metoda pozwalaj¹ca na zmiane obramowania kolorowego przycisku
	
	public void setRamka(JTextField t1,JTextField t2,JTextField t3,JTextField t4,JTextField t5,JTextField t6,JTextField t7,JTextField t8,JTextField t9,JTextField t10,JTextField t11) {
		t1.setBorder(new LineBorder(Color.WHITE, 3));
		t2.setBorder(new LineBorder(Color.WHITE, 3));
		t3.setBorder(new LineBorder(Color.WHITE, 3));
		t4.setBorder(new LineBorder(Color.WHITE, 3));
		t5.setBorder(new LineBorder(Color.WHITE, 3));
		t6.setBorder(new LineBorder(Color.WHITE, 3));
		t7.setBorder(new LineBorder(Color.WHITE, 3));
		t8.setBorder(new LineBorder(Color.WHITE, 3));
		t9.setBorder(new LineBorder(Color.WHITE, 3));
		t10.setBorder(new LineBorder(Color.WHITE, 3));
		t11.setBorder(new LineBorder(Color.WHITE, 3));
		t1.setBorder(new LineBorder(Color.DARK_GRAY, 3));
	}
		
	Okno() {
		//Deklaracje kontenera, checkboxów, paneli, buttonów, textfieldów 
		Container c = this.getContentPane();
		c.setLayout(new BorderLayout());
		MyJPanel p = new MyJPanel();
		p.setBackground(Color.WHITE);
		JPanel xp= new JPanel();
		JScrollPane scroll=new JScrollPane();
		this.setTitle("Prawie paint");
		xp.add(p);
		JCheckBox ChB=new JCheckBox("Siatka", false);
		JPanel guziki= new JPanel();
		JButton b1 = new JButton("Prostok¹t");
		JButton b2 = new JButton("Ko³o");
		JButton b3 = new JButton("Elipsa");
		JButton b4 = new JButton("Prosta");
		JButton b5 = new JButton("Linia");
		JButton b6 = new JButton("Wielkoœæ");
		JButton b7 = new JButton("Wyma¿");
		JCheckBox b8 = new JCheckBox("Kolor Wype³nienia",false);
		JCheckBox b9 = new JCheckBox("Kolor linii",true);
		JCheckBox b10 = new JCheckBox("Wype³nienie",false);
		JTextField t1=new JTextField();
		t1.setPreferredSize(new Dimension(30,30));
		t1.setBackground(Color.BLUE);
		t1.setEditable(false);
		JTextField t2=new JTextField();
		t2.setPreferredSize(new Dimension(30,30));
		t2.setBackground(Color.GREEN);
		t2.setEditable(false);
		JTextField t3=new JTextField();
		t3.setPreferredSize(new Dimension(30,30));
		t3.setBackground(Color.BLACK);
		t3.setEditable(false);
		JTextField t4=new JTextField();
		t4.setPreferredSize(new Dimension(30,30));
		t4.setBackground(Color.RED);
		t4.setEditable(false);
		JTextField t5=new JTextField();
		t5.setPreferredSize(new Dimension(30,30));
		t5.setBackground(Color.MAGENTA);
		t5.setEditable(false);
		JTextField t6=new JTextField();
		t6.setPreferredSize(new Dimension(30,30));
		t6.setBackground(Color.CYAN);
		t6.setEditable(false);
		JTextField t7=new JTextField();
		t7.setPreferredSize(new Dimension(30,30));
		t7.setBackground(Color.YELLOW);
		t7.setEditable(false);
		JTextField t8=new JTextField();
		t8.setPreferredSize(new Dimension(30,30));
		t8.setBackground(Color.GRAY);
		t8.setEditable(false);
		JTextField t9=new JTextField();
		t9.setPreferredSize(new Dimension(30,30));
		t9.setBackground(Color.ORANGE);
		t9.setEditable(false);
		JTextField t10=new JTextField();
		t10.setPreferredSize(new Dimension(30,30));
		t10.setBackground(Color.PINK);
		t10.setEditable(false);
		JTextField t11=new JTextField();
		t11.setPreferredSize(new Dimension(30,30));
		t11.setBackground(Color.WHITE);
		t11.setEditable(false);
		//Ustawianie koloru obramowania textfieldów
		t1.setBorder(new LineBorder(Color.WHITE, 3));
		t2.setBorder(new LineBorder(Color.WHITE, 3));
		t3.setBorder(new LineBorder(Color.WHITE, 3));
		t4.setBorder(new LineBorder(Color.WHITE, 3));
		t5.setBorder(new LineBorder(Color.WHITE, 3));
		t6.setBorder(new LineBorder(Color.WHITE, 3));
		t7.setBorder(new LineBorder(Color.WHITE, 3));
		t8.setBorder(new LineBorder(Color.WHITE, 3));
		t9.setBorder(new LineBorder(Color.WHITE, 3));
		t10.setBorder(new LineBorder(Color.WHITE, 3));
		t11.setBorder(new LineBorder(Color.WHITE, 3));
		//Ustawianie koloru t³a przycisków
		b1.setBackground(Color.WHITE);
		b2.setBackground(Color.WHITE);
		b3.setBackground(Color.WHITE);
		b4.setBackground(Color.WHITE);
		b5.setBackground(Color.WHITE);
		b6.setBackground(Color.WHITE);
		b7.setBackground(Color.WHITE);
		b8.setBackground(Color.WHITE);
		b9.setBackground(Color.WHITE);
		b10.setBackground(Color.WHITE);
		ChB.setBackground(Color.WHITE);
		//Dodanie wszytkich "guzików" do Panelu
		guziki.add(b6);
		guziki.add(b1);
		guziki.add(b2);
		guziki.add(b3);
		guziki.add(b4);
		guziki.add(b5);
		guziki.add(b10);
		guziki.add(t11);
		guziki.add(t3);
		guziki.add(t1);
		guziki.add(t2);
		guziki.add(t4);
		guziki.add(t5);
		guziki.add(t6);
		guziki.add(t7);
		guziki.add(t8);
		guziki.add(t9);
		guziki.add(t10);
		guziki.add(b9);
		guziki.add(b8);
		guziki.add(ChB);
		guziki.add(b7);
		b8.setVisible(false);
		//Deklaracja i konfiguracja paska statusu
		JPanel statusPanel = new JPanel();
		statusPanel.setBorder(new BevelBorder(BevelBorder.LOWERED));
		statusPanel.setPreferredSize(new Dimension(guziki.getWidth(), 16));
		statusPanel.setLayout(new BoxLayout(statusPanel, BoxLayout.X_AXIS));
		JLabel statusLabel = new JLabel("status");
		statusLabel.setHorizontalAlignment(SwingConstants.LEFT);
		statusPanel.add(statusLabel);
		//Dodanie wszystkich paneli na swoje miejsca w kontenerze
		JPanel temp=new JPanel(new BorderLayout());
		temp.add(BorderLayout.WEST,guziki);
		scroll.setPreferredSize(new Dimension(500,500));
        scroll.setViewportView(xp);
        JPanel dod=new JPanel(new BorderLayout());
		dod.add(BorderLayout.CENTER,scroll);
		dod.add(BorderLayout.SOUTH,temp);
		c.add(BorderLayout.CENTER,dod);
		c.add(statusPanel, BorderLayout.SOUTH);
		
//Obs³uga klikniecia przycisków
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0)  {
			System.out.println("Prostokat");
			p.wybor(1);
			b1.setBackground(Color.GRAY);
			b2.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b4.setBackground(Color.WHITE);
			b5.setBackground(Color.WHITE);
			}
		});
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.out.println("Ko³o");
			p.wybor(0);
			b2.setBackground(Color.GRAY);
			b1.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b4.setBackground(Color.WHITE);
			b5.setBackground(Color.WHITE);
			}
		});
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.out.println("Elipsa");
			p.wybor(2);
			b3.setBackground(Color.GRAY);
			b2.setBackground(Color.WHITE);
			b1.setBackground(Color.WHITE);
			b4.setBackground(Color.WHITE);
			b5.setBackground(Color.WHITE);
			}
		});
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.out.println("Prosta");
			p.wybor(3);
			b4.setBackground(Color.GRAY);
			b2.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b1.setBackground(Color.WHITE);
			b5.setBackground(Color.WHITE);
			}
		});
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			System.out.println("Linia");
			p.wybor(4);
			b5.setBackground(Color.GRAY);
			b2.setBackground(Color.WHITE);
			b3.setBackground(Color.WHITE);
			b4.setBackground(Color.WHITE);
			b1.setBackground(Color.WHITE);
			}
		});
		JDialog dialog = new JDialog();
	      dialog.setModal(true);
	      JPanel temp1=new JPanel();
	      temp1.add(new JLabel("Podaj Wysokosc"));
	      JTextField wys=new JTextField(10);
	      temp1.add(wys);
	      temp1.add(new JLabel("Podaj Szerokosc"));
	      JTextField sze=new JTextField(10);
	      temp1.add(sze);
	      JButton bd=new JButton("Zatwierdz");
	      temp1.add(bd);
	      dialog.add(temp1);
		b6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
			      dialog.pack();
			      dialog.setVisible(true);
			}
			
		});
		 bd.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
				int wysokosc=Integer.parseInt(wys.getText());
				int szerokosc=Integer.parseInt(sze.getText());
				p.setDim(wysokosc,szerokosc);
				p.setPreferredSize(new Dimension(wysokosc,szerokosc));
				xp.setPreferredSize(new Dimension(wysokosc,szerokosc));
				p.revalidate();
				p.repaint();
				xp.revalidate();
				xp.repaint();
				c.revalidate();
				c.repaint();
				dialog.setVisible(false);
				if(ChB.isSelected()==true) {
				ChB.setSelected(false);
				ChB.setSelected(true);
				}
				
				
							}
			});
		 b7.addActionListener(new ActionListener() {
				
				public void actionPerformed(ActionEvent arg0) {
				      p.Wymaz();
				}
				
			});
		 
		 //Obs³uga textfieldów odpowiedzialnych za zmiane koloru
		 
		t1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Niebieski");
			setRamka(t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.BLUE);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.BLUE);
			
			}
			}
		});
		t2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Zielony");
			setRamka(t2,t1,t3,t4,t5,t6,t7,t8,t9,t10,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.GREEN);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.GREEN);
			
			}
			}
		});
		t3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Czarny");
			setRamka(t3,t2,t1,t4,t5,t6,t7,t8,t9,t10,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.BLACK);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.BLACK);
			
			}
			}
		});
		t4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Czerwony");
			setRamka(t4,t2,t3,t1,t5,t6,t7,t8,t9,t10,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.RED);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.RED);
			
			}
			}
		});
		t5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Magenta");
			setRamka(t5,t2,t3,t4,t1,t6,t7,t8,t9,t10,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.MAGENTA);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.MAGENTA);
			
			}
			}
		});
		t6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Cyan");
			setRamka(t6,t2,t3,t4,t1,t5,t7,t8,t9,t10,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.CYAN);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.CYAN);
			
			}
			}
		});
		t7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("¯ó³ty");
			setRamka(t7,t2,t3,t4,t5,t6,t1,t8,t9,t10,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.YELLOW);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.YELLOW);
			
			}
			}
		});
		t8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Szary");
			setRamka(t8,t2,t3,t4,t5,t6,t7,t1,t9,t10,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.GRAY);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.GRAY);
			
			}
			}
		});
		t9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Pomaranczowy");
			setRamka(t9,t2,t3,t4,t5,t6,t7,t8,t1,t10,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.ORANGE);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.ORANGE);
			
			}
			}
		});
		t10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Ró¿owy");
			setRamka(t10,t2,t3,t4,t5,t6,t7,t8,t9,t1,t11);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.PINK);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.PINK);
			}
			}
		});
		t11.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
			System.out.println("Bia³y");
			setRamka(t11,t2,t3,t4,t5,t6,t7,t8,t9,t10,t1);
			if(b9.isSelected()==true) {
			p.ustawKolor(Color.WHITE);
			}
			if(b8.isSelected()==true) {
			p.ustawKolorWyp(Color.WHITE);
			
			}
			}
		});
		//Obs³uga checkboxów
		ChB.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) { 
               if(e.getStateChange()==1) { 
                       p.ZapelnijSiatke();
                       p.repaint();
                   } 
               else {
                       p.CzyscSiatke();
                   }
            }
         });  
		b10.addItemListener(new ItemListener() {    
            public void itemStateChanged(ItemEvent e) { 
               if(e.getStateChange()==1) { 
                       b8.setVisible(true);
                       p.setWypelnienie(true);
                   } 
               else {
            	   b8.setVisible(false);
            	   p.setWypelnienie(false);
                   }
            }
         });
		
		//Wyœwietlanie parametrów figury na pasku statusu
		
		 p.addMouseMotionListener( new MouseAdapter() {
				
				public void mouseDragged(MouseEvent e) {
				int a=p.getWybor();
				if(a==1) {
				statusLabel.setText("Prostok¹t: "+p.getDlugosc()+"x"+p.getWysokosc());
				}
				if(a==0) {
					int temp=(int)Math.sqrt(((p.getDlugosc())*(p.getDlugosc()))+((p.getWysokosc())*(p.getWysokosc())));
			    statusLabel.setText("Promieñ ko³a: "+temp);
				}
				if(a==2) {
					statusLabel.setText("Elipsa (d1xd2): "+p.getDlugosc()+"x"+p.getWysokosc());
				}
				};
				});
		
		
		c.setPreferredSize( new Dimension(2000, 1400));
		setVisible(true);
		pack();
		
	}
}

