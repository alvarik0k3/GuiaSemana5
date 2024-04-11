/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Guia;

/**
 *
 * @author alvar
 */
public class Metodos {
    public static int contador = 1;
    public static int suma = 0;
    
    
    
    
    public static void ContarDigitos(int digitos){
        
        
        
        if(digitos <10){
            System.out.println("el numero tiene: "+Metodos.contador+" digitos.");
            Metodos.contador = 1;
            return ;           
        }        
        Metodos.contador++;            
        ContarDigitos(digitos/10);
               
    
        
        
        
    }
    
    public static void SumaDigitos(int digito){
        
        
        if(digito<10){
            suma+= (digito%10);
            System.out.println("el resultado es :"+ suma +" .");
            suma = 0;
            return;
        }
        suma = suma + (digito%10);
        
        SumaDigitos(digito/10);
        
        
    
        
        
        
    }
    
    
    public static void VoltearCadena(String palabra){
        int index = palabra.length()-1;
        
        if(index==0){
            System.out.print(palabra.charAt(index));
            
            return;
        }
        System.out.print(palabra.charAt(index));
        palabra = palabra.substring(0, palabra.length()-1);
        
        VoltearCadena(palabra);
        
        
        
        
    }
    
    
    
    
    
    
    
    
    public static void calcularMCD(int num1, int num2) {
        if (num2 == 0) {
            System.out.println("el MCD es: "+ num1);
            return;
        }
            calcularMCD(num2, num1 % num2);
        }
    
    
    
    
    }

    
    

