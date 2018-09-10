package InterfaceGrafica;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame{
	
	JButton b1 = new JButton("Teste1");
	JButton b2 = new JButton("Teste2");
	JButton b3 = new JButton("Teste3");
	JButton b4 = new JButton("Teste4");
	
	public Layout() {

		setLayout(new GridLayout(2,2));
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		
		setTitle("Exemplo Grid Layout");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main (String[] args) {
		new Layout();
	}
}
