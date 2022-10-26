/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3dnoelia;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class InversorDePalabras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //yo leo una palabra por teclado hasta que ponga salir
        //consiste en leer una palabra y darle la vuelta (tomate/etamot)
        
        Scanner teclado = new Scanner(System.in);
        String palabra = "";
        String paraSalir = "salir";
        
        do {
            System.out.println("Introduzca una palabra ");
            palabra = teclado.next();
            if (!palabra.equals(paraSalir)) {
                for (int i = palabra.length() - 1; i >= 0; i--) {
                System.out.print(palabra.charAt(i));
            }
            }
            System.out.println("");
        } while (!palabra.equals(paraSalir));
        
        
        
        

        
        
        
        
    }
    
}
