package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Nado;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.jean_canova.zoo_digital.especies.Peixe;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Tubarao extends Peixe implements Nado, Predacao {

    public Tubarao(String nome, Integer idade) {
        super(nome, idade, "Cartilaginoso");
    }

    @Override
    public void comer() { this.comer("atum fresco"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " se moveu em silêncio absoluto!"); }

    @Override
    public void nadar() { IO.println(this.getNome() + " está nadando com a barbatana para fora d'água!"); }

    @Override
    public void cacar() { IO.println(this.getNome() + " está caçando ao sentir vibrações e sangue na água."); }
}