# UML - modelagem de sistema diagramas 
## lista de diagramas 
-> de classes 
-> de objetos
-> de componentes

-> de casos de uso
-> de sequencias

## representação dos atruibutos
-> visibilidade: +, -, # ..
-> tipo: int ..
-> valor inicial
-> propriedades: final, static ..

visibildane nome(tipo) : tipo {propriedades}

## relacionamento entre classes
herança (herda) (SETA)
implementação de uma interface (SETA TRACEJADA)
    public interface jkasdhkjgadjgkad {}

multiplicidade
* = n
1 = 1
0..* = 0 ou n 

### associação
relacionamento fraco, classes independentes (relacionadas com retas e sua abstração se da pela frase "usa um")
- ObjetaA usa ObjetoB quando chama um método publico de B;
- dependência 
- dep bidirecional x <-----> y

### agregação e composição
relacionamento tipo associação, mas que contém a abstração "tem um"
ex: uma árvore tem uma raiz

agregação x composição
- na composição, o 'todo' é dono da 'parte', a criação da 'parte' ocorre dentro do 'todo', sem metodos pra acessar as referencias das paginas. (LOSANGO PREENCHIDO)
ex: uma folha de uma arvore
- na agregação, a destruição do todo n implica na destruição da parte, ou seja, ela mantem as referencias dos objetos criados. Parte pode existir em vários todos. (LOSANGO VAZIO)
ex: x pode ter ou não ter y, assim como w pode ter ou não y, simultaneamente

