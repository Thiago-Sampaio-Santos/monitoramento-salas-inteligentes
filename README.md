# Monitoramento Inteligente de Sala – Refatoração com Padrões de Projeto

Este projeto simula o monitoramento de uma sala utilizando sensores de temperatura, presença e luminosidade. A aplicação evolui de uma arquitetura inicial acoplada para uma estrutura modular, aplicando diversos padrões de projeto.

---

## Estrutura do Projeto

O projeto está dividido em duas versões:

### Versão Inicial (`inicial`)
- Sem uso de padrões
- Alto acoplamento entre classes
- Responsabilidades misturadas
- Código difícil de escalar e manter

### Versão Refatorada (`refatorado`)
- Aplicação de padrões GOF:
  - **Factory** – Criação de sensores
  - **Decorator** – Adição de funcionalidades como logging
  - **Facade** – Simplificação da interface de monitoramento
  - **Observer** – Notificação de ações com base em sensores
  - **Strategy** – Definição de ações dinâmicas
- Interface `Sensor` para padronizar coleta de dados
- Separação clara de responsabilidades

---

## Tecnologias Utilizadas

- Java 17+
- IDE: IntelliJ / Eclipse
- PlantUML (para diagramas UML)

---

## Diagrama UML

Os diagramas da arquitetura **antes** e **depois** estão disponíveis nas pastas:
- `diagrama-inicial.png` / `diagrama-inicial.pdf`
- `diagrama-refatorado.png` / `diagrama-refatorado.pdf`

---

## Organização dos Pacotes

inicial/
├── App.java
├── Sala.java
├── SensorTemperatura.java
├── SensorPresenca.java
├── SensorLuminosidade.java
├── Relatorio.java
└── ColetorDados.java

refatorado/
├── app/
│   └── App.java
├── model/
│   ├── Sensor.java
│   ├── SensorTemperatura.java
│   ├── SensorPresenca.java
│   └── SensorLuminosidade.java
├── decorator/
│   ├── SensorDecorator.java
│   └── LoggingSensorDecorator.java
├── facade/
│   └── MonitoringFacade.java
├── factory/
│   └── SensorFactory.java
├── observer/
│   ├── SensorObserver.java
│   ├── SensorSubject.java
│   └── ActionTrigger.java
├── strategy/
│   ├── ActionStrategy.java
│   ├── LightOnStrategy.java
│   └── ReportStrategy.java
├── report/
│   └── GeradorRelatorio.java
└── utils/
    └── ColetorDadosSensor.java

---

## Como Executar

1. Compile os arquivos Java
2. Execute a classe `App` em `refatorado.app`
3. Observe os logs e o relatório gerado no console

---

