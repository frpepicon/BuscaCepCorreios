# BuscaCepCorreios
Base de Testes para o Site dos Correios

## Classe de Testes
[/src/test/java/tests/testBuscaCorreios.java](https://github.com/frpepicon/BuscaCepCorreios/blob/main/src/test/java/tests/testBuscaCorreios.java)

## Page Objects
[/src/test/java/pages/correiosMain.java](https://github.com/frpepicon/BuscaCepCorreios/blob/main/src/test/java/pages/correiosMain.java)

## Evidências
[/src/test/documentation/](https://github.com/frpepicon/BuscaCepCorreios/tree/main/src/test/documentation)

# User Histories

## User Story #1
Sendo um usuário do site dos Correios<br />
Quero buscar um CEP<br />
Para que eu possa confirmar o Logradouro

## User Story #2
Sendo um usuário do site dos Correios<br />
Quero buscar um Logradouro<br />
Para que eu possa confirmar o CEP

# Cenários

## 1# Busca com Dados Válidos
Dado que acesso a página dos correios<br />
Quando submeto uma informação válida no campo de buscar Endereço ou CEP<br />
Então sou redirecionado para outra página com os resultados, contendo, Logradouro/Nome, Bairro/Distrito, Localidade/UF e CEP

## 2# Busca com Dados Inválidos com 02 ou mais caracteres
Dado que acesso a página dos correios<br />
Quando submeto uma informação inválida com 02 ou mais carecteres no campo de buscar Endereço ou CEP<br />
Então sou redirecionado para outra página exibindo a mensagem "Não há dados a serem exibidos"

## 3# Busca com Poucos Caracteres
Dado que acesso a página dos correios<br />
Quando submeto uma informação com menos de 02 caracteres<br />
Então recebo um alerta para que eu digite ao menos 02 caracteres