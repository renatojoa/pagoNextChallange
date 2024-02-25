# Desafio de TI - Qualidade

## Questões

### 1. Validação da Máquina de Cartão de Crédito
**O cliente adquiriu um novo modelo de máquina de cartão de crédito que aceita as bandeiras Visa, Master, Elo, Amex e Hiper, executando duas operações (débito e crédito) para cada bandeira. Quantos testes serão necessários para validação dessa máquina e qual técnica de teste será utilizada?**

### 2. Testes do Range de BINs da Visa
**A bandeira Visa disponibilizou um novo range de bin´s no mercado (232425 a 232460). Quais testes devem ser feitos desse range de bins para confirmar que está funcionando?***

*a) 230000,232425,232460*

*b) 0,232425,232460,240000* 

*c) 232425,232460*

*d) 232424,232425,232459,232460,232461* (Correto) :heavy_check_mark:

Justificativa:

a) Estes 3 bins fornecidos garantem uma boa qualidade do está abaixo do range fornecido (232425 a 232460), sendo assim nao cobre os creterios minimos para a garantia da funcionalidade.

b) 0, 232425, 232460, 240000 - Esses bins cobrem os requisitos, casos como limite inferior, um bin dentro do range e limite superior, além de um bin fora do range. Isso ajuda a garantir que a lógica de aceitação dos bins esteja correta porem e importante validar faixas dentre o limite.

c) 232425, 232460 - Esses bins testam especificamente os limites inferior e superior do range. porem nao garante a funcionalidade como descrita.

d) 232424, 232425, 232459, 232460, 232461 - Este conjunto inclui bins fornecem uma garantia da qualidade visto que validamos:
-  a negativa dos bins 232424 e  232461.
-  o positivo dos limites 232425 e 232460.
-  e validamos que o bin 232459 esta entre os limites tambem sao aceitos
  
---

### 3. Abordagem de Desenvolvimento Ágil
**Cite uma abordagem de desenvolvimento ágil e explique-a em suas palavras.**

Uma abordagem de desenvolvimento ágil é o Scrum, e o framework que mais tenho afinidade em projetos ageis em que consiste no trabalho é dividido em iterações chamadas sprints, que geralmente têm uma duração media de 2 semanas e tem sua atuacao em melhorias continua em periodos curtos (sprints) O Scrum é muito adaptativo, permitindo ajustes ao longo do tempo com base no feedback recebido durante as revisões e retrospectivas da sprint, o que agrega bastante na construcao de produtos e melhoria na performace do time e suas rotinas. alem tambem de promover um ambiente com extrema colaborativo e com alta transparência com os stakeholders


---

### 4. CI/CD
**O que é CI/CD?**

CI/CD é a sigla para Integração Contínua/Entrega Contínua. É uma prática  no desenvolvimento de software que visa automatizar e assim agilizar o todo o processo de de entrega do sotfware, teste e entrega de software, atuando em gerenciamento de deploys a resultados de testes. essa pratica garante uma estabilidade ainda maior para processos que tende-se a ocorrer falhas quando executado manual. 

---

### 5. TDD, BDD e ATDD
**O que é TDD, BDD e ATDD, e quando são aplicadas?**

*TDD:*

- TDD é uma abordagem de desenvolvimento de software em que os testes automatizados são escritos antes do código de implementação. depois quando necessario ajusta o código para fazer o teste adequarce ao codigo final. o TDD é frequentemente usado em times que visam primariamente a atuacao em testes automatizados visando a atuacao anteciapada da cobertuda de testes. 

*BDD:*

- BDD é uma prática de descrever o comportamento esperado do software em termos de cenários compreensíveis. Os cenários são escritos em linguagem simples e podem ser aplicados convertidos em testes automatizados. O BDD é aplicado para melhorar a comunicação entre produto e a equipes de desenvolvimento.

*ATDD:*

- ATDD é uma prática de desenvolvimento em que os testes de aceitação são escritos antes da implementação e geralmente escritos junto com todos os envolvidos no time de desenvolvimento. o ATDD é frequentemente aplicado quando é crucial ter uma compreensão clara dos critérios de aceitação.
---

### 6. Heurísticas de Testes
**Cite uma heurística de testes utilizada para testes de front-end e de back-end e explique-as.**

- Heurística: "Processamento de Transações"

  - Front-end: Verificar se a interface de usuário fornece feedback claro e instantâneo durante o processo de pagamento. Garantir que os usuários recebam confirmações visuais e fisicas adequadas, e que os erros ou falhas sejam comunicados de maneira compreensível.
  - Exemplo de Aplicação:
    - Testar o fluxo de pagamento, verificando se todos os elementos da interface (botões, campos, mensagens) estão funcionando corretamente.

  - Back-end: Validar se as transações são processadas corretamente no lado do servidor. Isso inclui verifricar se os dados da transação são registrados com precisão no banco de dados, se as lógicas de desconto, taxas e cálculos financeiros estão corretas ou se as transações são seguras e conformes com regulamentações.
  - Exemplo de Requisicao:
    - Simular falhas de pagamento para garantir que a aplicação lida adequadamente com erros, fornecendo mensagens claras aos usuários. e se os registros de transações no banco de dados refletem com precisão as transações realizadas pelos usuários.

---

### 7. Ferramentas de Testes Automatizados
**Cite ferramentas de testes automatizados para Desktop, Web, API´s e mobile.**

- **Desktop**:
Selenium

-  **Web**:
Selenium,
WebDriverIO

- **API's**:
Postman,
Rest Assured

- **Mobile**:
Appium

---

## Prática de API

### Desenvolvimento do Script de Automação

#### Documentação e URI
- Documentação: [ReqRes API](https://reqres.in/)
- URI Base: [https://reqres.in/api/](https://reqres.in/api/)

#### Objetivos
1. Validar o script de "CREATE" utilizando o método "POST” com cobertura de testes em Rest Assured da API.
2. Validar a cobertura de Status Code, Campos obrigatórios e Contrato.
3. Desenvolver com POJOs.

#### Observações
- Enviar o link do código no GitHub.
# Documentação de Execução de Teste


## Configurações Necessarias

Antes de executar os testes, certifique-se de ter as seguintes configurações:

- Java JDK instalado
- Maven instalado
- Git instalado
- Ambiente de Desenvolvimento configurado

### * Clonar o Repositório *

1. Clone o repositório para o seu ambiente local:

   ```bash
   git clone https://github.com/seu-usuario/seu-repositorio.git

### * Acessar a pasta do projeto *

2. Ainda no terminal acesse a pasta do projeto 

    ```bash
   cd pagoNextChallange

### * Executando o teste *
3. Rode o seguinte comando 

    ```bash
   mvn test

---

