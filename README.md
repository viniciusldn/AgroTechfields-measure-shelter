# Boas vindas ao Projeto Measure Shelter desenvolvido por Agro Techfields!

O projeto Measure Shelter foi desenvolvivo para atender a demanda de uma cooperativa de plantação de soja, que decidiu automatizar parte do seu processo de cultivo para trazer mais qualidade aos grãos. 

O escopo do projeto consiste no desenvolvimento do Back-end, que vai manter informações da lavoura para futuramente aplicar uma inteligência e automatizar todo o processo de plantação.

## Funcionalidades da aplicação

Esse sistema será uma API REST que receberá as medidas coletadas pelas ilhas e as armazena em um banco de dados `MongoDB`. A cada 20 dias, um satélite coleta imagens da plantação e as envia para a aplicação que, por sua vez, armazena o material no banco de dados.
Aplicou-se `Java` no desenvolvimento do projeto e modelagem do sistema, sendo transformado em container ao final, com a utilização de `Docker`.

### Tecnologias utilizadas

Aplicação desenvolvida com `MongoDB`, `Java`, `Docker`, `Quarkus` criando rotas para cada necessidade;.

### Acesso ao Deploy do projeto

Para esta aplicação, foi realizado o deploy utilizando a plataforma Heroku.
A aplicação esta disponível no link abaixo.
XXXXXXXXXXXXXXXXX

### Ilustração da aplicação em funcionamento

<img alt="Gif funcionamento da aplicação" width=400px src="" />

# Instruções caso deseje utilizar o projeto localmente
1. Clone o repositório, com o comando:
- `git clone git@github.com:viniciusldn/AgroTechfields-measure-shelter.git`.

2. Entre na pasta do repositório que você acabou de clonar:
- `cd welckson-valentim-portifolio`

3. Instale as dependências e inicialize o projeto:
- `mvn install`

4. Inicialize o projeto:
- 