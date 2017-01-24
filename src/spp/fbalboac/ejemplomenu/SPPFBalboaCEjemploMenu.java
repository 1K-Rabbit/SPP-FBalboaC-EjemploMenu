/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp.fbalboac.ejemplomenu;
import java.util.Scanner;
/**
 *
 * @author alumno
 */
public class SPPFBalboaCEjemploMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//variables
        int opEntrada;
      Scanner kb = new Scanner (System.in);
        
        //desplegamos menu
        System.out.println("Caluladora de areas, perimetros y volumenes");
        System.out.println("Introduzca la operacion logica");
        System.out.println("1. Calcular areas");
        System.out.println("2. Calcular perimetros");
        System.out.println("3. Calcular volumenes");
        System.out.println("4. Salir");
opEntrada = kb.nextInt();
switch (opEntrada){
    case 1:
        System.out.println("Bienvenido al cálculo de áreas");
        break;
    case 2:
        System.out.println("Bienvenido al cálculo de perimetros");
        break;
    case 3: 
        System.out.println("Bienvenido al cálculo de volúmenes");
        break;
    default:
        System.out.println("Adiós");
}
// TODO code application logic here
    }
    
}
