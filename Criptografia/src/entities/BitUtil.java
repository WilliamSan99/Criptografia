package entities;

public class BitUtil {

    public static String decimalParaBinario(int valor) {
        String bin = Integer.toBinaryString(valor);
        return String.format("%8s", bin).replace(' ', '0'); // Garante 8 bits
    }

    public static String inverterBits(String binario) {
        StringBuilder sb = new StringBuilder();
        for (char bit : binario.toCharArray()) {
            sb.append(bit == '0' ? '1' : '0');
        }
        return sb.toString();
    }

    public static int binarioParaDecimal(String binario) {
        return Integer.parseInt(binario, 2);
    }
}
