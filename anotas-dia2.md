# POO
# Instância 
Um objeto criado a partir de uma classe existente

# encapsulamento 
o objeto não deve depender das implementações dos códigos, apenas das interfaces
Ou seja, esconde informaçoes da impl.

Proteger os métodos é encapsular:
tipos:
-public --> qualquer outro objeto pode acessar ele diretamente. 

-private --> pode apenas ser acessado por métodos da mesma classe. 

-protected --> só podem ser acessados por objetos de mesma hierarquia ou pacote (herança)

## getter/setter
métodos publicos criados para acessar atributos de uma classe

### assinatura
declarar a função numa interface segregando sua implementação de sua interface.

# herança
sub-classes são criadas contendo métodos e atributos de uma super-classe, evitando reescrita de código ou overlap de informações.

# mensagens
objetos se comunicam através de requisições (request) e respostas (response)
seletor e parametros

# interface
"end points", ou seja, define os métodos que podem ser acessados, mantendo apenas a assinatura.
protocolos.
API :thumbsup:

# polimorfismo
herança permite que propriedades particulares da subclasse podem ser alterados
um método pode agir diferentemente em cada objeto, mesmo com assinatura idêntica.
criar implementações diferentes mesmo com métodos herdados e já implementados em uma hierarquia maior.
