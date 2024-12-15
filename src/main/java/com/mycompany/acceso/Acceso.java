/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.acceso;
import java.util.Scanner;

/**
 *
 * @author Eric Rodriguez
 */
public class Acceso {
 public static final String ANSI_RED = "\u001B[31m"; 
 public static final String ANSI_GREEN = "\u001B[32m";
    public static void main(String[] args) {
        
        Scanner entrada= new Scanner(System.in);
        String CCorrecta= "Wth123";
                String CCLAVE;
                int intentos=0;
                int cantidadintentos=0;
        do{
            System.out.println("Favor ingresar una contraseña: ");
            CCLAVE=entrada.nextLine();
            intentos++;
            
            if(!CCorrecta.equals(CCLAVE)){
                System.out.println("Contraseña incorrecta vv, has utilizado: "+ intentos+"intentos"+"de: "+ cantidadintentos);
            
            }
        }while(!CCorrecta.equals(CCLAVE )&& (intentos < cantidadintentos));
        
        if(CCorrecta.equals(CCLAVE)){
            System.out.println(ANSI_GREEN+"Clave correcta, puedes ingresar");
        }
        else{
            System.out.println(ANSI_RED+"No tienes mas intentos");
        }
    }
}
