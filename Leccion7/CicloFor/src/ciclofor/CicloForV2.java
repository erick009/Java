/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclofor;

import java.util.Scanner;
/**
 *
 * @author Erick
 */
public class CicloForV2 {
    public static void main (String[] args){
        System.out.println("Por favor ingresa un numero a iterar");
        
        int limite;
        
        Scanner datoLimite = new Scanner(System.in);
        limite = datoLimite.nextInt();
        
        for (int contador = 0; contador < limite; contador++){
            System.out.println("Contador = "+ contador);
        }
        
        
        
    }
}
