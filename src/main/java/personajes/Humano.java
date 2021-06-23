package personajes;

public  class Humano {

    private String nombre;
    private int vida;
    private int armadura;
    private int maxAtaque;
    private int dado;
    private String[] bestias;
    private String[] heroes;
    private String[] muertos;

    protected int tirarDados(int dado, int aumento) {

        this.dado = dado;
        return this.dado;
    }

    public Humano(String nombre, int vida, int armadura, int maxAtaque, int dado) {
        this.nombre = nombre;
        this.vida = vida;
        this.armadura = armadura;
        this.maxAtaque = maxAtaque;
        this.dado = dado;
    }

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

    public int getDado() {
        return dado;
    }

    public void setDado(int dado) {
        this.dado = dado;
    }

    public int ataqueMaximo() {
        int ataque=(int)(Math.random()*10);
        return ataque*maxAtaque;

    }

    public int ataque() {
        int ataque=(int)(Math.random()*10);
        return ataque;
    }
    
    public void daño(int daño){
        this.vida-=daño;
    }

}
