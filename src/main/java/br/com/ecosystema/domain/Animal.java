package br.com.ecosystema.domain;

public class Animal {
    private double energia;
    private double idade;

    public Animal(double energia, double idade) {
        this.energia = energia;
        this.idade = idade;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public double getIdade() {
        return idade;
    }

    public void setIdade(double idade) {
        this.idade = idade;
    }
}
