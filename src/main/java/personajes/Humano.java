package personajes;

public class Humano extends Heroe {

    public Humano(int vida, int armadura, int maxAtaque) {
        super(180, 200, maxAtaque);
    }
    public Humano(String nombre){
        super(nombre);
    }
 
    

    @Override
    public int ataqueEspecial() {
       if(dado1>dado2){
            maxAtaque=dado1+3;
            return maxAtaque;
        }
        if(dado2>dado1){
            maxAtaque=dado2+3;
            return maxAtaque;
            
        }
        if(dado1==dado2){
            return 0;
        }
        return maxAtaque;
    }



}
