# Atividade de padrão de projeto Composite

Seguindo o exemplo do livro Padrões de Projetos demonstre o funcionamento do composite para exemplificar o seu funcionamento com uma loja de produtos de informática: mouse, teclado, monitor, impressora, cpu, fonte, processador, memória RAM, HD e SSD.

## O que é o padrão de projeto Composite?

O padrão de projeto Composite permite que você represente estruturas hierárquicas de objetos compostos e folhas. Um objeto composto pode conter outros objetos, que podem ser compostos ou folhas.

## Exemplo

Este exemplo implementa o padrão de projeto Composite usando uma interface chamada `Component`. A interface `Component` define o método `operation()`, que pode ser usado para executar uma operação em todos os objetos no componente.

A classe `Leaf` implementa a interface `Component` e representa um objeto folha. A classe `Composite` implementa a interface `Component` e representa um objeto composto.

O código principal cria um objeto `Composite` chamado `computador`. O objeto `computador` contém quatro objetos `Leaf`, um objeto `Composite` chamado `cpu` e outro objeto `Composite` chamado `memória`.

O método `main()` chama o método `operation()` no objeto `computador`. Isso chama o método `operation()` em todos os objetos no objeto `computador`.

## Saída

A saída do código é a seguinte:
Operação do componente Componente composto CPU
Operação do componente Processador
Operação do componente Memória RAM
Operação do componente Componente composto memória
Operação do componente Memória RAM 2
Operação do componente Mouse
Operação do componente Teclado
Operação do componente Monitor

## Melhorias

Este exemplo pode ser melhorado de várias maneiras, por exemplo:

* Adicionando mais testes
* Melhorando a documentação
* Usando uma estrutura de dados mais eficiente para representar a hierarquia de objetos
