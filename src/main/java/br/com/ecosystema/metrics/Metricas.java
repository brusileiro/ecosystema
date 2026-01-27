package br.com.ecosystema.metrics;

public record Metricas(
        long dia,
        double fatorClima,
        double biomassaPlantas,
        double nutrientesSolo,
        int totalHerbivoros,
        int totalCarnivoros
) {}
