package Componentes;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import javax.swing.*;

public class ComboBox extends JFrame implements ActionListener, ItemListener{
    
    JButton botao1, botao2, botao3, botao4, botao5, botao6;
    JLabel label1, label2, label3;
    JComboBox corlist;
    JTextField text1, text2;
    String[] cores = { "Vermelho", "Preto", "Verde", "Amerelo", "Branco" };

    
   

    //METODO CONTRUTOR
        
    public ComboBox(){
        super("ComboBox");

        
        corlist = new JComboBox(cores);

        
        setSize(500,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //FECHAR JANELA
        setLocationRelativeTo(null);
        
        Container c = getContentPane();
        c.setLayout(new GridLayout(5,2));
        
        //CRIANDO BOTAO
        botao1 = new JButton("MOSTRA TEXTO");
        botao2 = new JButton("REMOVE ITEM");
        botao3 = new JButton("MOSTRA INDICE");
        botao4 = new JButton("REMOVE TODOS");
        botao5 = new JButton("ADICIONA ITEM");
        botao6 = new JButton("QUANT. ITENS");
        
        //CRIANDO TEXTO
        label1 = new JLabel("Texto:");
        label2 = new JLabel("NUM.2");
        label3 = new JLabel("TOTAL");
        
        //CRIANDO CAIXA DE TEXTO
        text1 = new JTextField();
        text2 = new JTextField();
        
        //CRIANDO COMBO BOX
        corlist = new JComboBox(cores);
        
        c.add(label1);
        c.add(corlist);
        
        c.add(botao1);
        c.add(botao2);
        
        c.add(botao3);
        c.add(botao4);
        
        c.add(botao5);
        c.add(text1);
        
        c.add(botao6);
        c.add(text2);
        
        corlist.addItemListener(this);
        setVisible(true); //PRECISA SER A ULTIMA INSTRUÇÃO
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
    }

    @Override
    public void itemStateChanged(ItemEvent ie) {
        label1.setText("Texto: " + corlist.getSelectedItem());
    }
    
}
