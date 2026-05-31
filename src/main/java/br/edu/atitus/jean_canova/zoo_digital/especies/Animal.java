package br.edu.atitus.jean_canova.zoo_digital.especies;

import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public abstract class Animal {
    private static int contador = 0;

    public static int getContador() {
        return contador;
    }

    public final String VERSAO_APP = "2.5";

    private String nome;
    private String especie;
    private Integer idade;

    public Animal(String nome, String especie, Integer idade){
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;

        Animal.contador++;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEspecie() {
        return especie;
    }
    public void setEspecie(String especie) {
        this.especie = especie;
    }
    public Integer getIdade() {
        return idade;
    }
    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public void comer() {
        this.comer("alguma coisa");
    }

    public final void comer(String alimento) {
        IO.println(this.getNome() + " está comendo " + alimento);
    }

    @Override
    public String toString() {
        return "Nome: " + this.getNome() + "; Idade: " + this.getIdade() + " anos.";
    }


    public abstract void emitirSom();


}