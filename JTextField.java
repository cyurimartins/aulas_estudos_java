package InterfaceGrafica;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JTextField;


public class CaixaDeTexto extends JFrame{
	
	JTextField cx = new JTextField(30);
	
	public CaixaDeTexto() {
		setLayout(new FlowLayout());
		
		add(cx);
		cx.setText("Texto na caixa");
		System.out.println(cx.getText());
		
		//CRIANDO UMA JANELA
		setTitle("Exemplo");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CaixaDeTexto();
	}
}
