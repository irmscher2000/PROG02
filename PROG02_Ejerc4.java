/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prog02_ejerc4;

/**
 *
 * @author Moga
 */

// Importo la clase scanner para pedir datos por teclado
import java.util.Scanner;

public class PROG02_Ejerc4 {
    
    // EUGEN MOGA   
    // PROG02_Ejer4
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicio el objeto año para pedir datos al usuario
        Scanner año = new Scanner ( System.in);
        
        // Se pregunta al usuario por la edad
        System.out.print("¿Cuantos años tienes?: ");
        
        // Pedir al usuario que ingresa su edad
        int edad = año.nextInt();
        
        // Mostrar si esta jubilado o no con el operador ternario
        String mensaje = (edad >= 65) ? "Estas jubilado. " : "No estas jubilado. ";
        
        // Imprime el mensaje
        System.out.println(mensaje);
        
        //Cierro el objeto año.
        año.close();
        
    }
    
}
