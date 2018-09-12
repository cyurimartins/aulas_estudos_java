package InterfaceGrafica;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton extends JFrame{
	
	JRadioButton r1 = new JRadioButton("Masculino");
	JRadioButton r2 = new JRadioButton("Feminino");
	
	ButtonGroup grupo = new ButtonGroup();
	
	public RadioButton() {
		setLayout(new FlowLayout());

		add(r1);
		add(r2);
		
		//PERMITINDO QUE APENAS UM DOS RADIOBUTTONS SEJA SELECIONADO
		grupo.add(r1);
		grupo.add(r2);
		
		setTitle("Exemplo");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new RadioButton();
	}
}
