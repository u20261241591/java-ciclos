package ejerciciosciclos;

import java.util.Scanner;

/**
 *3.b.5. Realizar un programa que pida al usuario 10 números. Debe calcular el resultado de sumar los
números introducidos que sean mayores que el primer numero introducido .
 * @author Jesús David Tovar Rojas
 */
public class cicloEjercicioMedio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("acontinuacion escribe 10 números, escribe el primero luego el segundo y asi sucesivamente");
        int numero1 = sc.nextInt();
        
        int suma = 0;
        
        for (int i=1; i<=9; i++){
            System.out.println("introduce un numero");
            int numeros = sc.nextInt();
            if (numeros > numero1){
                suma=suma + numeros;
            }
        }    
            System.out.println("la suma de todos los numeros que digitaste mayores a "+numero1+" es: "+suma);
        
    }   
}
