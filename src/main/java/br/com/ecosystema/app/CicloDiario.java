package br.com.ecosystema.app;

import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;
import br.com.ecosystema.sistema.Sistema;

import java.util.List;
import java.util.Random;

public class CicloDiario {
    private List<Sistema> sistemas;
    private Mundo mundo;
    private Parametros parametros;
    private Random rng;

    public CicloDiario(List<Sistema> sistemas, Mundo mundo, Parametros parametros, Random rng) {
        this.sistemas = sistemas;
        this.mundo = mundo;
        this.parametros = parametros;
        this.rng = rng;
    }

    public void executarDia() {
        for (Sistema sis : sistemas) {
            sis.executar(mundo, parametros, rng);
        }
            mundo.setDiaAtual(mundo.getDiaAtual() + 1);
    }
}
