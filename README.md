# APS_2021_1
# Tema 8 : Strategy 

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

# Tema 13 : Adapter

É um padrão, também conhecido como wrapper, que permite que dois componentes com APIs incompatíveis trabalhem juntos, introduzindo um adaptador que mapeia de um componente para o outro. As adaptações podem ser: interface-interface, interface-implementação e implementação-implementação.

O principal benefício desse padrão é integração de componentes para os quais não se pode modificar o código-fonte em seu aplicativo (É um principal problema ao trabalhar com código de terceiros).

O Padrão Adapter é utilizado quando temos uma classe existente cuja interface não é adequada para as suas necessidades. Além disso, o adaptador consegue mudar a interface de um fornecedor para uma interface que o cliente espera encontrar. O Adapter é um padrão que utiliza boas praticas de orientação a objetos e a sua implementação fica mais complexa de acordo com a complexidade da interface do fornecedor.

Cada adaptador de classes e de objetos tem diferentes soluções de compromisso.

Terminologia usada pelo UML :

* Target (Alvo): define a interface do domínio específico que o cliente utiliza.
* Adapter (Adaptador): adapta a interface Adaptee para a interface da classe Target.
* Adaptee (Adaptada): define uma interface existente que necessita ser adaptada.
* Client (Cliente): colabora com os objetos em conformidade com a interface Target.

Um adaptador de classe:

1. Adapta a classe Adaptee a Target através do uso efetivo de uma classe Adapter concreta. Em consequência disso, um adaptador de classe não funcionará quando quisermos adaptar uma classe e todas as suas subclasses;
2. Permite que a classe Adapter substitua algum comportamento da classe Adaptee, uma vez que Adapter é uma subclasse de Adaptee;
3. Introduz somente um objeto, e não é necessário endereçamento indireto adicional por ponteiros para chegar até a classe Adaptee.

Um adaptador de objeto:

1. Permite a um único Adapter trabalhar com muitos Adaptees, ou seja, o Adaptee em si e todas as suas subclasses (caso existam);
2. Torna mais difícil redefinir um comportamento de uma classe Adaptee. Ele exigirá a criação de subclasses de Adaptee e fará com que a classe Adapter referencie a subclasse, ao invés da classe Adaptee em si.

A aplicabilidade do adapter pode ser listada :

* se deseja utilizar uma classe existente, porém sua interface não corresponde à interface que se necessita;
* o desenvolvedor quiser criar classes reutilizáveis que cooperem com classes não-relacionadas ou não-previstas, ou seja, classes que não possuem necessariamente interfaces compatíveis;
* (exclusivamente para adaptadores de objetos) é necessário utilizar muitas subclasses existentes, porém, impossível de adaptar essas interfaces criando subclasses para cada uma. Um adaptador de objeto pode adaptar a interface de sua classe mãe. 

Fontes :

https://medium.com/@aainajain/adapter-wrapper-design-pattern-6fbd86a63656

https://pt.wikipedia.org/wiki/Adapter

https://www.devmedia.com.br/padrao-de-projeto-adapter-em-java/26467
