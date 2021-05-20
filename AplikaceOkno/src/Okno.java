import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; //*importuje všechny metody

public class Okno extends JFrame{
	//private static final int WIDTH = 300;				//nastavení konstanty
	//private static final int HEIGHT = 300;
	private JButton button;								//deklarace prvku
	private JButton button2;
	private JTextField textik;
	private JLabel popisek;
	
	
	
	public Okno() {
		this.setTitle("Moje okno");						//nastavení názvu
		this.setSize(300, 300);							//nastavení velikosti
		this.setLayout(new FlowLayout());				//nastavení rozvržení
		
		popisek = new JLabel("Zadej: ");				//nastavení hodnoty
		this.add(popisek);								//pøidání prvku
		
		textik = new JTextField(10);
		this.add(textik);

		button = new JButton("OK");						//vytvoøení prvku
		this.add(button);								//pøidání do formuláøe
		
		button.addActionListener(new ActionListener() {	//pøidání rozhraní
			@Override
			public void actionPerformed(ActionEvent e) {	//implementování metody z rozhraní
				button.setText(textik.getText());
				
			}});
			
		
		button2 = new JButton("Storno");
		this.add(button2);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textik.setText("");
				
			}});

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//po kliknutí na køížek, aplikace skonèí
		this.setVisible(true);   								//nastavení viditelnost
	}

	
}
