package entities;

public class ResultadoCriptografia {
    private String textoCriptografado;
    private int chave;

    public ResultadoCriptografia(String textoCriptografado, int chave) {
        this.textoCriptografado = textoCriptografado;
        this.chave = chave;
    }

    public String getTextoCriptografado() {
        return textoCriptografado;
    }

    public int getChave() {
        return chave;
    }
}