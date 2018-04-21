# GRASP

GRASPs são padrões de projeto que tem como objetivo principal atribuir de forma adequada as responsabilidades.

### Creator

### Especialista

### Alta Coesão

### Baixo acoplamento

### Controladora ou Controller

### Polimorfismo

### Invenção Pura

### Indireção

### Variações Protegidas

# GoF

## GoFs Criacionais

### Factory Method

### Abstract Factory

### Builder

### Prototype

### Singleton

### Multiton

### Object Pool

## GoFs Estruturais

### Adapter

Permite que um objeto seja substituído por outro que, apesar de realizar a mesma
tarefa, possui uma interface diferente. Seu objetivo principal é modificar indiretamente
a interface do cliente sem causar muito impacto à sua utilização.

#### Vantagens

Não mexe diretamente com a interface, poupando o usuário de se adaptar a nova
interface de forma brusca.

#### Desvantagens

Ao utilizar vários adapters, o desempenho cai diretamente proporcional a quantidade
de adapters implementados.

### Bridge



### Composite

Agrupa objetos que fazem parte de uma relação parte-todo de forma a tratá-los sem
distinção.

### Decorator

### Facade

### Flyweight

### Proxy

## GoFs Comportamentais

### Command

Tem a função de controlar as chamadas de um determinado componente, modelando cada
requisição como um objeto, podendo permitir que as operações possam ser desfeitas
ou registradas.

### Iterator

Tem como função fornecer um modo eficiente para percorrer sequencialmente os elementos
de uma coleção, sem expor a estrutura interna da coleção.

### Mediator

Tem como função diminuir a quantidade de "ligações" entre objetos introduzindo um
mediador, o qual realizará toda a comunicação.

### Observer

Define um mecanismo eficiente para reagir às alterações realizadas em determinados
objetos.

### State

Altera o comportamento de um determinado objeto de acordo com o estado no qual ele
se encontra.

### Strategy

Permite, de maneira simples, a variação dos algoritmos utilizados na resolução de
um determinado problema.

Integra uma base de ao menos 3 participantes:

Strategy => interface para padronizar as diferentes estratégias de um algoritmo.
ConcreteStrategy => implementação particular de um Strategy.
Context => mantém uma referência para um objeto Strategy e pode permitir que esse
acesse seus dados.

#### Contexto

No contexto de realização de pagamentos, é necessário decidir de qual forma ele
será adequado, devendo haver diversas formas de pagamento.
Nesse contexto, existem alguns recursos que podem ajudar significativamente nessa
tafera, como o caso do carrinho de compras virtual.
Normalmente, esses recursos permitem que o usuário escolha alguma forma de pagamento
que se deseja realizar, afetando os passos para se concretizar o pagamento.

Nesse contexto, podemos identificar nossas classes como:

Strategy => Payment
ConcreteStrategyA => PaymentByCreditCard
ConcreteStrategyB => PaymentByPayPal
Context => ShoppingContext

PaymentByCreditCard - herda - Payment
PaymentByPayPal - herda - Payment
Payment - agrega - ShoppingContext

Nesse contexto de aplicação de padrão:

- Na classe de contexto, deve ser construido um método que dará acesso a lista
de itens no carrinho, assim como as operações básicas da inclusão na lista.
- Dentro da classe de contexto, é criado uma referência (objeto) do tipo pagamento.

### Template Method

Define a ordem na qual determinados passos devem ser realizados na resolução de
um problema e permitir que esses passos possam ser realizados de formas diferentes
de acordo com a situação.

Integra uma base de pelo menos 2 classes:

AbstractClass => define o template method, com a ordem de execução das operações.
As operações primárias permanecem como métodos abstratos, sendo concretizadas nas
ConcreteClasses, ou seja, especifica os métodos como um guia passo-a-passo para a
solução de um problema.

ConcreteClass => implementam os métodos abstratos - operações primárias que possuem
comportamentos dependentes do objeto específico - especificados na AbstractClass,
ou seja, define de forma mais detalhada os métodos especificados na AbstractClass.

#### Contexto

Caso seja necessário melhorar a manutenção e reusabilidade de código para o contexto
associado, pode-se user esse padrão de projeto.
Suponha que exista uma operação bem definidas para processamento de dados.
Apesar dessa operação ser a mesma, seu comportamento varia de acordo com a abordagem
utilizada. Por exemplo, processar dados a partir de uma base de dados difere de
processar dados a partir de um sistema de arquivos.

Nesse contexto de aplicação de padrão:

- As operações realizadas seriam abstratas, contidas na AbstractClass.
- Criação de um método que permite o acesso das operações abstratas.
- A classe concreta extende a classe abstrata, contendo todos as operações definidas
nela, juntamente com seu construtor incluso.

### Visitor

Permite atualizações específicas em uma coleção de objetos de acordo com o tipo
particular de cada objeto atualizado.

#### Contexto



### Memento

Permite armazenar o estado interno de um objeto em um determinado momento, para
que não seja possível retorná-lo a este estado, sem saber que isso cause problemas
com o encapsulamento. Uma classe é responsável por salvar o estado do objeto desejado
enquanto que outra classe fica responsável por armazenar todas essas cópias (mementos).

### Chain of Responsability

Evita a dependência entre um objeto receptor e um objeto solicitante. A base mantém
um ponteiro como "próximo". Cada classe derivada implementa a sua própria contribuição
para manusear o pedido (request).
