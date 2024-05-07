# Generics
- servem como templates e permitem que tipos sejam parametros na definição de classes, interfaces e métodos
- evita o uso de casting explicito

um Tipo Generico é uma classe parametrizada sobre tipos

Parametro é incluido entre colchetes angulares <> logo após o nome da classe, assim sendo, o tipo T pode ser de qualquer tipo

ex:
`
public class Box<T> {
    private T t;
    public void set(T t) {this.t = t}
}
`
### Convenções
- E(Element)
- K(Key)
- T(Type)
- V(Value)
- N(Number)


## Construção
durante a construção de um objeto com parametro generico, deve-se colocar em sua criação o tipo escolhido
ex: 
`Box<Integer> integerBox = new Box<Integer>;`

`Box<Integer> = new Box<>();`

### Métodos
isso poder ser utilizado em métodos, apenas, estáticos e não estáticos, construtores..
--> deve aparecer antes do ipo do retorn 

`public static <K, V> boolean compare(Pair<K, V> p1, Pair<K, V> p2);`


### Restrições 
é possível restringir o que é recebido dentro de uma generico, por exemplo, alguma que implementa X ou extenda Y

 `<T extends x>`

pode, tambem, extender diversas classe diferentes

`<T extends x && y && z>`

