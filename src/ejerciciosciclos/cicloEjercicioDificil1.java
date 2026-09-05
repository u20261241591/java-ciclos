package ejerciciosciclos;

import java.util.Scanner;

/**
 *3.c.1. Pedir por teclado un número y calcular su factorial. Si el número introducido es negativo se seguirá 
 pidiendo hasta que sea positivo.
 * @author Jesús David Tovar Rojas
 */
public class cicloEjercicioDificil1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("digite el número al cual quieres calcularle su factorial");
        long factorial = sc.nextInt();
        
        while (factorial<0){
            System.out.println("digite un número positivo porfavor");
           factorial = sc.nextInt();
        }
        long resultado = 1;
        
        for (long i=1; i<=factorial; i++){
        resultado = resultado * i;
        }
        System.out.println(resultado);
    }     
}