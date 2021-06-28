package br.com.dtopattern.entities;

import javax.persistence.Entity;

@Entity
public class Employee extends Person{

    private double salary;
    private String cargo;

    public Employee() {

    }

    public Employee(Integer id, String nome, double salary, String cargo) {
        super(id, nome);
        this.salary = salary;
        this.cargo = cargo;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
