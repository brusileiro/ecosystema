package br.com.ecosystema.app;

import br.com.ecosystema.domain.Carnivoro;
import br.com.ecosystema.domain.Herbivoro;
import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;
import br.com.ecosystema.metrics.Metricas;
import br.com.ecosystema.metrics.MetricasRecorder;
import br.com.ecosystema.sistema.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulacao {
    public static void main(String[] args) {

        Sistema plantas = new SistemaPlantas();
        Sistema clima = new SistemaClima();
        Sistema herbivoros = new SistemaHerbivoros();
        Sistema carnivoros = new SistemaCarnivoros();
        Sistema decomposicao = new SistemaDecomposicao();
        Mundo mundo = new Mundo();
        Parametros parametros = new Parametros();
        Random rng = new Random(42);
        List<Sistema> sistemas = new ArrayList<>();
        List<Metricas> listaMetricas = new ArrayList<>();

        MetricasRecorder recorder = new MetricasRecorder(listaMetricas);
        int dias = 200;

        sistemas.add(clima);
        sistemas.add(plantas);
        sistemas.add(herbivoros);
        sistemas.add(carnivoros);
        sistemas.add(decomposicao);

        mundo.setBiomassaPlantas(5000);
        mundo.setNutrientesSolo(500.0);

        parametros.setTaxaBaseCrescimentoPlantas(10);
        parametros.setKLimitadorNutrientes(20);
        parametros.setCustoNutrientePorPlanta(1);

        parametros.setConsumoPlantasPorHerbivoroDia(1);
        parametros.setEficienciaEnergiaPorBiomassa(2);
        parametros.setCustoEnergiaDiario(0.5);
        parametros.setEnergiaInicialHerbivoro(5);
        parametros.setEnergiaMinimaParaViverHerbivoro(0);
        parametros.setIdadeMaximaHerbivoro(10000);
        parametros.setChanceReproducaoHerbivo(0.15);

        parametros.setEnergiaMinimaReproducao(12);
        parametros.setCustoEnergiaReproducao(6);

        parametros.setTaxaDecomposicaoCarcacas(0.2);
        parametros.setNutrientesPorCacaca(5);

        int quantidadeInicialHerbivoros = 100;
        for (int i = 0; i < quantidadeInicialHerbivoros; i++) {
            Herbivoro h = new Herbivoro(
                    parametros.getEnergiaInicialHerbivoro(),0
            );

            mundo.getHerbivoros().add(h);
        }

        parametros.setTentativasCacaPorCarnivoroDia(3);
        parametros.setChanceSucessoCaca(0.1);
        parametros.setGanhoEnergiaPorHerbivoro(6.0);
        parametros.setCustoEnergiaDiarioCarnivoro(1);
        parametros.setEnergiaInicialCarnivoro(4);
        parametros.setIdadeMaximaCarnivoro(10000);
        parametros.setChanceReproducaoCarnivoro(0.03);

        int quantidadeInicialCarnivoros = 2;
        for (int i = 0; i < quantidadeInicialCarnivoros; i++) {
            Carnivoro c = new Carnivoro(
                    parametros.getEnergiaInicialHerbivoro(),0
            );

            mundo.getCarnivoros().add(c);
        }


        CicloDiario ciclo = new CicloDiario(sistemas, mundo, parametros, rng);


        for (int i = 0; i < dias; i++) {
            ciclo.executarDia();

            Metricas m = new Metricas(
                    mundo.getDiaAtual(),
                    mundo.getFatorClimaDia(),
                    mundo.getBiomassaPlantas(),
                    mundo.getNutrientesSolo(),
                    mundo.getHerbivoros().size(),
                    mundo.getCarnivoros().size(),
                    mundo.getCarcacas()
            );



            recorder.registrar(m);
            recorder.imprimirUltima();
        }

    }
}
