package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Nado;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.jean_canova.zoo_digital.especies.Ave;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public class Pinguim extends Ave implements Nado {

    public Pinguim(String nome, int idade, String corPenas) {
        super(nome, idade, corPenas);
    }

    @Override
    public void comer() {
        this.comer("peixes");
    }

    @Override
    public void emitirSom() {
        IO.println(getNome() + " está grasnando");
    }

    @Override
    public void nadar() {
        IO.println(getNome() + " está nadando atrás de peixes");
    }
    
}