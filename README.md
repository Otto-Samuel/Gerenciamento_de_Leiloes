# Sistema de Leilão em Java

Este é um projeto de um sistema de leilão implementado em Java. Ele permite gerenciar itens leiloados, clientes e lances durante um leilão.

## Funcionalidades

- Adicionar e remover itens do edital de leilão.
- Permitir que os clientes participem do leilão e dêem lances em itens.
- Manter um registro dos lances dados em cada item durante o leilão.
- Passar para o próximo item em leilão.

## 💻 Estrutura do Projeto

O projeto é organizado em diferentes classes:

- `Cliente`: Representa um cliente que participa do leilão.
- `Item`: Representa um item individual a ser leiloado.
- `Edital`: Mantém uma lista de itens a serem leiloados.
- `Sessao`: Mantém um histórico dos lances dados durante a sessão de leilão.
- `Fila`: Implementação de uma fila usando uma estrutura de dados baseada em nós.

## Como Usar

1. Clone o repositório para sua máquina local.
2. Abra o projeto em sua IDE Java favorita.
3. Compile e execute a classe `Leilao` para iniciar o sistema.
4. Siga as instruções no console para interagir com o sistema.

## Exemplo de Uso

```java
// Exemplo de adição de item ao edital
Edital edital = new Edital();
Item item1 = new Item("Vaso Antigo");
edital.adicionarItem(item1);

// Exemplo de participação do cliente no leilão
Cliente cliente1 = new Cliente(1);
cliente1.darLance(item1, 100.0);

// Exemplo de passagem para o próximo item em leilão
edital.passarParaProximoItem();

```
###  Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir um pull request com melhorias ou correções de bugs.

### ⚖️ Licença
Este projeto está licenciado sob a **MIT License**.