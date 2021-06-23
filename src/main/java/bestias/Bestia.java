/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bestias;

import general.Ente;
    

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public abstract class Bestia extends Ente{
    protected int dad1;
    protected int dad2;
    public Bestia(String nombre, int vida, int armadura, int maxAtaque) {
        super(nombre, 300, 250, maxAtaque);
    }

    @Override
    public int ataque() {
         int golpe=0;
         dad1 = (int) (Math.random() * 90 + 1);
         dad2 = (int) (Math.random() * 90 + 1);
        if (dad1 > dad2) {
            golpe = dad1;
            return golpe;
        }
        if (dad2 > dad1) {
            golpe = dad2;
            return golpe;

        }
        if(dad1==dad2){
            return 0;
        }
        return golpe;

    }


  

}
