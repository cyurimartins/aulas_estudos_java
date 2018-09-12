package InterfaceGrafica;

import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class CheckBox extends JFrame {

	JCheckBox teste = new JCheckBox("Titulo", false); //INICIA A CHECKBOX - TRUE = MARCADA FALSE = DESMARCADA
	
	public CheckBox() {
		setLayout(new FlowLayout());

		add(teste);
		
		System.out.println(teste.isSelected()); //VERIFICAR SE A CHECKBOX ESTA MARCADA
		
		setTitle("Exemplo");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CheckBox();
	}
}
