/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Baraja {
    
    private ArrayList<Carta> baraja;
    private ArrayList<Carta> repartidas;
    private Integer puntero=0;

    public Baraja() {
        baraja= new ArrayList();
        repartidas= new ArrayList();
 
        for (int j = 0; j < 4; j++) {
            switch(j)
            {
                case 0:
               for (int i = 0; i < 10; i++) {
          
               if (i==7 || i==8 ) {
                   baraja.add(new Carta("Espada", (i+3)));
               }
               else
               {
                   baraja.add(new Carta("Espada", (i+1)));
               }
                   
               }
                    break;
                case 1:
                    for (int i = 0; i < 10; i++) {
          
               if (i==7 || i==8 || i==9) {
                   baraja.add(new Carta("Basto", (i+3)));
               }
               else
               {
                   baraja.add(new Carta("Basto", (i+1)));
               }
                   
               }
                    break;
                case 2:
                    for (int i = 0; i < 10; i++) {
          
               if (i==7 || i==8 || i==9) {
                   baraja.add(new Carta("Oro", (i+3)));
               }
               else
               {
                   baraja.add(new Carta("Oro", (i+1)));
               }
                   
               }
                    
                    break;
                case 3:
                    for (int i = 0; i < 10; i++) {
          
               if (i==7 || i==8 || i==9) {
                   baraja.add(new Carta("Copa", (i+3)));
               }
               else
               {
                   baraja.add(new Carta("Copa", (i+1)));
               }
                   
               }
                    break;
                    
            }
            
        }
    }
    public void mostrar()
    {
        for (Carta carta : baraja) {
            System.out.println(carta.toString());
        }
    }
    public void barajar()
    {
        System.out.println("\nSe baraja\n");
        Collections.shuffle(baraja);
    }
    public void siguienteCarta()
    {
        System.out.println("la siguiente carta es: "+baraja.get(puntero).toString());
    }
    public void cartasDisponibles()
    {
        
        System.out.println("Las cartas disponibles son : "+baraja.size());
    }
    public void darCartas()
    {Scanner leer= new Scanner(System.in);
        System.out.println("Ingresar el numero de cartas que desea");
        Integer n= leer.nextInt();
        if(n<=baraja.size())
        {
            for (int i = 0; i < n; i++) {
            repartidas.add(baraja.get(0));
            baraja.remove(0);
        }
        }
        else
        {
            System.out.println("No hay suficientes cartas");
        }
        
    }
    public void cartasMonton()
    {
        if(repartidas.size()==0)
        {
            System.out.println("No salio ninguna carta");
        }
        else
        {
            for (Carta repartida : repartidas) {
                System.out.println("Las cartas repartidas son: ");
                System.out.println(repartida.toString());
            }
        }
    }
    
    
    
}
