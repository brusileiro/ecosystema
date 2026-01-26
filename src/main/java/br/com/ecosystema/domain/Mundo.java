package br.com.ecosystema.domain;

public class Mundo {

    private double fatorClimaDia;
    private double nutrientesSolo;
    private double biomassaPlantas;

    public double getNutrientesSolo() {
        return nutrientesSolo;
    }

    public void setNutrientesSolo(double nutrientesSolo) {
        this.nutrientesSolo = nutrientesSolo;
    }

    public double getBiomassaPlantas() {
        return biomassaPlantas;
    }

    public void setBiomassaPlantas(double biomassaPlantas) {
        this.biomassaPlantas = biomassaPlantas;
    }

    public double getFatorClimaDia() {
        return fatorClimaDia;
    }

    public void setFatorClimaDia(double fatorClimaDia) {
        this.fatorClimaDia = fatorClimaDia;
    }
}
