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
public class TryCatch {

    //int valor = 10/0;
    //int valor = Integer.parseInt("Loja");
    
    public static int cociente(int numerador, int denominador) {
        return numerador / denominador;
    }

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       
        boolean proceso = true;
       
        while (proceso) {
            try {
                System.out.println("Ingrese el numerador: ");
                int numerador = entrada.nextInt();
                System.out.println("Ingrese el denominador: ");
                int denominador = entrada.nextInt();
                int resultado = cociente(numerador, denominador);
                System.out.printf("\nResultado: %d / %d = %d\n", numerador,
                        denominador, resultado);
                proceso = false;

            } //ciclo para el nuevo ingreso
            catch (Exception e) {
                System.err.printf("\nExcepcion: %s\n", e);
                
                System.out.println("Error, ingrese numeros mayores a 0\nIngrese de nuevo");
            }
        }
    }
    /*Scanner explorador = new Scanner( System.in ); // objeto Scanner para entrada

      System.out.print( "Introduzca un numerador entero: " );
      int numerador = explorador.nextInt();
      System.out.print( "Introduzca un denominador entero: " );
      int denominador = explorador.nextInt();

      int resultado = cociente( numerador, denominador );
      System.out.printf( 
         "\nResultado: %d / %d = %d\n", numerador, denominador, resultado );*/
}
