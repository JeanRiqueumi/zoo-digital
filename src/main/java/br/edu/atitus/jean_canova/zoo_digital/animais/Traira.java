package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Nado;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.jean_canova.zoo_digital.especies.Peixe;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Traira extends Peixe implements Nado, Predacao {

    public Traira(String nome, Integer idade) {
        super(nome, idade, "Ósseo de água doce");
    }

    @Override
    public void comer() { this.comer("outros peixes menores"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " não emite sons perceptíveis."); }

    @Override
    public void nadar() { IO.println(this.getNome() + " está nadando de forma furtiva entre as plantas do rio."); }

    @Override
    public void cacar() { IO.println(this.getNome() + " ficou imóvel na emboscada e atacou sua presa num piscar de olhos!"); }
}