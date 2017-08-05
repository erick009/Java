/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejooperadores;

/**
 *
 * @author Erick
 */
public class ManejoOperadores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("***** Operadores Aritmeticos *****");
        int a = 1 + 2;
        int b = a * 4;
        int c = b / 2;
        int d = c - a;
        int e = -d;
        
        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("d = "+ d);
        System.out.println("e = "+ e);
        
        System.out.println("\n***** Operador modulo residuo *****");
        System.out.println("x mod 10 = "+ a % 2);
        
        System.out.println("\n***** Operador compuesto *****");
        //a = a+ 4;
        a += 2;
        b -= 4;
        c *= a;
        System.out.println("a = "+ a);
        System.out.println("b = " + b);
        System.out.println("c = "+ c);
        
        System.out.println("\n**** Operador Incremento *****");
        //int a = a + 1;
        //Puede escribirse como:
        a++;
        System.out.println("a = " +a);
        
        //Preincremento / decremento (Se incrementa antes de asignar un valor)
        c = ++a;
        //Postincremento / decremento (Se incrementa despues de asignar el valor)
        //La siguiente vez cuando se evalua b es cuando se incrementa
        d = b++;
        
        System.out.println("b = "+ b);
        System.out.println("c = "+ c);
        System.out.println("d = "+ d);
        
        System.out.println("\n***** Operador Relacional *****");
        //a es menor que b
        boolean res = a < b;
        System.out.println("res = " + res);
        
        System.out.println("\n ***** Operador Tenario ****");
        int min = (a < b) ? a : b;
        System.out.println("min = " + min);
        
        System.out.println("\n **** Operador de Asignacion *****");
        int i, j, k;
        
        i = j = k = 100;
        
        System.out.println("i = "+ i);
        System.out.println("j = "+ j);
        System.out.println("k = "+ k);
                
    }
    
}
