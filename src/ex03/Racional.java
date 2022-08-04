package ex03;

/**
 *
 * @author Jv Loreti
 */

public class Racional extends Inteiro{
    int b;
    
    Racional(int x, int y){
        super(x);
        b = y;
    }

    public void add(Racional x){
        a = a * x.b + b * x.a;
        b = b * x.b;
    }

    public void inc(){
        a = a + b;
    }

    public void print(){
        System.out.print(a);
        System.out.print("/");
        System.out.println(b);
    }
}
