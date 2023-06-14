import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App{
    public static void decimalToBinary(int n) {
        Queue<String> queue = new LinkedList<>();
        for (int i = 0; i <= n; i++) {
            String binary = Integer.toBinaryString(i);
            queue.offer(binary);
        }
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }

    public static void main(String[] args) {
        System.out.print("Ingrese un número: ");
        Scanner entrada = new Scanner(System.in);
        int numero = entrada.nextInt();
        decimalToBinary(numero);
        entrada.close();
        
    }
}

