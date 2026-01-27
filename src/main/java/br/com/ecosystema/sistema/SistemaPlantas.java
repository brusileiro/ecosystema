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

        double taxaBase = parametros.getTaxaBaseCrescimentoPlantas();
        double k = parametros.getKLimitadorNutrientes();
        double custoPorPlanta = parametros.getCustoNutrientePorPlanta();

        if (nutrientes <= 0) {
            return;
        }

        double potencial = taxaBase * fatorClima;

        double limitador = nutrientes / (nutrientes + k);
        double crescimentoTeorico = potencial * limitador;

        double custoNutrientes = crescimentoTeorico * custoPorPlanta;

        double crescimentoReal = crescimentoTeorico;
        if (custoPorPlanta > 0 && custoNutrientes > nutrientes) {
            crescimentoReal = nutrientes / custoPorPlanta;
            custoNutrientes = nutrientes;
        }

        mundo.setBiomassaPlantas(plantas + crescimentoReal);
        mundo.setNutrientesSolo(nutrientes - custoNutrientes);
    }
}
