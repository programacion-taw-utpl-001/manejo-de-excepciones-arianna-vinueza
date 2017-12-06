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
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
       int cont=0;
        String nombre,apellido;
        //useDelimiter => se usa para decir que queremos leer siguiente campo a partir de un salto
        Scanner teclado= new Scanner(System.in).useDelimiter("\n");
        Estudiante estudiantes[]= new Estudiante[4];
        
        double notasM[]= new double[4];
        double notasS[]= new double[4];
        
        while(cont<4){
            try {
                System.out.println("POSICION: "+cont);
                System.out.print("Ingrese nombre: ");
                nombre= teclado.next();
                System.out.print("Ingrese apellido: ");
                apellido= teclado.next();
                System.out.print("Ingrese nota Matematica: ");
                notasM[cont]= Double.parseDouble(teclado.next());
                //Se realiza el cast para comprobar que no hay letras en las notas
                
                System.out.print("Ingrese nota Sociales: ");
                notasS[cont]= Double.parseDouble(teclado.next());
                //Se realiza el cast para comprobar que no hay letras en las notas
                
                estudiantes[cont]= new Estudiante(nombre,apellido);
                cont++;
                
                
            } catch (NumberFormatException numberFormatException) {
            //Excepcion por el formato numerico 
                System.err.println("No se puede poner letras en notas!");
            }catch (Exception e){
                
            }
        }
        //Se setea la data
        Asignacion a= new Asignacion(estudiantes,notasM,notasS);
        
        //Imprimir toda los datos
        System.out.println(a);
    }
}

