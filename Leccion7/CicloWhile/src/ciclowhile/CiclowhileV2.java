/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class CiclowhileV2 {
    public static void main(String[] args){
        
        System.out.println("Por favor introduce el numero de elementos a iterar");
        int maxElementos;
        
        Scanner entradaEscaner = new Scanner(System.in); //Creacion del objeto Scanner para leer datos
        maxElementos = entradaEscaner.nextInt(); //Leemos el valor proporcionado por el usuario
        
        int contador = 0;
        
        while (contador < maxElementos) {
            System.out.println("Contador = "+ contador);
            contador++;
        }
    }   
    
}
