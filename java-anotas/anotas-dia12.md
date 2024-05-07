# Wildcards
podemos usar o wildcard (coringa hehehehe) para não permitir a inserção de qualquer tipo de uma classe em uma outra.

> basta usar o ?

`public void boxTest(Box<?> n)`


pode-se restringir superiormente o tipo do wildcard com extends, provavelmente é a impl ideal

`public void boxTest(Box<? extends Carlos> n)`

restrição inferior, quer dizer que a classe recebida deve ser pai de uma outra classe

`public void boxTest(Box<? super Carlos> n)`

## VAI CAIR NA PROVA
? não identifica o tipo que será enviado, portanto não pode ser reusado dentro de um método, ou seja, não será posível adicionar a uma possível lista qualquer objeto do tipo desconhecido


## Usando Wildcard ou Generics< T >
- Usar coringa apenas para flexibilizar parametros completamente sem relação
- Usar < T > quando há uma relação entre os parâmetros


## Apagamento de Tipos (Erasure)

o erasure funciona como um casting durante a passagem de parâmetros, substituindo os tipos genéricos por tipos concretos


`Restrições:`

- não é possível passar generics com tipos primitivos

- não é possível criar instâncias de valores genéricos 

- não é possível criar campos estáticos de tipos genéricos

- não é possível criar vetores com tipos genéricos

- não é possível criar objetos de exceção com gererics

---

# Collections
é um objeto que agrupa de diferentes formas vários elementos

JAVA oferece:
- interfaces com definições das colections
- implementações 
- algoritmos em métodos prontos

### Tipos de collections principais
- Set: não permite repetir termos e representa conjuntos Matemática
- SortedSet: set mas sorted
- List: Coleção ordenada de elementos
- Queue: fila FiFo (funções -> add, offer, remove, pool)
- Deque: fila mas com inserção e remoção no começo e no fim
- Map: função matemática basicamente
- SortedMap: sortido 😂 

> Existem diversas classes concretas que implementam essas interfaces

### Collections.methods()
- sort: usa mergeSort = O(nLogn)
- shuffle: embaralha
- reverse, fill, copy, swap(elements), addAll 
- binarySearch(list, key): O(logn)

> por prática, deve-se utilizar a interface que se implementa o TAD para referenciar o tipo

---
## Iterator
Métodos genéricos para acesso 

- hasNext() -- while(tem)
> for(Iterator<t> it = list.iterator(); it.hasNext(); ) -- it.next()

