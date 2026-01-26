package br.com.ecosystema.app;

import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;
import br.com.ecosystema.metrics.Metricas;
import br.com.ecosystema.metrics.MetricasRecorder;
import br.com.ecosystema.sistema.Sistema;
import br.com.ecosystema.sistema.SistemaClima;
import br.com.ecosystema.sistema.SistemaPlantas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Simulacao {
    public static void main(String[] args) {

        Sistema plantas = new SistemaPlantas();
        Sistema clima = new SistemaClima();
        Mundo mundo = new Mundo();
        Parametros parametros = new Parametros();
        Random rng = new Random(42);
        List<Sistema> sistemas = new ArrayList<>();
        List<Metricas> listaMetricas = new ArrayList<>();
        MetricasRecorder recorder = new MetricasRecorder(listaMetricas);
        int dias = 100;

        sistemas.add(clima);
        sistemas.add(plantas);

        mundo.setBiomassaPlantas(100.0);
        mundo.setNutrientesSolo(500.0);

        parametros.setTaxaBaseCrescimentoPlantas(10);
        parametros.setKLimitadorNutrientes(20);
        parametros.setCustoNutrientePorPlanta(1);

        CicloDiario ciclo = new CicloDiario(sistemas, mundo, parametros, rng);

        for (int i = 0; i < dias; i++) {
            ciclo.executarDia();

            Metricas m = new Metricas(
                    mundo.getDiaAtual(),
                    mundo.getFatorClimaDia(),
                    mundo.getBiomassaPlantas(),
                    mundo.getNutrientesSolo()
            );

            recorder.registrar(m);
            recorder.imprimirUltima();
        }

    }
}
