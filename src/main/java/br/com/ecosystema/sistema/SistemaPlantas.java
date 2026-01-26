package br.com.ecosystema.sistema;

import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;

import java.util.Random;

public class SistemaPlantas implements Sistema {
    @Override
    public void executar(Mundo mundo, Parametros parametros, Random rng) {
        double fatorClima = mundo.getFatorClimaDia();
        double nutrientes = mundo.getNutrientesSolo();
        double plantas = mundo.getBiomassaPlantas();

        double potencial = parametros.getTaxaBaseCrescimentoPlantas() * fatorClima;
        double limitador = nutrientes / (nutrientes + parametros.getKLimitadorNutrientes());
        double crescimentoTeorico = potencial * limitador;
        double custoNutrientes = crescimentoTeorico * parametros.getCustoNutrientePorPlanta();
        double crescimentoReal = crescimentoTeorico;

        if (custoNutrientes > nutrientes) {
            crescimentoReal = nutrientes / parametros.getCustoNutrientePorPlanta();
            custoNutrientes = nutrientes;
        }

        mundo.setBiomassaPlantas(plantas + crescimentoReal);
        mundo.setNutrientesSolo(nutrientes -= custoNutrientes);

    }
}
