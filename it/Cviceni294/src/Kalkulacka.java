import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;

public class Kalkulacka extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	
	private String text;

	metoda md = new metoda();
	public String getTt() {
		return text;
	}

	public void setTt(String text) {
		this.text = text;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Kalkulacka frame = new Kalkulacka();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Kalkulacka() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextField txtField = new JTextField();
		JButton button = new JButton("1");
		button.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				md.setC(1);
				txtField.setText(button.getText());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
			}
			
		});
		button.setBounds(27, 68, 56, 23);
		contentPane.add(button);
		
		JButton btnNewButton = new JButton("2");
		btnNewButton.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				md.setC(btnNewButton.getText());
				txtField.setText(btnNewButton.getText());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
			}
			
		});
		btnNewButton.setBounds(104, 68, 56, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				md.setC(btnNewButton_1.getText());
				txtField.setText(btnNewButton_1.getText());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
			}
			
		});
		btnNewButton_1.setBounds(185, 68, 56, 23);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("4");
		btnNewButton_2.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				md.setC(btnNewButton_2.getText());
				txtField.setText(btnNewButton_2.getText());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
			}
			
		});
		btnNewButton_2.setBounds(27, 102, 56, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("5");
		btnNewButton_3.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				md.setC(btnNewButton_3.getText());
				txtField.setText(btnNewButton_3.getText());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
			}
			
		});
		btnNewButton_3.setBounds(104, 102, 56, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("6");
		btnNewButton_4.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				md.setC(btnNewButton_4.getText());
				txtField.setText(btnNewButton_4.getText());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
			}
			
		});
		btnNewButton_4.setBounds(185, 102, 56, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("7");
		btnNewButton_5.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				md.setC(btnNewButton_5.getText());
				txtField.setText(btnNewButton_5.getText());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
			}
			
		});
		btnNewButton_5.setBounds(27, 137, 56, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("8");
		btnNewButton_6.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				md.setC(btnNewButton_6.getText());
				txtField.setText(btnNewButton_6.getText());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
			}
			
		});
		btnNewButton_6.setBounds(104, 136, 56, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.addActionListener(new ActionListener(){

			@Override
			public void actionPerformed(ActionEvent e) {
				
				md.setC(btnNewButton_7.getText());
				txtField.setText(btnNewButton_7.getText());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
			}
			
		});
		btnNewButton_7.setBounds(185, 136, 56, 23);
		contentPane.add(btnNewButton_7);
		
		JButton button_1 = new JButton("+");
		button_1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				md.plus();
			}
			
		});
		button_1.setBounds(251, 68, 64, 46);
		contentPane.add(button_1);
		
		JButton btnNewButton_8 = new JButton("-");
		btnNewButton_8.setBounds(251, 137, 64, 46);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("x");
		btnNewButton_9.setBounds(325, 68, 64, 44);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("/");
		btnNewButton_10.setBounds(325, 137, 64, 46);
		contentPane.add(btnNewButton_10);
		
		textField = new JTextField();
		
		textField.setBounds(27, 11, 362, 46);
		contentPane.add(textField);
		
		JButton btnNewButton_11 = new JButton("=");
		btnNewButton_11.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				txtField.setText(md.getC());
				txtField.setBounds(27, 11, 362, 46);
				contentPane.add(txtField);
				txtField.setColumns(10);
				
			}
			
		});
		btnNewButton_11.setBounds(251, 194, 138, 46);
		contentPane.add(btnNewButton_11);
		/*textField.setColumns(10);*/
	
	
	
	}
}
