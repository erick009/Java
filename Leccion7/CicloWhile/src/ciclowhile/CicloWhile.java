/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ciclowhile;

/**
 *
 * @author Erick
 */
public class CicloWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int contador = 0;
        int limite = 11;
        
        while (contador < limite) {
            System.out.println("contador = " + contador);
            contador++;
        }
    }
    
}
