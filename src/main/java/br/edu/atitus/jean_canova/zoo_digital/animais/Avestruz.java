package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.jean_canova.zoo_digital.especies.Ave;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Avestruz extends Ave implements Corrida {

    public Avestruz(String nome, Integer idade) {
        super(nome, idade, "Preto e branco");
    }

    @Override
    public void comer() { this.comer("sementes e brotos"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " fez um som gutural abafado!"); }

    @Override
    public void correr() { IO.println(this.getNome() + " está correndo a 70 km/h pelas planícies!"); }
}