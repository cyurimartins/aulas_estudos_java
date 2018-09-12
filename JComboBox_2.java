package InterfaceGrafica;

import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ComboBox extends JFrame{
	
	JComboBox <String> c1 = new JComboBox<String>();
	
	public ComboBox() {
		
		setLayout(new FlowLayout());	
		
		add(c1);
		
		//ADICIONANDO ITEM AO COMBO BOX
		c1.addItem("Flamengo"); 
		c1.addItem("Real Madrid");
		c1.addItem("Milan");
		
		//INICIALIZANDO NA INDEX 2 - MILAN
		c1.setSelectedIndex(2);
		
		//INICIALIZANDO NO ITEM
		//c1.setSelectedItem("Real Madrid");
		
		//VERIFICAR EM QUAL INDEX ESTA SELECIONADO
		System.out.println(c1.getSelectedIndex());
		
		//RETORNA O ITEM SELECIONADO
		System.out.println(String.valueOf(c1.getSelectedItem()));
		
		//CRIANDO UMA JANELA
		setTitle("Exemplo");
		setSize(700,600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		setVisible(true);		
		
	}
	
	public static void main(String[] args) {
		new ComboBox();
	}

}
