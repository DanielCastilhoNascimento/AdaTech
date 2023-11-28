package PACKAGE_NAME;

import java.util.Random;
import java.util.Scanner;

public class BingoAda {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println  ("       Seja Bem vindo ao Bingo 50+ da Ada");
        System.out.println  ("-------------------------------------------------");
        System.out.println  ("Digite o nome dos Jogadores separados por hifem: ");

        String nomeJogadores = scanner.nextLine();
        nomeJogadores.split("-");
        System.out.println(nomeJogadores);

        int [][] cartela = new int[nomeJogadores.length()][5];
        StringBuilder linha = new StringBuilder();
        int[] numeros = new int[60];
        Random random = new Random();
        for (int i = 0; i < nomeJogadores.length(); i++) {
            numeros[i] = random.nextInt(60) + 1;
        }

    }

}
