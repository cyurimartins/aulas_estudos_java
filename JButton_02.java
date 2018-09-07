package InterfaceGrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Botao extends JFrame implements ActionListener{
	
	//INSTANCIAR OBJETO BOTAO
	JButton jb = new JButton("Mensagem");
	JButton jb2 = new JButton("Sair");
	
	public void actionPerformed(ActionEvent e) {
		
		//APARECENDO MENSAGEM 
		if (e.getSource()==jb) {
			JOptionPane.showMessageDialog(null, "Aula Teste");
		} 
		
		//FECHANDO A JANELA
		if (e.getSource()==jb2) {
			System.exit(0);
		}
		
	}
	
    public Botao (){
    	
    	jb.addActionListener(this);
    	jb2.addActionListener(this);
    	
    	setLayout(null);
    	jb.setBounds(100,100,100,60); //POSICAO E TAMANHO DO COMPONENTE HORIZONTAL(X), VERTICAL(Y), LARGURA, ALTURA 
    	jb2.setBounds(250,100, 100, 60);
    	//getContentPane().add(jb); // ADICIONANDO BOTAO FORMA 1
    	add(jb); //ADICIONANDO O BOTAO FORMA 2 
    	add(jb2);
    	
        setTitle("TITULO DA JANELA"); //TITULO DA JANELA
        setSize(500,400); //TAMANHO DA JANELA EM PIXEL
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //FECHAR JANELA
        setLocationRelativeTo(null); //INICIAR JANELA NO MEIO DA TELA
        setResizable(false); //DESABILITAR O REDIMENSIONAMENTO DA JANELA
        setVisible(true); //TORNAR JANELA VISIVEL
    }
    
    public static void main(String[] args){
        new Botao();
    }

}
