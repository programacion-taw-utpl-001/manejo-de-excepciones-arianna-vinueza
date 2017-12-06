/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package segundobimestre;

import java.util.Scanner;

/**
 *
 * @author Arianna Vinueza
 */
public class SegundoBimestre {

    public static void main(String[] args) {
//nextln: toda la cadena 
//next: oalabra hasta q encuentre espacio

Scanner entrada = new Scanner(System.in);
    String nombre;
    int edad;
        System.out.println("Ingrese la edad: ");
        edad = entrada.nextInt();
        //llamar al metodo nextline a la entrada
        entrada.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = entrada.nextLine();
        

        System.out.printf("Su nombre es: %s\n", nombre);
        System.out.printf("Su edad es: %d", edad);
    }
    
}
