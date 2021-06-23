package general;

/**
 * Clase ente general para distinguir las cracteristicas generales de los
 * perosonajes
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public abstract class Ente {

    protected String nombre;
    protected int vida;
    protected int armadura;
    protected int maxAtaque;
    protected String[] bestias;
    protected String[] heroes;
    protected String[] muertos;

    /*
    Constructor diferente
     */


    /*
    Constructor general
     */
    public Ente(String nombre, int vida, int armadura, int maxAtaque) {
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;
        this.maxAtaque = maxAtaque;
         }

    /**
     * Metodos getters y setters
     *
     * @return
     */

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public int getArmadura() {
        return armadura;
    }

    public void setArmadura(int armadura) {
        this.armadura = armadura;
    }

    public int getMaxAtaque() {
        return maxAtaque;
    }

    public void setMaxAtaque(int maxAtaque) {
        this.maxAtaque = maxAtaque;
    }



    /**
     * Metodos astractos de los personajes
     *
     * @return
     */

    public abstract int ataque();
    
    public abstract int ataqueEspecial();

    public abstract void daño(int daño);

}
