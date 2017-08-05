/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package variables;

/**
 *
 * @author Erick
 */
public class ManejoVariablesTest {

    public static void main(String[] args) {
        //variables boolean, declaracion
        boolean bool1;
        //inizializacion
        bool1 = true;
        //Declaracion e inizializacion
        boolean bool2 = false;
        System.out.println("Valor bool1: "+ bool1);
        System.out.println("Valor bool2: "+ bool2);
        System.out.println("");
        
        //Variable byte
        byte b1 = 11;
        //Literal en exadecimal
        byte b2 = 0xa;
        System.out.println("Valor de b1: " + b1);
        System.out.println("Valor de b2: " + b2);
        System.out.println("");
        
        //Variables short
        short s1 = 2;
        System.out.println("Valor de s1: " + s1);
        System.out.println("");
        
        //Variable char, declaracion e inicializacion en una sola linea
        //La primera declaraciÃ³n es en UNICODE
        //http://www.icursos.net/referencias/TablaUnicode.html
        
        char ch1 = 65, ch2 = 'A';
        System.out.println("Valor de ch1: "+ ch1);
        System.out.println("Valor de ch2: "+ ch2);
        System.out.println("");
        
        //Variable enteras
        int decimal = 100;
        int octal = 0144;//Valor octal inicia con 0
        int hexa = 0x64;//Valor hexadecimal onicia con 0x
        System.out.println("Valor int decimal:" + decimal);
        System.out.println("Valor int octal:" + octal);
        System.out.println("Valor int hexadecimal:" + hexa);
        System.out.println();
        
        //Variables long
        long long1 = 10, long2 = 20L;
        System.out.println("Valor long1:" + long1);
        System.out.println("Valor long2:" + long2);
        System.out.println();
        
        //Variables float
        float f1 = 15, f2 = 22.3F;
        System.out.println("Valor float1:" + f1);
        System.out.println("Valor float2:" + f2);
        System.out.println();

        //Variables double
        double d1 = 11.0, d2 = 30.15D;
        System.out.println("Valor long1:" + d1);
        System.out.println("Valor long2:" + d2);
        System.out.println();
        
    }
}
