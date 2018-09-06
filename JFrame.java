package InterfaceGrafica;

import javax.swing.JFrame;

public class Janela extends JFrame{
	
    public Janela (){
        setTitle("TITULO DA JANELA"); //TITULO DA JANELA
        setSize(500,400); //TAMANHO DA JANELA EM PIXEL
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //FECHAR JANELA
        setLocationRelativeTo(null); //INICIAR JANELA NO MEIO DA TELA
        setResizable(false); //DESABILITAR O REDIMENSIONAMENTO DA JANELA
        setVisible(true); //TORNAR JANELA VISIVEL
    }
    
    public static void main(String[] args){
        new Janela();
    }

}
