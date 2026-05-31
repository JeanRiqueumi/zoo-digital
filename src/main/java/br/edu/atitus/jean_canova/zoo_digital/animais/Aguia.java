package br.edu.atitus.jean_canova.zoo_digital.animais;

import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Voo;
import br.edu.atitus.jean_canova.zoo_digital.comportamentos.Predacao;
import br.edu.atitus.jean_canova.zoo_digital.especies.Ave;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public final class Aguia extends Ave implements Voo, Predacao {

    public Aguia(String nome, Integer idade) {
        super(nome, idade, "Marrom e branca");
    }

    @Override
    public void comer() { this.comer("pequenos roedores"); }

    @Override
    public void emitirSom() { IO.println(this.getNome() + " soltou um pio agudo e imponente!"); }

    @Override
    public void voar() { IO.println(this.getNome() + " está planando majestosamente bem alto!"); }

    @Override
    public void cacar() { IO.println(this.getNome() + " está caçando com visão de longo alcance."); }
}