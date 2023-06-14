import java.util.HashMap;
import java.util.Map;


public class App{
    public static void contarVocalesConsonantes(String texto) {
        Map<Character, Integer> contador = new HashMap<>();
        texto = texto.toLowerCase();
        for (char caracter : texto.toCharArray()) {
            if (Character.isLetter(caracter)) {
                if (esVocal(caracter)) {
                    contador.put(caracter, contador.getOrDefault(caracter, 0) + 1);
                } 
                else {
                    contador.put(caracter, contador.getOrDefault(caracter, 0) + 1);
                }
            }
        }

        System.out.println("Vocales:");
        for (char caracter : contador.keySet()) {
            if (esVocal(caracter)) {
            System.out.println(caracter + ": " + contador.get(caracter));
            }
        }

        System.out.println("\nConsonantes:");
        for (char caracter : contador.keySet()) {
            if (!esVocal(caracter)) {
            System.out.println(caracter + ": " + contador.get(caracter));
            }
        }
    }

    public static boolean esVocal(char caracter) {
        return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }

    public static void main(String[] args) {
        System.out.println("¡Hola Mundo!");
    }
}

