import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();
        System.out.println(palabra);
        scanner.close();
    }
}
