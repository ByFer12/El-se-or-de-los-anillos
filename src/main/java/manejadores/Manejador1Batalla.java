/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package manejadores;

import bestias.*;
import personajes.*;

/**
 * Manejador de todos los orcos
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Manejador1Batalla {
 
    private Humano [] humanos;
    private Hobbit [] hobbits;
    private Elfo[]elfos;
    private Orco[]orcos;
    private Trasgo[]trasgos;
    
    private void cantidadGuerreros(){
    int guerreros,bestias;
    guerreros=(int)(Math.random()*3+1);
    humanos=new Humano[guerreros];
    hobbits= new Hobbit[guerreros];
    elfos= new Elfo[guerreros];
    bestias=(int)(Math.random()*4);
    orcos= new Orco[bestias];
   trasgos= new Trasgo[bestias];
    }
    

}
