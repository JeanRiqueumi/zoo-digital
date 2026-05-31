package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.jean_canova.zoo_digital.especies.Repteis;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Cobra extends Repteis implements Predacao {

    public Cobra(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() { this.comer("pequenos roedores"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " faz: Sssssssssss!"); }

    @Override
    public void cacar() { IO.println(this.getNome() + " está esgueirando-se camuflada para dar o bote."); }
}