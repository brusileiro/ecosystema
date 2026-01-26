package br.com.ecosystema.sistema;

import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;
import java.util.Random;

public interface Sistema {

    void executar(Mundo mundo, Parametros parametros, Random rng);
}
