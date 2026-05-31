package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Nado;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Voo;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.jean_canova.zoo_digital.especies.Ave;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Pato extends Ave implements Nado, Voo, Corrida {

    public Pato(String nome, Integer idade) {

        super(nome, idade, "Branco e cinza");
    }

    @Override
    public void comer() {
        this.comer("pequenos peixes e plantas aquáticas");
    }

    @Override
    public void emitirSom() {
        IO.println(this.getNome() + " soltou um: Quack Quack!");
    }

    @Override
    public void nadar() {
        IO.println(this.getNome() + " está boiando e nadando com suas patas palmadas.");
    }

    @Override
    public void voar() {
        IO.println(this.getNome() + " bateu asas e fez um voo rasante e curto sobre a água.");
    }

    @Override
    public void correr() {
        IO.println(this.getNome() + " está andando de um jeito engraçado balançando o corpo.");
    }
}