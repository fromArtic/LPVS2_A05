package ex01;

/**
 *
 * @author Jv Loreti
 */

public class Cachorro extends Animal{

    public Cachorro(String n, int i){
        super(n, i);
    }
    
    public void acao(){
        System.out.println("O cachorro corre.");
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O cachorro emite um som. ''Au!''");
    }
}
