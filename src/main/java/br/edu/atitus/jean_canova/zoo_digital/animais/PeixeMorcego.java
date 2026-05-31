package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Nado;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Corrida;
import br.edu.atitus.jean_canova.zoo_digital.especies.Peixe;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class PeixeMorcego extends Peixe implements Nado, Corrida {

    public PeixeMorcego(String nome, Integer idade) {
        super(nome, idade, "Ósseo de fundo de mar");
    }

    @Override
    public void comer() { this.comer("pequenos crustáceos"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " fez um som de estalo debaixo d'água!"); }

    @Override
    public void nadar() { IO.println(this.getNome() + " está nadando lentamente perto do fundo."); }

    @Override
    public void correr() { IO.println(this.getNome() + " está usando as nadadeiras para 'caminhar' no solo oceânico!"); }
}