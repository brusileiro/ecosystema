# EcoSystema

EcoSystema é um **simulador de ecossistemas** desenvolvido em Java, baseado em **tempo discreto (dias)** e em **fluxos de massa e energia**. O projeto não possui interface gráfica: o foco é a **modelagem**, a **dinâmica emergente** e a **observabilidade** dos sistemas ecológicos ao longo do tempo.

O simulador foi pensado como um **projeto de estudo**, mas evoluiu para um modelo relativamente robusto, capaz de apresentar ciclos populacionais, colapsos, recuperação e regimes estáveis dependendo dos parâmetros utilizados.

---

## Visão geral do modelo

* ⏱ **1 tick = 1 dia**
* 🌍 Mundo mutável (estado global compartilhado)
* 🔁 Ordem fixa de execução dos sistemas
* 🎲 Aleatoriedade controlada por `Random` com *seed*
* 📊 Observação via console e exportação para CSV

O sistema é **determinístico** para uma mesma seed: os mesmos parâmetros sempre produzem os mesmos resultados.

---

## Cadeia trófica modelada

O EcoSystema modela uma cadeia trófica simples, porém funcional:

* 🌱 **Plantas** — crescem consumindo nutrientes do solo
* 🐛 **Herbívoros** — consomem plantas
* 🦊 **Carnívoros** — predam herbívoros
* ☠️ **Carcaças** — resultado de mortes
* 🍂 **Decomposição** — carcaças retornam nutrientes ao solo

Esse ciclo fecha o fluxo de matéria dentro do sistema.

---

## Arquitetura

### Packages principais

```
app        -> inicialização e loop da simulação
systema   -> regras de comportamento (sistemas)
domain    -> entidades e estado do mundo
metrics   -> coleta, impressão e exportação de métricas
```

### Conceito central: Sistemas

Cada aspecto do ecossistema é implementado como um **Sistema**, que atua uma vez por dia:

```java
public interface Sistema {
    void executar(Mundo mundo, Parametros parametros, Random rng);
}
```

Os sistemas são executados sempre na mesma ordem.

---

## Sistemas implementados

### SistemaClima

* Gera um fator climático diário
* Intervalo típico: `[0.5, 1.5]`
* Atua como modulador (não como força dominante)

### SistemaPlantas

* Crescimento baseado em:

    * taxa base
    * fator climático
    * limitador por nutrientes (curva de saturação)
* Plantas **estagnam** quando os nutrientes zeram
* Nutrientes nunca ficam negativos

### SistemaHerbivoros

* Consumo de plantas
* Ganho e gasto energético diário
* Limite máximo de energia (cap)
* Regra de saciedade (≥ 80% do máximo → não come no dia)
* Reprodução probabilística
* Morte por energia ou idade

### SistemaCarnivoros

* Predação probabilística de herbívoros
* Energia, saciedade e limite máximo
* Reprodução condicionada à disponibilidade de presas
* Morte por energia ou idade

### SistemaDecomposicao

* Converte carcaças em nutrientes do solo
* Processo gradual (taxa de decomposição)

---

## Energia e resiliência

Um dos pontos centrais do modelo é a **dinâmica energética**:

* Cada animal possui energia individual
* Existe um **limite máximo de energia**
* Animais saciados reduzem consumo
* Se não se alimentarem no dia:

    * o custo metabólico é reduzido (metabolismo adaptativo)

Essa regra simples introduz **resiliência à escassez**, evitando extinções totais rápidas e produzindo ciclos populacionais mais realistas.

---

## Métricas e observabilidade

A cada dia, o sistema gera um *snapshot* imutável (`record Metricas`) contendo:

* dia
* fator climático
* biomassa de plantas
* nutrientes do solo
* população de herbívoros
* população de carnívoros
* quantidade de carcaças

### Saída disponível

* Impressão no console (linha por dia)
* Exportação automática para CSV

O CSV permite análise visual em Excel, Google Sheets ou ferramentas de ciência de dados.

---

## Exemplo de comportamento emergente

Dependendo dos parâmetros iniciais, o sistema pode apresentar:

* Explosões populacionais (*boom*)
* Colapsos sincronizados (*bust*)
* Recuperação lenta via decomposição
* Regimes quase estáveis
* Extinção de níveis tróficos superiores

Pequenas alterações em regras energéticas produzem **grandes mudanças qualitativas**, o que é um dos objetivos centrais do projeto.

---

## Como executar

1. Clone o repositório
2. Compile o projeto (Java 21+)
3. Execute a classe `Simulacao`

Ao final da execução, um arquivo `metricas.csv` será gerado com os dados da simulação.

---

## Objetivos do projeto

* Estudar **modelagem de sistemas complexos**
* Explorar **comportamento emergente**
* Praticar **arquitetura limpa e desacoplada em Java**
* Servir como projeto de portfólio

---

## Próximos passos possíveis

* Balanceamento fino de parâmetros
* Exportação de gráficos automática
* Influência climática na decomposição
* Persistência de estado

---

## Licença

Projeto de estudo, sem fins comerciais.

---

**EcoSystema** — um ecossistema simples o suficiente para entender, complexo o suficiente para surpreender.
