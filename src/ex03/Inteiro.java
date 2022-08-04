package ex03;

/**
 *
 * @author Jv Loreti
 */

public class Inteiro implements IValor{
    int a;

    Inteiro(int x){
        a = x;
    }
    
    public void add(Inteiro x){
        a = a + x.a;
    }
    
    public void inc(){
        a = a + 1;
    }
    
    public void print(){
        System.out.println(a);
    }
}
