/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclodowhile;

import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class CicloDoWhileV2 {
    public static void main (String[] args){
        
        System.out.println("Por favor ingresa un numero");
        
        int limite;
        
        Scanner datoLimite = new Scanner(System.in);//Se le solicita el dato al usuario
        limite = datoLimite.nextInt();// obtenemos el dato y se lo pasamos a la variable limite
        
        int contador = 0;
        
        do {
            System.out.println("Contador = "+ contador);
            contador++;
        }
        while (contador < limite);
        
        
    }
}
