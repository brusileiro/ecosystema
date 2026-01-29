package br.com.ecosystema.domain;

public class Parametros {
    //Parametros Plantas
    double taxaBaseCrescimentoPlantas;
    double KLimitadorNutrientes;
    double custoNutrientePorPlanta;


    //Parametros animais
    double energiaMinimaParaViver;
    double energiaMinimaReproducao;
    double custoEnergiaReproducao;
    double energiaMaxima;
    double fatorCustoSemComer;

    //Parametros Herbivoros
    double consumoPlantasPorHerbivoroDia;
    double eficienciaEnergiaPorBiomassa;
    double custoEnergiaDiarioHerbivoro;
    double energiaInicialHerbivoro;
    int idadeMaximaHerbivoro;
    double chanceReproducaoHerbivo;

    //Parametros Carnivoros
    double custoEnergiaDiarioCarnivoro;
    double energiaInicialCarnivoro;
    int idadeMaximaCarnivoro;
    int tentativasCacaPorCarnivoroDia;
    double chanceSucessoCaca;
    double ganhoEnergiaPorHerbivoro;
    double chanceReproducaoCarnivoro;

    //Parametros decomposição
    double taxaDecomposicaoCarcacas;
    double nutrientesPorCacaca;

    //Setters

    public void setTaxaBaseCrescimentoPlantas(double taxaBaseCrescimentoPlantas) {
        this.taxaBaseCrescimentoPlantas = taxaBaseCrescimentoPlantas;
    }

    public void setKLimitadorNutrientes(double KLimitadorNutrientes) {
        this.KLimitadorNutrientes = KLimitadorNutrientes;
    }

    public void setCustoNutrientePorPlanta(double custoNutrientePorPlanta) {
        this.custoNutrientePorPlanta = custoNutrientePorPlanta;
    }

    public void setEnergiaMinimaParaViver(double energiaMinimaParaViver) {
        this.energiaMinimaParaViver = energiaMinimaParaViver;
    }

    public void setEnergiaMinimaReproducao(double energiaMinimaReproducao) {
        this.energiaMinimaReproducao = energiaMinimaReproducao;
    }

    public void setCustoEnergiaReproducao(double custoEnergiaReproducao) {
        this.custoEnergiaReproducao = custoEnergiaReproducao;
    }

    public void setEnergiaMaxima(double energiaMaxima) {
        this.energiaMaxima = energiaMaxima;
    }

    public void setConsumoPlantasPorHerbivoroDia(double consumoPlantasPorHerbivoroDia) {
        this.consumoPlantasPorHerbivoroDia = consumoPlantasPorHerbivoroDia;
    }

    public void setEficienciaEnergiaPorBiomassa(double eficienciaEnergiaPorBiomassa) {
        this.eficienciaEnergiaPorBiomassa = eficienciaEnergiaPorBiomassa;
    }

    public void setCustoEnergiaDiarioHerbivoro(double custoEnergiaDiarioHerbivoro) {
        this.custoEnergiaDiarioHerbivoro = custoEnergiaDiarioHerbivoro;
    }

    public void setEnergiaInicialHerbivoro(double energiaInicialHerbivoro) {
        this.energiaInicialHerbivoro = energiaInicialHerbivoro;
    }

    public void setIdadeMaximaHerbivoro(int idadeMaximaHerbivoro) {
        this.idadeMaximaHerbivoro = idadeMaximaHerbivoro;
    }

    public void setChanceReproducaoHerbivo(double chanceReproducaoHerbivo) {
        this.chanceReproducaoHerbivo = chanceReproducaoHerbivo;
    }

    public void setCustoEnergiaDiarioCarnivoro(double custoEnergiaDiarioCarnivoro) {
        this.custoEnergiaDiarioCarnivoro = custoEnergiaDiarioCarnivoro;
    }

    public void setEnergiaInicialCarnivoro(double energiaInicialCarnivoro) {
        this.energiaInicialCarnivoro = energiaInicialCarnivoro;
    }

