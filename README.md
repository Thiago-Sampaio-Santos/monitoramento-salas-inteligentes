# Monitoramento Inteligente de Sala – Refatoração com Padrões de Projeto

Este projeto simula o monitoramento de uma sala utilizando sensores de temperatura, presença e luminosidade. A aplicação evoluiu de uma arquitetura inicial, mais simples e acoplada, para uma estrutura modular, empregando padrões de projeto com foco em boas práticas de engenharia de software.  
Essa evolução reforça conceitos importantes de design e modularização, permitindo um sistema mais organizado, testável e fácil de manter.
---

## **Objetivos do Projeto**

O projeto tem como objetivos principais:

- Demonstrar, de forma prática, a evolução de uma arquitetura inicial com problemas de acoplamento para uma estrutura orientada a padrões de projeto.  
- Aplicar princípios **SOLID** e padrões **GOF** para melhorar a **manutenibilidade**, **extensibilidade** e **testabilidade** do sistema.  
- Simular um ambiente de monitoramento inteligente, com sensores autônomos e lógica de decisão integrada.

---

## Estrutura do Projeto

O projeto está dividido em duas versões, representando a evolução da solução:

### **Versão Inicial (`inicial`)**
A primeira versão do sistema foi desenvolvida sem utilização de padrões de projeto. Essa abordagem resultou em um alto acoplamento entre classes, responsabilidades concentradas em poucas partes do código e uma arquitetura difícil de escalar ou dar manutenção.  
Além disso, as responsabilidades estavam misturadas, o que dificultava a realização de testes unitários e a extensão do sistema para novas funcionalidades.

### **Versão Refatorada (`refatorado`)**
Na versão refatorada, foram aplicados diversos padrões de projeto, organizando o sistema de forma modular e reutilizável. Entre os padrões utilizados, destacam-se:

- **Factory** – Para criação flexível dos sensores.  
- **Decorator** – Para adicionar funcionalidades, como logging, sem modificar as classes originais.  
- **Facade** – Para simplificar a interface de interação com o sistema.  
- **Observer** – Para notificar módulos quando há alterações detectadas pelos sensores.  
- **Strategy** – Para permitir a definição de ações dinâmicas e configuráveis.  

Também foi criada uma interface chamada `Sensor`, que padroniza a forma de coleta de dados e facilita substituições e extensões futuras. A separação clara de responsabilidades e a modularização também são pontos fortes dessa versão.
---

## **Problemas da Versão Inicial**

A versão inicial do projeto foi propositalmente construída de forma simples, com o objetivo de evidenciar falhas comuns em sistemas sem boas práticas de desenvolvimento. Entre os principais problemas encontrados, podemos citar:

- A classe `Sala` concentrava múltiplas responsabilidades, violando o **princípio da responsabilidade única (SRP)**.  
- A criação de instâncias dos sensores estava diretamente acoplada, o que dificultava testes e substituições, caracterizando uma **violação do princípio da inversão de dependência (DIP)**.  
- A ausência de abstrações impossibilitava o uso de polimorfismo, reduzindo a flexibilidade e dificultando a evolução do sistema.  
- O método `monitorar()` misturava a lógica de coleta de dados, processamento e tomada de decisão, prejudicando a clareza do código e tornando a testabilidade mais difícil.  
- A classe `Relatorio` acessava diretamente atributos públicos de outras classes, quebrando o **encapsulamento** e expondo dados de forma inadequada.

---


## **Refatorações Aplicadas e Impacto**

Durante o processo de refatoração, diversas melhorias foram aplicadas para tornar o sistema mais robusto, organizado e flexível.

Primeiro, foi feita a **extração de métodos**, o que trouxe maior legibilidade ao código e facilitou a escrita de testes unitários. Essa prática também promoveu a reutilização de trechos de código em diferentes pontos do sistema.

Em seguida, criou-se a **interface `Sensor`**, que padroniza a forma de interação com os diferentes sensores, além de reduzir o acoplamento e permitir substituições futuras sem grandes alterações no núcleo do sistema.

A aplicação do **padrão Factory** foi importante para centralizar a criação dos sensores. Assim, a lógica de instanciamento ficou mais flexível e testável, evitando a necessidade de modificações diretas nas classes de controle quando novos tipos de sensores forem adicionados.

O uso do **padrão Decorator** possibilitou a adição de funcionalidades, como logging, sem alterar as classes originais. Isso promoveu uma maior extensão e modularidade.

A introdução do **padrão Facade** simplificou o uso do sistema, criando uma interface única e coesa que abstrai operações complexas. Essa abordagem facilita a interação com o sistema, especialmente para componentes externos.

A implementação do **padrão Observer** permitiu que diferentes partes do sistema reagissem automaticamente a eventos, como mudanças detectadas pelos sensores. Isso trouxe modularidade e maior desacoplamento entre os componentes.

Por fim, a adoção de **estratégias com o padrão Strategy** ajudou a encapsular comportamentos variáveis, tornando o sistema mais flexível, extensível e facilmente configurável para diferentes cenários de monitoramento.

---

## **Outras Melhorias Implementadas**

Além das refatorações principais, outras melhorias contribuíram para a evolução do projeto:

- Encapsulamento de atributos com métodos de acesso, protegendo o estado interno das classes e evitando acesso direto a variáveis.  
- Extração de métodos para modularizar a lógica, facilitando a manutenção e os testes unitários.  
- Substituição de código repetitivo por polimorfismo, utilizando a interface `Sensor` para tratar todos os tipos de sensores de forma uniforme.  
- Criação da classe `ColetorDadosSensor`, centralizando a coleta de dados e promovendo reutilização de código e separação de responsabilidades.

---

## Tecnologias Utilizadas

- **Java 17+**  
- **IDE:** VS Code
- **PlantUML:** para criação e visualização de diagramas UML  

---

## Diagrama UML

Os diagramas da arquitetura **antes** e **depois** estão disponíveis nas pastas do projeto:

- `diagrama-inicial.png` 
- `diagrama-refatorado.png` 

---

## Organização dos Pacotes

1. inicial/
- App.java
- Sala.java
- SensorTemperatura.java
- SensorPresenca.java
- SensorLuminosidade.java
- Relatorio.java
- ColetorDados.java

1. refatorado/
app/
  -  App.java

2. model/
 - Sensor.java
 - SensorTemperatura.java
 - SensorPresenca.java
 - SensorLuminosidade.java

3. decorator/
  - SensorDecorator.java
  - LoggingSensorDecorator.java

 4. facade/
  - MonitoringFacade.java
   
 5. factory/
   -SensorFactory.java

 6. observer/
  - SensorObserver.java
  - SensorSubject.java
  - ActionTrigger.java
   
 7. strategy/
 - ActionStrategy.java
 - LightOnStrategy.java
 - ReportStrategy.java
   
 8. report/
   - GeradorRelatorio.java

9. utils/
    - ColetorDadosSensor.java

---

## Como Executar

1. Compile os arquivos Java
2. Execute a classe `App` em `refatorado.app`
3. Observe os logs e o relatório gerado no console

---

## **Resultados Esperados**

Ao executar o sistema, espera-se observar os seguintes comportamentos:

- **Logs detalhados da coleta de dados** dos sensores de temperatura, presença e luminosidade.  
- **Decisões automáticas** sobre acender ou apagar a luz, baseadas na detecção de presença e no nível de luminosidade do ambiente.  
- **Geração de relatórios** com os valores coletados de cada sensor, permitindo análise do comportamento do sistema em tempo real.
