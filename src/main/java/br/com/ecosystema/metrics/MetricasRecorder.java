package br.com.ecosystema.metrics;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
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
        if (historico.isEmpty()) return;

        Metricas m = historico.get(historico.size() - 1);

        System.out.println(
                "Dia " + m.dia()
                        + " | Clima: " + String.format("%.2f", m.fatorClima())
                        + " | Plantas: " + String.format("%.2f", m.biomassaPlantas())
                        + " | Nutrientes: " + String.format("%.2f", m.nutrientesSolo())
                        + " | Herbivoros: " + String.format("%d", m.totalHerbivoros())
                        + " | Carnivoros: " + String.format("%d", m.totalCarnivoros())
                        + " | Carcaças: " + String.format("%.2f", m.carcacas())

        );
    }

    public void exportarCsv(Path arquivo) {
        try (BufferedWriter w = Files.newBufferedWriter(arquivo, StandardCharsets.UTF_8)) {
            // Cabeçalho
            w.write("dia;fatorClima;biomassaPlantas;nutrientesSolo;totalHerbivoros;totalCarnivoros;carcacas");
            w.newLine();

            // Linhas
            for (Metricas m : historico) {
                w.write(String.format(
                        "%d;%.2f;%.2f;%.2f;%d;%d;%.2f",
                        m.dia(),
                        m.fatorClima(),
                        m.biomassaPlantas(),
                        m.nutrientesSolo(),
                        m.totalHerbivoros(),
                        m.totalCarnivoros(),
                        m.carcacas()
                ));
                w.newLine();

            }
        } catch (IOException e) {
            throw new RuntimeException("Falha ao exportar CSV para: " + arquivo.toAbsolutePath(), e);
        }
    }
}
