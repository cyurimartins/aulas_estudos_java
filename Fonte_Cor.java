package InterfaceGrafica;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Fonte extends JFrame{

	JButton b1 = new JButton("Teste");
	Font fonte = new Font("Courier New",Font.ITALIC | Font.BOLD,200); //criando um objeto fonte
	Color cor = new Color(0,0,0); //ADICIONANDO UMA COR NO PADRAO RGB
	
	public Fonte() {
		
		b1.setForeground(Color.RED);
		b1.setBackground(Color.BLACK);
		
		b1.setFont(fonte); //ADICIONANDO A FONTE NO BOTAO (B1)
		add(b1); //ADICIONANDO UM BOTAO
		
		setTitle("Exemplo Alterar Fonte");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main (String[] args) {
		new Fonte();
	}
	
	
}
