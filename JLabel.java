package InterfaceGrafica;

import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class Label extends JFrame{
	
	Font fonte = new Font("Serif",Font.BOLD,50); //CRIANDO UM OBJETO FONTE
	JLabel legenda = new JLabel("EXEMPLO TESTE");
	
	public Label() {
		
		legenda.setFont(fonte); //ALTERANDO A FONTE
		legenda.setText("PASSANDO OUTRO TEXTO"); //ALTERANDO O TEXTO
		legenda.setHorizontalAlignment(SwingConstants.CENTER); //ALINHAR JLABEL AO CENTRO
		add(legenda);
		
		
		//CRIANDO UMA JANELA
		setTitle("Exemplo");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		
		new Label();
		
	}
	
}
