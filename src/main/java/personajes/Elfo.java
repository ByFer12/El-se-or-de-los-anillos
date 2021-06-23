/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package personajes;

public class Elfo extends Heroe{

    public Elfo(String nombre, int vida, int armadura, int maxAtaque) {
        super(nombre, 250, 210, maxAtaque);
    }
    /**
     * Metodo de ataque especial si se enfrenta a un orco 
     * es un metodo abstracto de la clse ente
     * @return 
     */
 

    @Override
    public int ataqueEspecial() {
        if(dado1>dado2){
            maxAtaque=dado1+10;
            return maxAtaque;
        }
        if(dado2>dado1){
            maxAtaque=dado2+10;
            return maxAtaque;
            
        }
        if(dado1==dado2){
            return 0;
        }
        return maxAtaque;
    }
    /**
     * Metodo para calcular el daño que nos ocacionan
     * @param daño 
     */
    @Override
    public void daño(int daño) {
        this.vida-=daño;
    }
    

}
