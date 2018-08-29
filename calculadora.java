package Componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Calculadora extends JFrame implements ActionListener{
    
    JLabel label1;
    JLabel label2;
    JLabel label3;
    
    JTextField texto1, texto2, texto3;
    JButton botao1, botao2, botao3, botao4, botao5;
    
    //METODO CONSTRUTOR
    public Calculadora(){
        super("Calculadora");
        
        //3 PROPRIEDADES PRINCIPAIS DE UMA JANELA
        setSize(350,100); //TAMANHO DA JANELA
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //CLICAR PARA FECHAR A JANELA
        setLocationRelativeTo(null);
        
        Container c = getContentPane();
        
        c.setLayout(new GridLayout(3,4));

        //CRIANDO TEXTO
        label1 = new JLabel("NUM.1");
        label2 = new JLabel("NUM.2");
        label3 = new JLabel("TOTAL");
        
        //CRIANDO CAIXA DE TEXTO
        texto1 = new JTextField();
        texto2 = new JTextField();
        texto3 = new JTextField();
        
        //CRIANDO BOTAO
        botao1 = new JButton("+");
        botao2 = new JButton("-");
        botao3 = new JButton("*");
        botao4 = new JButton("/");
        botao5 = new JButton("LIMPAR");
        
        c.add(label1);
        c.add(texto1);
        c.add(botao1);
        c.add(botao2);
        
        c.add(label2);
        c.add(texto2);
        c.add(botao3);
        c.add(botao4);
        
        c.add(label3);
        c.add(texto3);
        c.add(botao5);
        
        botao1.addActionListener(this);
        
        setVisible(true); //PRECISA SER A ULTIMA INSTRUÇÃO
    }  

    @Override
    public void actionPerformed(ActionEvent acao) {
        double t1 = Double.parseDouble(texto1.getText());
        double t2 = Double.parseDouble(texto2.getText());
        double t3 = 0;
        
        if (botao1 == acao.getSource()){
            t3 = t1 + t2;
            texto3.setText(t3+"");  
        }
    }
    
}
