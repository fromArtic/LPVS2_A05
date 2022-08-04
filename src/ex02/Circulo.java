package ex02;

/**
 *
 * @author Jv Loreti
 */

public class Circulo implements IFiguraGeometrica{
    private double raio;
    
    public Circulo(double r){
        this.raio = r;
    }

    @Override
    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}
