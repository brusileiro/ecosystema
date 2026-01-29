package br.com.ecosystema.sistema;

import br.com.ecosystema.domain.Herbivoro;
import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SistemaHerbivoros implements Sistema {
    @Override
    public void executar(Mundo mundo, Parametros parametros, Random rng) {
        List<Herbivoro> herbivoros = mundo.getHerbivoros();
        if (herbivoros == null || herbivoros.isEmpty()) return;

        List<Herbivoro> nascimentos = new ArrayList<>();

        Iterator<Herbivoro> it = herbivoros.iterator();
        while (it.hasNext()) {
            Herbivoro h = it.next();

            h.setIdade(h.getIdade() + 1);

            boolean saciado = h.getEnergia() >= 0.8 * parametros.getEnergiaMaxima();
            boolean comeuHoje = false;

            if (!saciado) {
                double plantasDisponiveis = mundo.getBiomassaPlantas();
                double desejado = parametros.getConsumoPlantasPorHerbivoroDia();

                double fator = 0.8 + (rng.nextDouble() * 0.4);
                desejado *= fator;

                double consumido = Math.min(desejado, plantasDisponiveis);
                mundo.setBiomassaPlantas(plantasDisponiveis - consumido);

                double ganhoEnergia = consumido * parametros.getEficienciaEnergiaPorBiomassa();
                h.setEnergia(h.getEnergia() + ganhoEnergia);

                if (consumido > 0) {
                    comeuHoje = true;
                }
            }

            double custo = parametros.getCustoEnergiaDiarioHerbivoro();
            if (!comeuHoje) {
                custo *= parametros.getFatorCustoSemComer();
            }
            h.setEnergia(h.getEnergia() - custo);

            // Reprodução (herbívoros)
            if (h.getEnergia() >= parametros.getEnergiaMinimaReproducao()) {
                if (rng.nextDouble() < parametros.getChanceReproducaoHerbivo()) {

                    // paga custo
                    h.setEnergia(h.getEnergia() - parametros.getCustoEnergiaReproducao());

                    // nasce filhote
                    Herbivoro filhote = new Herbivoro(
                            parametros.getEnergiaInicialHerbivoro(),
                            0
                    );
                    nascimentos.add(filhote);
                }
            }

            if (h.getEnergia() > parametros.getEnergiaMaxima()) {
                h.setEnergia(parametros.getEnergiaMaxima());
            }


            boolean morreuPorEnergia = h.getEnergia() <= parametros.getEnergiaMinimaParaViver();
            boolean morreuPorIdade = h.getIdade() >= parametros.getIdadeMaximaHerbivoro();

            if (morreuPorEnergia || morreuPorIdade) {
                mundo.setCarcacas(mundo.getCarcacas() + 1.0);
                it.remove();
            }
        }

        herbivoros.addAll(nascimentos);



    }
}
