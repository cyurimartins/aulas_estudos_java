//AULA 22/05/2018 - PROGRAMACAO 1

package aula01;
import javax.swing.JOptionPane; 
/**
 *
 * @author aluno
 */
public class Aula01 {

    public static void main(String[] args) {
                
        //CRIANDO OBJETO COMPACTDISC
        CompactDisc c1 = new CompactDisc();        
        
        //CRIANDO OBJETO LIVRO
        Livro l1 = new Livro();
        Livro l2 = new Livro();

        
        l1.atualizarPreco(0);
        l1.statusPreco();
        l2.atualizarPreco(0);
        
    }
    
}


package aula01;
/**
 *
 * @author aluno
 */
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

package aula01;
import javax.swing.JOptionPane;

/**
 *
 * @author aluno
 */
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
        super.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do livro: ")));                     
        
    }    
}

package aula01;
import javax.swing.JOptionPane; 
/**
 *
 * @author aluno
 */
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
        super.setPreco(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço do livro: ")));                     
                   
    }   
    
    public void statusPreco(){
        JOptionPane.showMessageDialog(null, super.getPreco());
    
    }    
}
