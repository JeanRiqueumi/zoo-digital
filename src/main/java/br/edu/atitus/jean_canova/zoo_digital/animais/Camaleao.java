package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.jean_canova.zoo_digital.especies.Repteis;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Camaleao extends Repteis implements Corrida, Predacao {

    public Camaleao(String nome, Integer idade) {
        super(nome, idade, true);
    }

    @Override
    public void comer() { this.comer("grilos"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " emite um sopro sibilado discreto!"); }

    @Override
    public void correr() { IO.println(this.getNome() + " anda bem devagar simulando o vento nas folhas!"); }

    @Override
    public void cacar() { IO.println(this.getNome() + " está caçando lançando sua longa língua pegajosa."); }
}