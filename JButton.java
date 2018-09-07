package InterfaceGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Botao extends JFrame{
	
	//INSTANCIAR OBJETO BOTAO
	JButton jb = new JButton("Botao 1");
	JButton jb2 = new JButton("Botao 2 ");
	
    public Botao (){
    	
    	setLayout(null);
    	jb.setBounds(100,300,100,60); //POSICAO E TAMANHO DO COMPONENTE HORIZONTAL(X), VERTICAL(Y), LARGURA, ALTURA 
    	jb2.setBounds(0, 0, 500, 300);
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
