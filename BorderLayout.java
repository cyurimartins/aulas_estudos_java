package InterfaceGrafica;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame{
	
	JButton b1 = new JButton("Norte");
	JButton b2 = new JButton("Leste");
	JButton b3 = new JButton("Oeste");
	JButton b4 = new JButton("Sul");
	JButton b5 = new JButton("Centro");
	
	
	
	public Layout() {
		
		setLayout(new BorderLayout());
		add(BorderLayout.NORTH,b1);
		add(BorderLayout.EAST,b2);
		add(BorderLayout.WEST,b3);
		add(BorderLayout.SOUTH,b4);
		add(BorderLayout.CENTER,b5);
		
		setTitle("Exemplo Border Layout");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main (String[] args) {
		new Layout();
	}
}
