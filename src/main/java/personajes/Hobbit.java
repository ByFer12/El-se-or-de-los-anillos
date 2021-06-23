/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personajes;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Hobbit extends Heroe{

    public Hobbit(String nombre, int vida, int armadura, int maxAtaque) {
        super(nombre, 200, 220, maxAtaque);
    }

    @Override
    public int ataqueEspecial() {
         if(dado1>dado2){
            maxAtaque=dado1-5;
            return maxAtaque;
        }
        if(dado2>dado1){
            maxAtaque=dado2-5;
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
