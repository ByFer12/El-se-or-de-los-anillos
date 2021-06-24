package manejadores;

import bestias.*;
import java.util.Scanner;
import personajes.*;

/**
 * Manejador de todos los orcos
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Manejador1Batalla {

    private Humano[] humanos = new Humano[1];
    private Hobbit[] hobbits = new Hobbit[1];
    private Elfo[] elfos = new Elfo[2];
    private Orco[] orcos = new Orco[2];
    private Trasgo[] trasgos = new Trasgo[2];
    private String[] nombres = new String[2];
    int veces = 0;
    int daño;

    private void cantidadGuerreros() {
        humanos[0] = new Humano("Aragon");
        elfos[0] = new Elfo("Legolas");
        elfos[1] = new Elfo(" Nargothrond");
        hobbits[0] = new Hobbit("Frodo");
        orcos[0] = new Orco("Bregbu");
        orcos[1] = new Orco("Srilcmu");
        trasgos[0] = new Trasgo("Koshnag");
        trasgos[1] = new Trasgo("Dothrur");

    }

    public void jugadores() {
        Scanner ent = new Scanner(System.in);
        System.out.println("JUGADORES:");
        System.out.println("Pidiendo datos: ");
        for (int i = 0; i < 2; i++) {
            System.out.print("Ingrese su nombre: ");
            nombres[i] = ent.nextLine();
        }

    }

    public void batalla() {
        System.out.println("Iniciando guerra");
        do {
            System.out.println("Comienza la guerra");
            daño = orcos[0].ataque();
            humanos[0].daño(daño);
            System.out.println(orcos[0].getNombre() + " Ha realizado un ataque de " + daño + " a " + humanos[0].getNombre());

            daño = humanos[0].ataque();
            orcos[0].daño(daño);
            System.out.println(humanos[0].getNombre() + ": Ha realizado un ataque de " + daño + " a " + orcos[0].getNombre());

            daño = trasgos[0].ataque();
            elfos[0].daño(daño);
            System.out.println(trasgos[0].getNombre() + " Ha realizado un ataque de " + daño + " a " + elfos[0].getNombre());

            daño = elfos[1].ataque();
            trasgos[0].daño(daño);
            System.out.println(elfos[1].getNombre() + " Ha realizado un ataque de " + daño + " a " + trasgos[0].getNombre());

            daño = orcos[1].ataque();
            elfos[1].daño(daño);
            System.out.println(orcos[1].getNombre() + " Ha realizado un ataque de " + daño + " a " + elfos[1].getNombre());

            daño = elfos[1].ataque();
            orcos[1].daño(daño);
            System.out.println(elfos[1].getNombre() + " Ha realizado un ataque de " + daño + " a " + orcos[1].getNombre());

            daño = hobbits[0].ataque();
            trasgos[1].daño(daño);
            System.out.println(hobbits[0].getNombre() + " Ha realizado un ataque de " + daño + " a " + trasgos[1].getNombre());

            daño = trasgos[1].ataque();
            hobbits[0].daño(daño);
            System.out.println(trasgos[1].getNombre() + " Ha realizado un ataque de " + daño + " a " + hobbits[0].getNombre());

            try {
                System.in.read();
            } catch (Exception e) {
                System.out.println("No se puede ejecutar el tiempo de espera: ");

            }

            veces++;
        } while (veces < 3);

    }

}
