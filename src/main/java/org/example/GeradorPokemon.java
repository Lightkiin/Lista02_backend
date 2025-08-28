package org.example;
import java.util.Random;
import java.util.Scanner;


class GeradorPokemon {
    public static void gerarPokemons() {
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


