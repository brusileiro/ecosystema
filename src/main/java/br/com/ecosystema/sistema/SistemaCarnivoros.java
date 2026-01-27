package br.com.ecosystema.sistema;

import br.com.ecosystema.domain.Carnivoro;
import br.com.ecosystema.domain.Herbivoro;
import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class SistemaCarnivoros implements Sistema {

    @Override
    public void executar(Mundo mundo, Parametros parametros, Random rng) {
        List<Carnivoro> carnivoros = mundo.getCarnivoros();
        List<Herbivoro> herbivoros = mundo.getHerbivoros();
        List<Carnivoro> nascimentos = new ArrayList<>();

        if (carnivoros == null || carnivoros.isEmpty()) return;

        Iterator<Carnivoro> it = carnivoros.iterator();
        while (it.hasNext()) {
            Carnivoro c = it.next();

            // 1) envelhece
            c.setIdade(c.getIdade() + 1);

            // 2) caça herbívoros
            int tentativas = parametros.getTentativasCacaPorCarnivoroDia();

            for (int i = 0; i < tentativas; i++) {
                if (herbivoros.isEmpty()) break;

                if (rng.nextDouble() < parametros.getChanceSucessoCaca()) {
                    // remove um herbívoro aleatório (presa)
                    int idx = rng.nextInt(herbivoros.size());
                    herbivoros.remove(idx);

                    // ganha energia pela caça
                    c.setEnergia(
                            c.getEnergia() + parametros.getGanhoEnergiaPorHerbivoro()
                    );

                    // uma caça bem-sucedida já basta no dia
                    break;
                }
            }

            // 3) custo energético diário
            c.setEnergia(
                    c.getEnergia() - parametros.getCustoEnergiaDiarioCarnivoro()
            );

            // Reprodução (herbívoros)
            if (c.getEnergia() >= parametros.getEnergiaMinimaReproducao()) {
                if (rng.nextDouble() < parametros.getChanceReproducaoCarnivoro()) {

                    // paga custo
                    c.setEnergia(c.getEnergia() - parametros.getCustoEnergiaReproducao());

                    // nasce filhote
                    Carnivoro filhote = new Carnivoro(
                            parametros.getEnergiaInicialHerbivoro(),
                            0
                    );
                    nascimentos.add(filhote);
                }
            }

            // 4) morte
            boolean morreuPorEnergia =
                    c.getEnergia() <= parametros.getEnergiaMinimaParaViver();

            boolean morreuPorIdade =
                    c.getIdade() >= parametros.getIdadeMaximaCarnivoro();

            if (morreuPorEnergia || morreuPorIdade) {
                mundo.setCarcacas(mundo.getCarcacas() + 1.0);
                it.remove();
            }
        }

        carnivoros.addAll(nascimentos);
    }
}
