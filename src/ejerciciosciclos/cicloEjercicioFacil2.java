package ejerciciosciclos;

import java.util.Scanner;

/**
 * 3.a.16.Programa que pide por teclado números, de manera continua, hasta que se introducen dos números iguales
 *
 * @author Jesús David Tovar Rojas
 */
public class cicloEjercicioFacil2{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        System.out.println("introduce un número");
        int anterior = sc.nextInt();
        
        while (true){
            System.out.println("introduce un número");
            int actual = sc.nextInt();
            if(anterior == actual){
            System.out.println("acaba de repetir el número anterior, o sea el "+actual);
            break;
            }else{
               anterior = actual;
            }
        }
    }
}
