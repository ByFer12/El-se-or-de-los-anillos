/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestias;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Trasgo extends Bestia {

    public Trasgo(String nombre, int vida, int armadura, int maxAtaque) {
        super(nombre, 325, 250, maxAtaque);
    }

    @Override
    public int ataqueEspecial() {
        if(dad1>dad2){
            maxAtaque=dad1;
            return (int)(maxAtaque+(maxAtaque*0.2));
        }
        if(dad2>dad1){
            maxAtaque=dad2;
            return (int)(maxAtaque+(maxAtaque*0.2));
            
        }
        if(dad1==dad2){
            return 0;
        }
        return (int)(maxAtaque+(maxAtaque*0.2));
    }

    @Override
    public void daño(int daño) {
        this.vida-=daño;
    }

}
