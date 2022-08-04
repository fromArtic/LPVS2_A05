package ex01;

/**
 *
 * @author Jv Loreti
 */

public class Cavalo extends Animal{
    
    public Cavalo(String n, int i){
        super(n, i);
    }
    
    public void acao(){
        System.out.println("O cavalo corre.");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O cavalo emite um som. ''Iiirrr...''");
    }
}
