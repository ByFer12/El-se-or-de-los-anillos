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

    public Ente(int vida, int armadura, int maxAtaque) {
        this.vida = vida;
        this.armadura = armadura;
        this.maxAtaque = maxAtaque;
    }

    public Ente(String nombre) {
        this.nombre = nombre;
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
        return vida+armadura;
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

    public  void daño(int daño){
        this.vida-=daño;
    }

    @Override
    public String toString() {
        return "Nombre: "+nombre+" Vida: "+vida;
    }
    
    
}
