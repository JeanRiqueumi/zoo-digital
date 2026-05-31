package br.edu.atitus.jean_canova.zoo_digital;

import br.edu.atitus.jean_canova.zoo_digital.especies.Animal;
import br.edu.atitus.jean_canova.zoo_digital.animais.*;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.*;
import org.apache.commons.lang3.StringUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    private static final List<Animal> lista = new ArrayList<>();

    public static void main(String[] args) {
        boolean ativo = true;
        while (ativo) {
            exibirMenu();
            String entrada = lerLinha().trim();
            int opcao = -1;
            try { opcao = Integer.parseInt(entrada); } catch (NumberFormatException e) { }

            switch (opcao) {
                case 1: cadastrar(); break;
                case 2: listarTodos(); break;
                case 3: listarCorredores(); break;
                case 4: listarNadadores(); break;
                case 5: listarVoadores(); break;
                case 6: listarPredadores(); break;
                case 7: System.out.println("\nTotal de Animais: " + Animal.getContador()); break;
                case 0: ativo = false; break;
                default: System.out.println("\n[Opção Inválida!]");
            }
        }
    }

    private static void exibirMenu() {
        System.out.println("\n--- ZOO DIGITAL MENU ---");
        System.out.println("1 - Cadastrar Animal");
        System.out.println("2 - Listar Todos");
        System.out.println("3 - Listar Corredores");
        System.out.println("4 - Listar Nadadores");
        System.out.println("5 - Listar Voadores");
        System.out.println("6 - Listar Predadores");
        System.out.println("7 - Exibir Total Contado (Static)");
        System.out.println("0 - Sair");
        System.out.print("Escolha: ");
    }

    private static void cadastrar() {
        System.out.println("\nSelecione:\n1-Cachorro\n2-Gato\n3-Golfinho\n4-Pato\n5-Peixe-Morcego\n6-Traíra\n7-Leão\n8-Morcego\n9-Águia\n10-Avestruz\n11-Tubarão\n12-Peixe-Palhaço\n13-Jacaré\n14-Tartaruga\n15-Camaleão\n16-Cobra");
        System.out.print("Tipo: ");
        int tipo = -1;
        try { tipo = Integer.parseInt(lerLinha().trim()); } catch (Exception e) { return; }

        System.out.print("Nome: ");
        String nome = lerLinha().trim();

        nome = StringUtils.capitalize(nome.toLowerCase());

        System.out.print("Idade: ");
        int idade = 0;
        try { idade = Integer.parseInt(lerLinha().trim()); } catch (Exception e) { return; }

        Animal a = null;
        switch (tipo) {
            case 1: a = new Cachorro(nome, idade); break;
            case 2: a = new Gato(nome, idade); break;
            case 3: a = new Golfinho(nome, idade); break;
            case 4: a = new Pato(nome, idade); break;
            case 5: a = new PeixeMorcego(nome, idade); break;
            case 6: a = new Traira(nome, idade); break;
            case 7: a = new Leao(nome, idade); break;
            case 8: a = new Morcego(nome, idade); break;
            case 9: a = new Aguia(nome, idade); break;
            case 10: a = new Avestruz(nome, idade); break;
            case 11: a = new Tubarao(nome, idade); break;
            case 12: a = new PeixePalhaco(nome, idade); break;
            case 13: a = new Jacare(nome, idade); break;
            case 14: a = new Tartaruga(nome, idade); break;
            case 15: a = new Camaleao(nome, idade); break;
            case 16: a = new Cobra(nome, idade); break;
        }
        if (a != null) {
            lista.add(a);
            System.out.println("Sucesso!");
        }
    }

    private static void listarTodos() {
        for (Animal a : lista) {
            System.out.println("\nNome: " + a.getNome() + " (" + a.getClass().getSimpleName() + ") - " + a.getIdade() + " anos");
            a.emitirSom();
            a.comer();
        }
    }

    private static void listarCorredores() {
        for (Animal a : lista) {
            if (a instanceof Corrida) {
                System.out.println("\n" + a.getNome());
                ((Corrida) a).correr();
            }
        }
    }

    private static void listarNadadores() {
        for (Animal a : lista) {
            if (a instanceof Nado) {
                System.out.println("\n" + a.getNome());
                ((Nado) a).nadar();
            }
        }
    }

    private static void listarVoadores() {
        for (Animal a : lista) {
            if (a instanceof Voo) {
                System.out.println("\n" + a.getNome());
                ((Voo) a).voar();
            }
        }
    }

    private static void listarPredadores() {
        for (Animal a : lista) {
            if (a instanceof Predacao) {
                System.out.println("\n" + a.getNome());
                ((Predacao) a).cacar();
            }
        }
    }

    private static String lerLinha() {
        StringBuilder sb = new StringBuilder();
        try {
            int c;
            while ((c = System.in.read()) != -1) {
                if (c == '\n') break;
                if (c != '\r') sb.append((char) c);
            }
        } catch (IOException e) { }
        return sb.toString();
    }
}