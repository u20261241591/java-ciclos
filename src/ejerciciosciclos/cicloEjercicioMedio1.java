package ejerciciosciclos;
  import java.util.Scanner;
/**
 * 3.b.3. Escribir un programa que pida una base y un exponente (ambos números son enteros positivos) y que
calcule la potencia. Ejemplo, si se indica 3 y 4, nos da 81 de solución (3 elevado a 4, es 3*3*3*3).
 * @author Jesús David Tovar Rojas
 */
  

public class cicloEjercicioMedio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa la base: ");
        int base = sc.nextInt();
        System.out.print("Ingresa el exponente: ");
        int exponente = sc.nextInt();
        int resultado = 1;
        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }
        System.out.println(base + " elevado a " + exponente + " es: " + resultado);
    }
}
