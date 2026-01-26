package br.com.ecosystema.domain;

public class Parametros {
    double taxaBaseCrescimentoPlantas;
    double KLimitadorNutrientes;
    double custoNutrientePorPlanta;

    public double getTaxaBaseCrescimentoPlantas() {
        return taxaBaseCrescimentoPlantas;
    }

    public void setTaxaBaseCrescimentoPlantas(double taxaBaseCrescimentoPlantas) {
        this.taxaBaseCrescimentoPlantas = taxaBaseCrescimentoPlantas;
    }

    public double getKLimitadorNutrientes() {
        return KLimitadorNutrientes;
    }

    public void setKLimitadorNutrientes(double KLimitadorNutrientes) {
        this.KLimitadorNutrientes = KLimitadorNutrientes;
    }

    public double getCustoNutrientePorPlanta() {
        return custoNutrientePorPlanta;
    }

    public void setCustoNutrientePorPlanta(double custoNutrientePorPlanta) {
        this.custoNutrientePorPlanta = custoNutrientePorPlanta;
    }
}
