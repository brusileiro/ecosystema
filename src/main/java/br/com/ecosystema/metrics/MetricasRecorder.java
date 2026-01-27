package br.com.ecosystema.metrics;

import java.util.List;

public class MetricasRecorder {

    private final List<Metricas> historico;

    public MetricasRecorder(List<Metricas> historico) {
        this.historico = historico;
    }

    public void registrar(Metricas m) {
        historico.add(m);
    }

    public void imprimirUltima() {
        if (historico.isEmpty()) {
            return;
        }

        Metricas m = historico.get(historico.size() - 1);

        System.out.println(
                "Dia " + m.dia()
                        + " | Clima: " + String.format("%.2f", m.fatorClima())
                        + " | Plantas: " + String.format("%.2f", m.biomassaPlantas())
                        + " | Nutrientes: " + String.format("%.2f", m.nutrientesSolo())
                        + " | Herbivoros: " + String.format("%d", m.totalHerbivoros())
                        + " | Carnivoros: " + String.format("%d", m.totalCarnivoros())
        );
    }
}
