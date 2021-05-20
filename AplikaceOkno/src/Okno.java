import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; //*importuje v�echny metody

public class Okno extends JFrame{
	//private static final int WIDTH = 300;				//nastaven� konstanty
	//private static final int HEIGHT = 300;
	private JButton button;								//deklarace prvku
	private JButton button2;
	private JTextField textik;
	private JLabel popisek;
	
	
	
	public Okno() {
		this.setTitle("Moje okno");						//nastaven� n�zvu
		this.setSize(300, 300);							//nastaven� velikosti
		this.setLayout(new FlowLayout());				//nastaven� rozvr�en�
		
		popisek = new JLabel("Zadej: ");				//nastaven� hodnoty
		this.add(popisek);								//p�id�n� prvku
		
		textik = new JTextField(10);
		this.add(textik);

		button = new JButton("OK");						//vytvo�en� prvku
		this.add(button);								//p�id�n� do formul��e
		
		button.addActionListener(new ActionListener() {	//p�id�n� rozhran�
			@Override
			public void actionPerformed(ActionEvent e) {	//implementov�n� metody z rozhran�
				button.setText(textik.getText());
				
			}});
			
		
		button2 = new JButton("Storno");
		this.add(button2);
		button2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				textik.setText("");
				
			}});

		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	//po kliknut� na k��ek, aplikace skon��
		this.setVisible(true);   								//nastaven� viditelnost
	}

	
}
