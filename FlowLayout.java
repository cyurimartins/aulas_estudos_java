package InterfaceGrafica;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Layout extends JFrame{
	
	JButton botao = new JButton("Teste");
	JButton botao2 = new JButton("Teste");
	
	public Layout() {

		setLayout(new FlowLayout(FlowLayout.LEFT)); // PARA PASSAR OS COMPONENTES A ESQUERDA
		add(botao);
		add(botao2);
		
		setTitle("Exemplo Flow Layout");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}
	
	public static void main (String[] args) {
		new Layout();
	}
}
