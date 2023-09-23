package Recursiva;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class FibonnaciRecusiva {
    public static List<Integer> sequenciaFibonacci(int numero) {
        List<Integer> sequenciaFibonacci = new ArrayList<>();

        if (numero <= 0) {
            return sequenciaFibonacci;
        }

        int a = 0, b = 1;
        sequenciaFibonacci.add(a);

        while (b <= numero) {
            sequenciaFibonacci.add(b);
            int temp = a + b;
            a = b;
            b = temp;
        }

        return sequenciaFibonacci;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        List<Integer> resultado = sequenciaFibonacci(numero);
        System.out.println("Sequência de Fibonacci até " + numero + ":");
        for (int num : resultado) {
            System.out.print(num + " ");
        }
    }
}