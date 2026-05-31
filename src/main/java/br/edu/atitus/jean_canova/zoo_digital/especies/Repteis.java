package br.edu.atitus.jean_canova.zoo_digital.especies;

public abstract class Repteis extends Animal {

    private Boolean temEscamas;

    public Repteis(String nome, Integer idade, Boolean temEscamas) {
        super(nome, "Réptil", idade);
        this.temEscamas = temEscamas;
    }

    public Boolean getTemEscamas() {
        return temEscamas;
    }

    public void setTemEscamas(Boolean temEscamas) {
        this.temEscamas = temEscamas;
    }

    public void tomarSol() {
        System.out.println(this.getNome() + " está tomando sol para regular sua temperatura corporal.");
    }
}