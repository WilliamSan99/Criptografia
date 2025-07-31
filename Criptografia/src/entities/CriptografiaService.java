package entities;

public class CriptografiaService {

    public ResultadoCriptografia criptografarComChave(String texto) {
        int deslocamentoReal = ClockUtil.getDeslocamento();
        int chaveObfuscada = deslocamentoReal * 3 + 17;

        StringBuilder sb = new StringBuilder();

        for (char caractere : texto.toCharArray()) {
            int ascii = (int) caractere;
            int asciiDeslocado = ascii + deslocamentoReal;

            String binario = BitUtil.decimalParaBinario(asciiDeslocado);

            String binarioInvertido = BitUtil.inverterBits(binario);
            int finalDecimal = BitUtil.binarioParaDecimal(binarioInvertido);



            sb.append(finalDecimal).append(" ");
        }

        return new ResultadoCriptografia(sb.toString().trim(), chaveObfuscada);
    }

    public String descriptografarComChave(String textoCriptografado, int chaveRecebida) {
        int deslocamento = (chaveRecebida - 17) / 3;
        StringBuilder resultado = new StringBuilder();

        String[] numeros = textoCriptografado.trim().split(" ");

        for (String numeroStr : numeros) {
            try {
                int numero = Integer.parseInt(numeroStr);

                String binario = BitUtil.decimalParaBinario(numero);
                String binarioInvertido = BitUtil.inverterBits(binario);
                int valorOriginal = BitUtil.binarioParaDecimal(binarioInvertido);

                int asciiOriginal = valorOriginal - deslocamento;

                if (asciiOriginal < 0 || asciiOriginal > 255) {
                    resultado.append('?');
                } else {
                    resultado.append((char) asciiOriginal);
                }
            } catch (NumberFormatException e) {
                resultado.append('?');
            }
        }

        return resultado.toString();
    }
}
