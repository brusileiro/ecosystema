package br.com.ecosystema.domain;

import java.util.ArrayList;
import java.util.List;

public class Mundo {

    private double fatorClimaDia;
    private double nutrientesSolo;
    private double biomassaPlantas;
    private Long diaAtual = 0L;
    List<Herbivoro> herbivoros = new ArrayList<>();
    public List<Carnivoro> carnivoros = new ArrayList<>();
    private double carcacas;

    public List<Carnivoro> getCarnivoros() {
        return carnivoros;
    }

    public void setCarnivoros(List<Carnivoro> carnivoros) {
        this.carnivoros = carnivoros;
    }

    public List<Herbivoro> getHerbivoros() {
        return herbivoros;
    }

    public void setHerbivoros(List<Herbivoro> herbivoros) {
        this.herbivoros = herbivoros;
    }

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

    public Long getDiaAtual() {
        return diaAtual;
    }

    public void setDiaAtual(Long diaAtual) {
        this.diaAtual = diaAtual;
    }

    public double getCarcacas() {
        return carcacas;
    }

    public void setCarcacas(double carcacas) {
        this.carcacas = carcacas;
    }
}
