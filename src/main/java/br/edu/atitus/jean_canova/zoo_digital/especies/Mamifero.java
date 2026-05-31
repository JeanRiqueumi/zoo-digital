package br.edu.atitus.jean_canova.zoo_digital.especies;
import br.edu.atitus.jean_canova.zoo_digital.app.IO;

public abstract class Mamifero extends Animal {

    public Mamifero(String nome, Integer idade, Boolean temPelos) {
        super(nome, "Mamífero", idade);
        this.temPelos = temPelos;
    }

    private Boolean temPelos;

    public Boolean getTemPelos() {
        return temPelos;
    }

    public void setTemPelos(Boolean temPelos) {
        this.temPelos = temPelos;
    }

    public void amamentar() {
        IO.println(this.getNome() + " está amamentando seus filhotinhos.");
    }
    
    
}
