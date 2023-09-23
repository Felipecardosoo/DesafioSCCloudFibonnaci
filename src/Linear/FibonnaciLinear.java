package Linear;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FibonnaciLinear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número");
        int numero = scanner.nextInt();
        System.out.println("Sequência de Fibonacci até " + numero + ":");

        List<Integer> sequenciaFibonacci = new ArrayList<>();

        int a = 0, b = 1;
        sequenciaFibonacci.add(a);

        while (b <= numero) {
            sequenciaFibonacci.add(b);
            int temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println(sequenciaFibonacci);
    }
}
