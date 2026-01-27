package br.com.ecosystema.sistema;

import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;

import java.util.Random;

public class SistemaDecomposicao implements Sistema {
    @Override
    public void executar(Mundo mundo, Parametros parametros, Random rng) {
        double carcacas = mundo.getCarcacas();
        if (carcacas <= 0) return;

        double decomposto = carcacas * parametros.getTaxaDecomposicaoCarcacas();

        mundo.setCarcacas(carcacas - decomposto);

        double nutrientesGerados = decomposto * parametros.getNutrientesPorCacaca();
        mundo.setNutrientesSolo(mundo.getNutrientesSolo() + nutrientesGerados);

    }
}
