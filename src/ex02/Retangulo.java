package ex02;

/**
 *
 * @author Jv Loreti
 */

public class Retangulo implements IFiguraGeometrica{
    private double base;
    private double altura;
    
    public Retangulo(double b, double h){
        this.base = b;
        this.altura = h;
    }

    @Override
    public double calcularArea(){
        return base * altura;
    }
}
