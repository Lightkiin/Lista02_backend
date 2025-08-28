package org.example;
import java.util.Random;
import java.util.Scanner;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String[] nomes = { "William", "Felipe", "Maradona", "Renato" };
        String[] sobrenomes = {"Gaucho", "Mineiro", "Paulista", "Geromel", "Silva", "Junior"};
        String[] clubes = {"Criciuma", "Fortaleza", "Vasco", "ABC", "Paysandu", "Prospera", "Brusque"};
        String[] posicoes = {"goleiro", "zagueiro", "lateral", "meio-campo", "atacante"};

        Random random = new Random();

        String[] aramazenaNome = new String[11];
        String[] aramazenaSobrenome = new String[11];
        String[] aramazenaClube = new String[11];
        String[] aramazenaPosicao = new String[11];
        Short[] aramazenaIdade = new Short[11];

        // >>> aqui sorteia dentro do loop <<<
        for(int c = 0; c <= 10; c++ ){
            String nome = nomes[random.nextInt(nomes.length)];
            String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
            String clube = clubes[random.nextInt(clubes.length)];
            String posicao = posicoes[random.nextInt(posicoes.length)];
            Short idade = (short) (random.nextInt(29) + 1); // 1 a 30

            aramazenaNome[c] = nome;
            aramazenaSobrenome[c] = sobrenome;
            aramazenaClube[c] = clube;
            aramazenaPosicao[c] = posicao;
            aramazenaIdade[c] = idade;
        }

        for(int c = 0; c <= 10; c++ ){
            Jogador player = new Jogador(
                    aramazenaNome[c],
                    aramazenaSobrenome[c],
                    aramazenaClube[c],
                    aramazenaPosicao[c],
                    aramazenaIdade[c]
            );
            System.out.println(player.nome + " " + player.sobrenome +
                    " é um futbolista brasileiro de " + player.idade +
                    " anos que atua como " + player.posicao +
                    ". Atualmente no clube " + player.clube);
        }

        GeradorSenha.gerarSenha();
        GeradorPokemon.gerarPokemons();
    }

    static void ex01() {
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
    static void ex02() {
        String[] nomes = {"Cássio", "Neymar", "Gabriel", "Thiago", "Vinícius", "Rodrygo", "Alisson"};
        String[] sobrenomes = {"Ramos", "Silva", "Souza", "Oliveira", "Costa", "Ferreira", "Pereira"};
        String[] posicoes = {"goleiro", "zagueiro", "lateral", "meia", "atacante"};
        String[] times = {"Corinthians", "Palmeiras", "Flamengo", "São Paulo", "Liverpool", "Real Madrid"};

        Random random = new Random();

        String nome = nomes[random.nextInt(nomes.length)];
        String sobrenome = sobrenomes[random.nextInt(sobrenomes.length)];
        String posicao = posicoes[random.nextInt(posicoes.length)];
        String time = times[random.nextInt(times.length)];

        int idade = 16 + random.nextInt(25);

        System.out.println(nome + " " + sobrenome + " é um futebolista brasileiro de "
                + idade + " anos que atua como " + posicao
                + ". Atualmente defende o " + time + ".");
    }
    static void ex03() {
        Scanner read = new Scanner(System.in);
        Random random = new Random();

        String[] nomes = {"Pikachu", "Charmander", "Squirtle", "Bulbasaur", "Eevee", "Gengar", "Snorlax", "Dragonite", "Lucario"};
        String[] tipos = {"Elétrico", "Fogo", "Água", "Planta", "Normal", "Fantasma", "Psíquico", "Dragão", "Lutador"};

        System.out.print("Quantos Pokémon deseja gerar? ");
        int quantidade = read.nextInt();

        System.out.println("\n--- Pokémons Gerados ---");
        for (int i = 0; i < quantidade; i++) {
            String nome = nomes[random.nextInt(nomes.length)];
            String tipo = tipos[random.nextInt(tipos.length)];
            int nivel = 1 + random.nextInt(100); // nível de 1 a 100

            System.out.println(nome + " é um Pokémon do tipo " + tipo + " de nível " + nivel + ".");
        }
    }

}
