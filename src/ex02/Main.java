package ex02;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String[] args) {
        IFiguraGeometrica f[] = new IFiguraGeometrica[3];
        f[0] = new Circulo(2); //Parâmetro é o raio
        f[1] = new Quadrado(2); //Parâmetro é o lado
        f[2] = new Retangulo(2, 3); //Parâmetro é a base e a altura
        
        for(int i = 0; i < 3; i++){
            System.out.println(f[i].calcularArea());
        }
    }
}
