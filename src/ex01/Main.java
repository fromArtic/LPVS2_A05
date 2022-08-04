package ex01;

/**
 *
 * @author Jv Loreti
 */

public class Main{
    public static void main(String[] args) {
        Cachorro chr = new Cachorro("Dominiq", 2);
        Cavalo cvl = new Cavalo("Bipedal", 22);
        Preguica p = new Preguica("Zuuubat", 114);
        Veterinario vet = new Veterinario();
        
        Animal vetorAnimais[] = new Animal[10];
        vetorAnimais[0] = chr;
        vetorAnimais[1] = cvl;
        vetorAnimais[2] = p;
        
        //Validar campos nulos e chamar a examinação do veterinário
        for(int i = 0; i < 10; i++){
            if(vetorAnimais[i] != null){
                vet.Examinar(vetorAnimais[i]);
            }
        }
    }
}
