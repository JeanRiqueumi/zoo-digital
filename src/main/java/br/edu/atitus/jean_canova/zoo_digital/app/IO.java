package br.edu.atitus.jean_canova.zoo_digital.app;

import java.io.IOException;

public class IO {

    public static void println(String mensagem) {
        System.out.println(mensagem);
    }

    public static void print(String mensagem) {
        System.out.print(mensagem);
    }

    public static String readln() {
        StringBuilder sb = new StringBuilder();
        try {
            int caractere;
            while ((caractere = System.in.read()) != -1) {
                if (caractere == '\n') {
                    break;
                }
                if (caractere != '\r') { // Ignora o retorno de carro do Windows
                    sb.append((char) caractere);
                }
            }
        } catch (IOException e) {
            System.out.println("Erro ao ler dados do teclado.");
        }
        return sb.toString().trim();
    }
}