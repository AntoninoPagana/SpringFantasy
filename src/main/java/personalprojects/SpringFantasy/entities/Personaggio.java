package personalprojects.SpringFantasy.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import personalprojects.SpringFantasy.enums.Classe;
import personalprojects.SpringFantasy.enums.Razza;

@Entity
public class Personaggio {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;
    private Razza razza;
    private Classe classe;
    private Integer livello;
    private String descrizione;

    public Personaggio() {
    }

    public Personaggio(Long id, String nome, Razza razza, Classe classe, Integer livello, String descrizione) {
        this.id = id;
        this.nome = nome;
        this.razza = razza;
        this.classe = classe;
        this.livello = livello;
        this.descrizione = descrizione;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Razza getRazza() {
        return razza;
    }

    public void setRazza(Razza razza) {
        this.razza = razza;
    }

    public Classe getClasse() {
        return classe;
    }

    public void setClasse(Classe classe) {
        this.classe = classe;
    }

    public Integer getLivello() {
        return livello;
    }

    public void setLivello(Integer livello) {
        this.livello = livello;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
