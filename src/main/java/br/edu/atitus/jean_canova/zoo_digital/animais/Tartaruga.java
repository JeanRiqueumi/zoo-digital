package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Nado;
import br.edu.atitus.jean_canova.zoo_digital.especies.Repteis;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Tartaruga extends Repteis implements Nado {

    public Tartaruga(String nome, Integer idade) {
        super(nome, idade, false);
    }

    @Override
    public void comer() { this.comer("algas marinhas"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " soltou uma lufada de ar pesada!"); }

    @Override
    public void nadar() { IO.println(this.getNome() + " está nadando calmamente usando as nadadeiras frontais!"); }
}