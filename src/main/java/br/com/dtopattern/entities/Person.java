package br.com.dtopattern.entities;

import javax.persistence.*;

@Entity
@Table(name = "Persons")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    private boolean admin;


    public Person() {
        this.admin = false;
    }

    public Person(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
        this.admin = false;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
