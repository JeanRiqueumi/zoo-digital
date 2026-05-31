package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Nado;
import br.edu.atitus.jean_canova.zoo_digital.especies.Peixe;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class PeixePalhaco extends Peixe implements Nado {

    public PeixePalhaco(String nome, Integer idade) {
        super(nome, idade, "Ósseo tropical");
    }

    @Override
    public void comer() { this.comer("zooplâncton"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " fez estalos defensivos!"); }

    @Override
    public void nadar() { IO.println(this.getNome() + " está nadando alegremente entre os tentáculos de uma anêmona!"); }
}