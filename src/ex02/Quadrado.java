package ex02;

/**
 *
 * @author Jv Loreti
 */

public class Quadrado implements IFiguraGeometrica{
    private double lado;
    
    public Quadrado(double l){
        this.lado = l;
    }

    @Override
    public double calcularArea(){
        return Math.pow(lado, 2);
    }
}
