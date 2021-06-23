package personajes;

import general.Ente;

public abstract class Heroe extends Ente {

    protected int cantMuertos;
    protected int dado1;
    protected int dado2;

    /**
     * Constructor heredado de la clase padre Ente con los siguients atributos
     *
     * @param nombre
     * @param vida
     * @param armadura
     * @param maxAtaque
     * @param dado
     */
    public Heroe(String nombre, int vida, int armadura, int maxAtaque) {
        super(nombre, vida, armadura, maxAtaque);
    }

    /**
     * get y set de la cantidad de mmuertos
     * @return 
     */
    public int getCantMuertos() {
        return cantMuertos;
    }

    public void setCantMuertos(int cantMuertos) {
        this.cantMuertos = cantMuertos;
    }
    
       @Override
    public int ataque() {
        int golpe=0;
         dado1 = (int) (Math.random() * 100 + 1);
         dado2 = (int) (Math.random() * 100 + 1);
        if (dado1 > dado2) {
            golpe = dado1;
            return golpe;
        }
        if (dado2 > dado1) {
            golpe = dado2;
            return golpe;

        }
        if(dado1==dado2){
            return 0;
        }
        return golpe;

        }

}