    public void setIdadeMaximaCarnivoro(int idadeMaximaCarnivoro) {
        this.idadeMaximaCarnivoro = idadeMaximaCarnivoro;
    }

    public void setTentativasCacaPorCarnivoroDia(int tentativasCacaPorCarnivoroDia) {
        this.tentativasCacaPorCarnivoroDia = tentativasCacaPorCarnivoroDia;
    }

    public void setChanceSucessoCaca(double chanceSucessoCaca) {
        this.chanceSucessoCaca = chanceSucessoCaca;
    }

    public void setGanhoEnergiaPorHerbivoro(double ganhoEnergiaPorHerbivoro) {
        this.ganhoEnergiaPorHerbivoro = ganhoEnergiaPorHerbivoro;
    }

    public void setChanceReproducaoCarnivoro(double chanceReproducaoCarnivoro) {
        this.chanceReproducaoCarnivoro = chanceReproducaoCarnivoro;
    }

    public void setTaxaDecomposicaoCarcacas(double taxaDecomposicaoCarcacas) {
        this.taxaDecomposicaoCarcacas = taxaDecomposicaoCarcacas;
    }

    public void setNutrientesPorCacaca(double nutrientesPorCacaca) {
        this.nutrientesPorCacaca = nutrientesPorCacaca;
    }

    public void setFatorCustoSemComer(double fatorCustoSemComer) {
        this.fatorCustoSemComer = fatorCustoSemComer;
    }

    //Getters


    public double getTaxaBaseCrescimentoPlantas() {
        return taxaBaseCrescimentoPlantas;
    }

    public double getKLimitadorNutrientes() {
        return KLimitadorNutrientes;
    }

    public double getCustoNutrientePorPlanta() {
        return custoNutrientePorPlanta;
    }

    public double getEnergiaMinimaParaViver() {
        return energiaMinimaParaViver;
    }

    public double getEnergiaMinimaReproducao() {
        return energiaMinimaReproducao;
    }

    public double getCustoEnergiaReproducao() {
        return custoEnergiaReproducao;
    }

    public double getEnergiaMaxima() {
        return energiaMaxima;
    }

    public double getConsumoPlantasPorHerbivoroDia() {
        return consumoPlantasPorHerbivoroDia;
    }

    public double getEficienciaEnergiaPorBiomassa() {
        return eficienciaEnergiaPorBiomassa;
    }

    public double getCustoEnergiaDiarioHerbivoro() {
        return custoEnergiaDiarioHerbivoro;
    }

    public double getEnergiaInicialHerbivoro() {
        return energiaInicialHerbivoro;
    }

    public int getIdadeMaximaHerbivoro() {
        return idadeMaximaHerbivoro;
    }

    public double getChanceReproducaoHerbivo() {
        return chanceReproducaoHerbivo;
    }

    public double getCustoEnergiaDiarioCarnivoro() {
        return custoEnergiaDiarioCarnivoro;
    }

    public double getEnergiaInicialCarnivoro() {
        return energiaInicialCarnivoro;
    }

    public int getIdadeMaximaCarnivoro() {
        return idadeMaximaCarnivoro;
    }

    public int getTentativasCacaPorCarnivoroDia() {
        return tentativasCacaPorCarnivoroDia;
    }

    public double getChanceSucessoCaca() {
        return chanceSucessoCaca;
    }

    public double getGanhoEnergiaPorHerbivoro() {
        return ganhoEnergiaPorHerbivoro;
    }

    public double getChanceReproducaoCarnivoro() {
        return chanceReproducaoCarnivoro;
    }

    public double getTaxaDecomposicaoCarcacas() {
        return taxaDecomposicaoCarcacas;
    }

    public double getNutrientesPorCacaca() {
        return nutrientesPorCacaca;
    }

    public double getFatorCustoSemComer() {
        return fatorCustoSemComer;
    }
}
