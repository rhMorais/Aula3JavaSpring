package br.com.facef.aula3.model;


import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table
public class Empresa implements Serializable {

    private static final long serialVersionUID = 2743214422734200098L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String nome;

    public Empresa() {
    }

    public Empresa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
