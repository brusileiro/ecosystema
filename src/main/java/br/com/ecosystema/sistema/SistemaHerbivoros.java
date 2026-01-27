package br.com.ecosystema.sistema;

import br.com.ecosystema.domain.Herbivoro;
import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SistemaHerbivoros implements Sistema {
    @Override
    public void executar(Mundo mundo, Parametros parametros, Random rng) {
        List<Herbivoro> herbivoros = mundo.getHerbivoros();
        if (herbivoros == null || herbivoros.isEmpty()) return;

        Iterator<Herbivoro> it = herbivoros.iterator();
        while (it.hasNext()) {
            Herbivoro h = it.next();

            h.setIdade(h.getIdade() + 1);

            double plantasDisponiveis = mundo.getBiomassaPlantas();
            double desejado = parametros.getConsumoPlantasPorHerbivoroDia();

            double fator = 0.8 + (rng.nextDouble() * 0.4);
            desejado *= fator;

            double consumido = Math.min(desejado, plantasDisponiveis);
            mundo.setBiomassaPlantas(plantasDisponiveis - consumido);

            double ganhoEnergia = consumido * parametros.getEficienciaEnergiaPorBiomassa();
            h.setEnergia(h.getEnergia() + ganhoEnergia);

            h.setEnergia(h.getEnergia() - parametros.getCustoEnergiaDiario());

            boolean morreuPorEnergia = h.getEnergia() <= parametros.getEnergiaMinimaParaViverHerbivoro();
            boolean morreuPorIdade = h.getIdade() >= parametros.getIdadeMaximaHerbivoro();

            if (morreuPorEnergia || morreuPorIdade) {
                mundo.setCarcacas(mundo.getCarcacas() + 1.0);
                it.remove();
            }
        }


    }
}
