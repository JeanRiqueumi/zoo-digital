package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Voo;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.jean_canova.zoo_digital.especies.Mamifero;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Morcego extends Mamifero implements Voo, Predacao {

    public Morcego(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() { this.comer("frutas e insetos"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " emite guinchos ultrassônicos!"); }

    @Override
    public void voar() { IO.println(this.getNome() + " está batendo asas na escuridão da noite!"); }

    @Override
    public void cacar() { IO.println(this.getNome() + " está caçando mariposas no ar."); }
}