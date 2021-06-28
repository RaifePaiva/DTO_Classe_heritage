package br.com.dtopattern.dtos;

public class PersonDTO {

    private String nome;
    private String cargo;
    private Double salary;

    public PersonDTO() {

    }

    public PersonDTO(String nome, String cargo, Double salary) {
        this.nome = nome;
        this.cargo = cargo;
        this.salary = salary;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

}
