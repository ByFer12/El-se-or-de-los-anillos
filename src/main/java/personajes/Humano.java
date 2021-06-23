package personajes;

public class Humano extends Heroe {

    public Humano(String nombre, int vida, int armadura, int maxAtaque) {
        super(nombre, 180, 200, maxAtaque);
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

    @Override
    public void daño(int daño) {
        this.vida-=daño;
    }

}
