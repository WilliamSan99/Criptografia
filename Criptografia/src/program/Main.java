package program;

import entities.CriptografiaService;
import entities.ResultadoCriptografia;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*CriptografiaService criptografia = new CriptografiaService();

        String mensagemOriginal = "ABC hij";

        ResultadoCriptografia resultado = criptografia.criptografarComChave(mensagemOriginal);

        System.out.println("Texto criptografado: " + resultado.getTextoCriptografado());
        System.out.println("Chave gerada: " + resultado.getChave());

        String mensagemDescriptografada = criptografia.descriptografarComChave(
                resultado.getTextoCriptografado(),
                resultado.getChave()
        );

        System.out.println("Mensagem descriptografada: " + mensagemDescriptografada);*/
        CriptografiaService criptografia = new CriptografiaService();
        Scanner sc = new Scanner(System.in);
        System.out.println("-----Entre com uma da Opções-----");
        System.out.println("1 - Criptografia");
        System.out.println("2 - Descptografia");
        System.out.println("3 - Gerador de senhas");

        int i = sc.nextInt();
        sc.nextLine();

        switch (i){
            case 1:
                System.out.println("Digite a mensagem a se Criptografada");
                String mensagemOriginal = sc.nextLine();
                ResultadoCriptografia resultado = criptografia.criptografarComChave(mensagemOriginal);

                System.out.println("Mensagem criptografada --- (SALVAR)");
                System.out.println(resultado.getTextoCriptografado());

                System.out.println("----------------------------------------------");
                System.out.println("Chave para desciptografar a mensagem (SALVAR)");
                System.out.println("("+resultado.getChave()+")");
            break;
            case 2:
                System.out.println("Digite a mensagem criptografada");
                String mesagemCriptograda = sc.nextLine();
                System.out.println("Digite a chave");
                int chave = sc.nextInt();
                sc.nextLine();

                System.out.println(criptografia.descriptografarComChave(mesagemCriptograda,chave));
                break;
            case 3:
                break;
        }
    }
}
