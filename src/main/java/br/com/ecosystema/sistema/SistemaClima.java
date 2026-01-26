package br.com.ecosystema.sistema;

import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;

import java.util.Random;

public class SistemaClima implements Sistema {

    @Override
    public void executar(Mundo mundo, Parametros parametros, Random rng) {

        double fatorClima = 0.5 + rng.nextDouble();

        mundo.setFatorClimaDia(fatorClima);

    }
}


