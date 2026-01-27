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

    public double getConsumoPlantasPorHerbivoroDia() {
        return consumoPlantasPorHerbivoroDia;
    }

    public void setConsumoPlantasPorHerbivoroDia(double consumoPlantasPorHerbivoroDia) {
        this.consumoPlantasPorHerbivoroDia = consumoPlantasPorHerbivoroDia;
    }

    public double getEnergiaMinimaParaViverHerbivoro() {
        return energiaMinimaParaViver;
    }

    public void setEnergiaMinimaParaViverHerbivoro(double energiaMinimaParaViverHerbivoro) {
        this.energiaMinimaParaViver = energiaMinimaParaViverHerbivoro;
    }

    public int getIdadeMaximaHerbivoro() {
        return idadeMaximaHerbivoro;
    }

    public void setIdadeMaximaHerbivoro(int idadeMaximaHerbivoro) {
        this.idadeMaximaHerbivoro = idadeMaximaHerbivoro;
    }

    public double getEnergiaInicialHerbivoro() {
        return energiaInicialHerbivoro;
    }

    public void setEnergiaInicialHerbivoro(double energiaInicialHerbivoro) {
        this.energiaInicialHerbivoro = energiaInicialHerbivoro;
    }

    public double getCustoEnergiaDiario() {
        return custoEnergiaDiarioHerbivoro;
    }

    public void setCustoEnergiaDiario(double custoEnergiaDiario) {
        this.custoEnergiaDiarioHerbivoro = custoEnergiaDiario;
    }

    public double getEficienciaEnergiaPorBiomassa() {
        return eficienciaEnergiaPorBiomassa;
    }

    public void setEficienciaEnergiaPorBiomassa(double eficienciaEnergiaPorBiomassa) {
        this.eficienciaEnergiaPorBiomassa = eficienciaEnergiaPorBiomassa;
    }

    public double getGanhoEnergiaPorHerbivoro() {
        return ganhoEnergiaPorHerbivoro;
    }

    public void setGanhoEnergiaPorHerbivoro(double ganhoEnergiaPorHerbivoro) {
        this.ganhoEnergiaPorHerbivoro = ganhoEnergiaPorHerbivoro;
    }

    public double getChanceSucessoCaca() {
        return chanceSucessoCaca;
    }

    public void setChanceSucessoCaca(double chanceSucessoCaca) {
        this.chanceSucessoCaca = chanceSucessoCaca;
    }

    public int getTentativasCacaPorCarnivoroDia() {
        return tentativasCacaPorCarnivoroDia;
    }

    public void setTentativasCacaPorCarnivoroDia(int tentativasCacaPorCarnivoroDia) {
        this.tentativasCacaPorCarnivoroDia = tentativasCacaPorCarnivoroDia;
    }

    public int getIdadeMaximaCarnivoro() {
        return idadeMaximaCarnivoro;
    }

    public void setIdadeMaximaCarnivoro(int idadeMaximaCarnivoro) {
        this.idadeMaximaCarnivoro = idadeMaximaCarnivoro;
    }

    public double getEnergiaInicialCarnivoro() {
        return energiaInicialCarnivoro;
    }

    public void setEnergiaInicialCarnivoro(double energiaInicialCarnivoro) {
        this.energiaInicialCarnivoro = energiaInicialCarnivoro;
    }

    public double getCustoEnergiaDiarioCarnivoro() {
        return custoEnergiaDiarioCarnivoro;
    }

    public void setCustoEnergiaDiarioCarnivoro(double custoEnergiaDiarioCarnivoro) {
        this.custoEnergiaDiarioCarnivoro = custoEnergiaDiarioCarnivoro;
    }

    public double getEnergiaMinimaParaViver() {
        return energiaMinimaParaViver;
    }

    public void setEnergiaMinimaParaViver(double energiaMinimaParaViver) {
        this.energiaMinimaParaViver = energiaMinimaParaViver;
    }

    public double getCustoEnergiaDiarioHerbivoro() {
        return custoEnergiaDiarioHerbivoro;
    }

    public void setCustoEnergiaDiarioHerbivoro(double custoEnergiaDiarioHerbivoro) {
        this.custoEnergiaDiarioHerbivoro = custoEnergiaDiarioHerbivoro;
    }

    public double getTaxaDecomposicaoCarcacas() {
        return taxaDecomposicaoCarcacas;
    }

    public void setTaxaDecomposicaoCarcacas(double taxaDecomposicaoCarcacas) {
        this.taxaDecomposicaoCarcacas = taxaDecomposicaoCarcacas;
    }

    public double getNutrientesPorCacaca() {
        return nutrientesPorCacaca;
    }

    public void setNutrientesPorCacaca(double nutrientesPorCacaca) {
        this.nutrientesPorCacaca = nutrientesPorCacaca;
    }

    public double getCustoEnergiaReproducao() {
        return custoEnergiaReproducao;
    }

    public void setCustoEnergiaReproducao(double custoEnergiaReproducao) {
        this.custoEnergiaReproducao = custoEnergiaReproducao;
    }

    public double getEnergiaMinimaReproducao() {
        return energiaMinimaReproducao;
    }

    public void setEnergiaMinimaReproducao(double energiaMinimaReproducao) {
        this.energiaMinimaReproducao = energiaMinimaReproducao;
    }

    public double getChanceReproducaoCarnivoro() {
        return chanceReproducaoCarnivoro;
    }

    public void setChanceReproducaoCarnivoro(double chanceReproducaoCarnivoro) {
        this.chanceReproducaoCarnivoro = chanceReproducaoCarnivoro;
    }

    public double getChanceReproducaoHerbivo() {
        return chanceReproducaoHerbivo;
    }

    public void setChanceReproducaoHerbivo(double chanceReproducaoHerbivo) {
        this.chanceReproducaoHerbivo = chanceReproducaoHerbivo;
    }
}
