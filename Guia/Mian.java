/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Guia;
import static Guia.Metodos.ContarDigitos;
import static Guia.Metodos.SumaDigitos;
import static Guia.Metodos.VoltearCadena;
import static Guia.Metodos.calcularMCD;
import java.util.Scanner;

/**
 *
 * @author alvar
 */
public class Mian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int i = 1,digito,num1,num2;
        String op,palabra;
        while(i ==1){
            System.out.println("Menú.");
            System.out.println("1. Contar digitos. ");
            System.out.println("2. Suma de digitos. ");
            System.out.println("3. Maximo común divisor.");
            System.out.println("4. Voltear cadena. ");
            System.out.println("5. Salir. ");
            System.out.println("");
            System.out.println("Ingrese una opcion. ");
            op = entrada.nextLine();
            if("1".equals(op)){
                try{
                    System.out.println("Ingrese el digito. ");
                    digito = entrada.nextInt();
                    ContarDigitos(digito);                    
                }
                catch(Exception ex){
                    System.out.println("ingrese un numero valido. ");
                }
                                                
            }
            if("2".equals(op)){
                try{
                    System.out.println("Ingrese el digito. ");
                    digito = entrada.nextInt();
                    SumaDigitos(digito);                    
                }
                catch(Exception ex){
                    System.out.println("Ingrese un numero valido. ");
                }
                                                
            }
            if("3".equals(op)){
                try{
                    System.out.println("Ingrese el primer numero. ");
                    num1 = entrada.nextInt();
                    System.out.println("Ingrese el segundo numero numero. ");
                    num2 = entrada.nextInt();
                    calcularMCD(num1,num2);
                    
                    
                }
                catch(Exception ex){
                    System.out.println("Ingrese un numero valido. ");
                }
                                                
            }
            if("4".equals(op)){
                System.out.println("Ingrese la palabra. ");
                palabra = entrada.nextLine();
                VoltearCadena(palabra);
                
            }
            if("5".equals(op)){
                i=30;
                System.out.println("Fin del programa.");
                
            }
            
            
            
            else{
                System.out.println("Ingrese una opcion valida. ");
            }
            
            
            
            
        }
        
        
        
        
        
    }
    
}
