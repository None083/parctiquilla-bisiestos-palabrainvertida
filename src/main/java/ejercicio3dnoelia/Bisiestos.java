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
public class Bisiestos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Hacer un bucle hasta que el usuario introduzca un 0
        //si introduce un año negativo se pone positivo
        //y una vez que es positivo mayor que 0, te dice si es bisiesto o no
        //para que sea bisiesto tiene que ser divisible por 4 y 
        //no divisible por 100 ó divisible por 400
        
        //1988, 2000, 2004 si son
        //1900 no es bisiesto
        
        Scanner teclado = new Scanner(System.in);
        int numero = 1;
        
        
        while (numero != 0) {
            System.out.println("Introduzca un año");
            numero = teclado.nextInt();
            
            numero = Math.abs(numero);
            
            if (numero%4 == 0 && (numero%100 != 0 || numero%400 == 0)) {
                System.out.println("El año " + numero + " es bisiesto.");
            } else {
                System.out.println("El año " + numero + " no es bisiesto.");
            }
            
        }
        
        
        
        
        
    }
    
}
