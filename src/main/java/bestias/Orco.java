/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestias;


public class Orco extends Bestia{

    public Orco(String nombre, int vida, int armadura, int maxAtaque) {
        super(nombre, 300, 220, maxAtaque);
    }

        /**
         * ataque especial para cuando se encuentra con algun 
         * personaje que no le guste
         * @return 
         */
    @Override
    public int ataqueEspecial() {
          if(dad1>dad2){
            maxAtaque=dad1;
            return (int)(maxAtaque+(maxAtaque*0.1));
        }
        if(dad2>dad1){
            maxAtaque=dad2;
            return (int)(maxAtaque+(maxAtaque*0.1));
            
        }
        if(dad1==dad2){
            return 0;
        }
        return (int)(maxAtaque+(maxAtaque*0.1));
    }
    /**
     * Daño que le provocan
     * @param daño 
     */
    @Override
    public void daño(int daño) {
        this.vida-=daño;
    }
    }

 


