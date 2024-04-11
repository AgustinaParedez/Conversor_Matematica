import java.util.Scanner;

public class ConversorBinario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese el número binario de 16 dígitos
        System.out.println("Ingrese un número binario de 16 dígitos:");
        String numeroBinario = scanner.nextLine();
        if (numeroBinario.length() != 16 || !numeroBinario.matches("[01]+")) {
            System.out.println("El número binario debe tener exactamente 16 dígitos (0 o 1).");
            return;
        }
        // B a D
        int decimal = Integer.parseInt(numeroBinario, 2);
        System.out.println("Decimal: " + decimal);
        // D a O
        String octal = Integer.toOctalString(decimal);
        System.out.println("Octal: " + octal);
        // D a H
        String hexadecimal = Integer.toHexString(decimal);
        System.out.println("Hexadecimal: " + hexadecimal.toUpperCase());
    }
}