package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Nado;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.jean_canova.zoo_digital.especies.Repteis;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Jacare extends Repteis implements Corrida, Nado, Predacao {

    public Jacare(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() { this.comer("carne de peixe"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " emite um rugido grave e visceral!"); }

    @Override
    public void correr() { IO.println(this.getNome() + " correu de forma explosiva em direção à margem!"); }

    @Override
    public void nadar() { IO.println(this.getNome() + " está nadando balançando sua cauda massiva!"); }

    @Override
    public void cacar() { IO.println(this.getNome() + " caça esperando pacientemente na beira da lagoa."); }
}