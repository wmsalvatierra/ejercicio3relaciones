/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3relaciones;

import entidades.Baraja;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3relaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Baraja b1= new Baraja();
        Scanner leer= new Scanner(System.in);
       int i=0;
       
        do {
            System.out.println("1 barajar");
            System.out.println("2 siguiente carta");
            System.out.println("3 cartas disponibles");
            System.out.println("4 dar cartas");
            System.out.println("5 cartas repartidas");
            System.out.println("6 mostrar baraja");
            System.out.println("0 SALIR");
            System.out.println("INGRESE UNA OPCION --> ");
            i=leer.nextInt();
            switch(i)
            {
                case 1:
                    b1.barajar();
                    break;
                case 2:
                    b1.siguienteCarta();
                    break;
                case 3:
                    b1.cartasDisponibles();
                    break;
                case 4:
                    b1.darCartas();
                    break;
                case 5:
                    b1.cartasMonton();
                    break;
                case 6:
                    b1.mostrar();
                    break;
            }
        }while(i!=0);
        
    }
    
}
