# 📄 Script SQL: Análise de Temperaturas em Marte

## 📌 Descrição

Este script SQL foi desenvolvido para realizar a segmentação e análise de dados meteorológicos do planeta Marte, utilizando uma tabela chamada `temperaturas_marte` como base de dados. Ele cria tabelas auxiliares que armazenam subconjuntos de dados específicos para facilitar análises estatísticas e sazonais.

## 🛠️ Funcionalidades

O script realiza as seguintes operações:

### 1. Criação de Tabelas Auxiliares

- **`MED_ACIMA_PRESSAO_ATM`**  
  Armazena registros onde a pressão atmosférica média é superior a 839.

- **`MAX_TEMP_HIST_Q1`, `MAX_TEMP_HIST_Q2`, `MAX_TEMP_HIST_Q3`, `MAX_TEMP_HIST_Q4`**  
  Armazenam a temperatura máxima (`MAX_TEMP`) de cada trimestre do ano:
  - **Q1**: Janeiro a Março
  - **Q2**: Abril a Junho
  - **Q3**: Julho a Setembro
  - **Q4**: Outubro a Dezembro

### 2. Inserção de Dados

Os dados são filtrados da tabela `temperaturas_marte` e inseridos nas respectivas tabelas com base em:
- Condições de pressão atmosférica.
- Intervalos de meses que definem os trimestres.

### 3. Consulta Consolidada

O script finaliza com uma `SELECT` unificada (`UNION ALL`) que retorna a contagem de registros em cada uma das tabelas auxiliares criadas, permitindo uma visão geral rápida da distribuição dos dados.

## 📊 Exemplos de uso

Este script pode ser útil para:
- Estudos climáticos de Marte
- Análise sazonal da temperatura máxima
- Filtragem de dados por condições atmosféricas específicas
- Criação de visualizações com ferramentas de BI como Power BI ou Excel

## 🔍 Pré-requisitos

- Banco de dados Oracle ou outro que suporte a função `EXTRACT(MONTH FROM data)`.
- Tabela principal chamada `temperaturas_marte` com pelo menos as colunas:
  - `id` (identificador único)
  - `data_terra` (data da medição)
  - `pressao_atm` (pressão atmosférica)
  - `max_temp` (temperatura máxima)
