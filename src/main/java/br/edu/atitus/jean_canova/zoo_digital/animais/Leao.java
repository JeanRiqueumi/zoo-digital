package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.jean_canova.zoo_digital.especies.Mamifero;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Leao extends Mamifero implements Corrida, Predacao {

    public Leao(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() { this.comer("carne fresca"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " deu um rugido estrondoso!"); }

    @Override
    public void correr() { IO.println(this.getNome() + " está correndo pela savana!"); }

    @Override
    public void cacar() { IO.println(this.getNome() + " está caçando uma zebra em bando."); }
}