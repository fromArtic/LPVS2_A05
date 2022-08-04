package ex03;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String[] a){
        Inteiro i = new Inteiro(1);
        Racional r = new Racional(2,3);
        
        i = r;
        
        i.inc();
        i.print();
        i.add(new Inteiro(1));
        i.print();
    }
}

/**
 * SAÍDA: 5/3
 *        6/3
 * 
 * JUSTIFICATIVA: Enquanto o parâmetro da variável inteira é comunicado diretamente pelo construtor da classe Inteiro, o mesmo somente ocorre com o 
 * segundo parâmetro da variável racional, enquanto seu primeiro parâmetro é comunicado à classe extensora, de inteiros. Então, a variável inteira é 
 * igualada à racional e passa a valer 2/3, que em seguida passa pela função "add" (integrada pela interface Valor) e se torna 5/3, o valor exibido pela 
 * primeira saída.
 * A próxima função (também integrada pela mesma interface) retorna o próximo valor, 6/3, imprimido na segunda saída. Devido à ambas as classes 
 * implementarem a interface Valor e a classe Racional ser uma extensão da classe Inteiro, os parâmetros da variável Inteiro criada acima passam não 
 * somente por sua respectiva classe, mas também pela classe Racional. Assim, modificando não somente o valor dos resultados, mas também os exibindo em 
 * forma fracionária (como declarado na classe Racional).
 */
