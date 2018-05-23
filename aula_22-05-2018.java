//AULA 22/05/2018 - MÉTODO ABSTRATO - PROGRAMACAO I

package aulametodoabstrato;

import javax.swing.JOptionPane;

/**
 *
 * @author ymartins
 */
public class AulaMetodoAbstrato {

    public static void main(String[] args) {
         //INSTANCIA COMPACTDISC
        CompactDisc c1 = new CompactDisc();        
        
        //INSTANCIA DE LIVRO
        Livro l1 = new Livro();
        Livro l2 = new Livro();

        //CHAMANDO O METODO ATUALIZARPRECO ATRAVES DO OBJETO CRIADO E UTILIZANDO JOPTIONPANE PARA ENTRADA DE DADOS
        l1.atualizarPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do livro: ")));
        //SAIDA DE DADOS
        JOptionPane.showMessageDialog(null, "O preço do livro é " + l1.getPreco());      
    }
    
}

//CLASSE PRODUTO

public abstract class Produto {
    
    private int codigo;
    private double preco;
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }
    
    public void setPreco(double preco){
        this.preco = preco;
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public double getPreco(){
        return preco;
    }
    
    public abstract void atualizarPreco(double preco);
    
}

//CLASSE COMPACTDISC

public class CompactDisc extends Produto{
    
    private String artista;
    private String gravadora;
    
    public void setArtista(String artista){
        this.artista = artista;
    }
    
    public void setGravadora(String gravadora){
        this.gravadora = gravadora;
    }
    
    public String getArtista(){
        return artista;
    }
    
    public String getGravadora(){
        return gravadora;
    }
   
    @Override
    public void atualizarPreco(double preco) {
        super.setPreco(preco);
    }    
}

//CLASSE LIVRO

public class Livro extends Produto{
    
    private String autor;
    private long isbn;
    
    public void setAutor(String autor){
        this.autor = autor;        
    }
    
    public void setIsbn(long isbn){
        this.isbn = isbn;
    }
    
    public String getAutor(){
        return autor;
    }
    
    public long getIsbn(){
        return isbn;
    }
    
   @Override
    public void atualizarPreco(double preco) {
        super.setPreco(preco);
    }    
    
}
