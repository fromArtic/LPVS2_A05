package ex01;

/**
 *
 * @author Jv Loreti
 */

public class Preguica extends Animal{
    
    public Preguica(String n, int i){
        super(n, i);
    }
    
    public void acao(){
        System.out.println("A preguiça sobe a árvore.");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("A preguiça emite um som. ''...'' (é muito baixo para se ouvir)");
    }
}
