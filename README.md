# APS_2021_1
Tema 8 : Strategy 

O Strategy é um padrão de projeto comportamental que permite que você defina uma família de algoritmos, coloque-os em classes separadas, e faça os objetos deles intercambiáveis.
O padrão é aplicado em situações em que muitas classes se relacionam e diferem apenas no modo de atuação, com isso o Strategy irá configurar a classe que tenha um dentre muitos comportamentos fornecidos. Também pode ser usado quando há a necessidade da variação de um algoritmo, ou seja, pode-se implementar diferentes códigos que chegam no mesmo objetivo, mas que possuem em determinadas situações mais vantagens do que os demais.
Outra situação oportuna para o uso do padrão é em uma aplicação na qual se tem um cliente e este não pode ficar exposto a estrutura de dados do algoritmo. Além disso, quando uma classe tem muitos comportamentos e usam vários comandos condicionais, o desempenho do algoritmo poderá ficar insatisfatório, pois há a possibilidade de existir uma quantidade grande de condições, podendo deixar o código mais lento. Com o padrão pode-se retirar as condições, criando novas classes com estas estratégias, portanto melhorando desempenho. 

Possui os seguintes pontos negativos : 

1. O numero de classes pode aumentar consideravelmente caso funcionalidades que não podem ser implementadas por classes de uma mesma família de classes Strategy.
2. Pode complicar o projeto ainda mais caso uma solução com herança seja mais simples de implementar e manter.
3. Muitas linguagens de programação modernas tem suporte do tipo funcional que permite que você implemente diferentes versões de um algoritmo dentro de um conjunto de funções anônimas. Então você poderia usar essas funções exatamente como se estivesse usando objetos estratégia, mas sem inchar seu código com classes e interfaces adicionais.

Possui os seguintes pontos positivos :

1. Permite uma leitura de projeto mais eficiente.
2. A possibilidade de mudança de comportamento em tempo de execução da maior dinamismo ao projeto, permitindo assim mais opções de funcionalidades.
3. Permite uma evolução de projeto mais eficiente, pois o foco é na composição, evitando que classes e subclasses clientes sejam alteradas caso novas funcionalidades sejam adicionadas ou atualizadas.
4. Princípio aberto/fechado. Novas estratégias podem ser introduzidas sem mudar o contexto.
5. A herança pode ser substituida por composição.
6. Detalhes da implementação de um algoritmo podem ser isolados.

Para o nosso codigo, decidimos que o melhor se encaixaria com essa padronização e com nosso projeto até agora trabalhado na cadeira seria a distribuição de preços.

fontes :

https://pt.wikipedia.org/wiki/Strategy

https://refactoring.guru/pt-br/design-patterns/strategy

https://refactoring.guru/pt-br/design-patterns/strategy/java/example

https://www.thiengo.com.br/padrao-de-projeto-strategy-estrategia
