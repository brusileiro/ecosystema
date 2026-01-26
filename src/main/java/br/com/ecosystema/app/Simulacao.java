package br.com.ecosystema.app;

import br.com.ecosystema.domain.Mundo;
import br.com.ecosystema.domain.Parametros;
import br.com.ecosystema.sistema.Sistema;
import br.com.ecosystema.sistema.SistemaClima;
import br.com.ecosystema.sistema.SistemaPlantas;

import java.util.Random;

public class Simulacao {
    public static void main(String[] args) {

        Sistema plantas = new SistemaPlantas();
        Sistema clima = new SistemaClima();
        Mundo mundo = new Mundo();
        Parametros parametros = new Parametros();
        Random rng = new Random(42);

        mundo.setBiomassaPlantas(100.0);
        mundo.setNutrientesSolo(50.0);

        parametros.setTaxaBaseCrescimentoPlantas(10);
        parametros.setKLimitadorNutrientes(20);
        parametros.setCustoNutrientePorPlanta(1);

        System.out.println("Valores iniciais:");
        System.out.println(mundo.getBiomassaPlantas());
        System.out.println(mundo.getNutrientesSolo());

        clima.executar(mundo, parametros, rng);
        System.out.println("Valores pós sisClima:");
        System.out.println(mundo.getBiomassaPlantas());
        System.out.println(mundo.getNutrientesSolo());
        System.out.println(mundo.getFatorClimaDia());

        plantas.executar(mundo, parametros, rng);
        System.out.println("Valores pós sisPlantas:");
        System.out.println(mundo.getBiomassaPlantas());
        System.out.println(mundo.getNutrientesSolo());

    }
}
