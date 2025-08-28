package org.example;
import java.util.Random;

class GeradorSenha {
    public static void gerarSenha() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "abcdefghijklmnopqrstuvwxyz"
                + "0123456789";

        int tamanhoSenha = 8;
        StringBuilder senha = new StringBuilder();
        Random random = new Random();

        for (int i = 0; i < tamanhoSenha; i++) {
            int indice = random.nextInt(caracteres.length());
            char caractere = caracteres.charAt(indice);
            senha.append(caractere);
        }

        System.out.println("Senha gerada: " + senha.toString());
    }
}


