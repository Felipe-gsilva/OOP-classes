# Conceitos e fundamentos de Java
Códigos ão criados em arquivos .java e compilados para bytecode em .class.
Os arquivos .class são direcionados para a JVM (Java Virtual Machine)

## portabilidade
a jvm é multiplataforma

## java como plataforma
Java tem 2 componentes, a JVM e Java Application Programming Interface (API)
A API é agrupada em pacotes.

# JAVA
## Variáveis e tipos primitivos

## Variáveis de classe
-static, garante que todas as instâncias tenham o mesmo valor de variável.
-final, garante que o valor não seja alterado (const em c ou let [sem mut] em rust).

### variáveis locais
existe dentro de um método especifico
-não precisa de modificador, é assim por padrão

### main
public static void main(String[] args)
{
}

## padrões para as variáveis
nomes:
    -começar com letra
    -evitar $
    -sem abreviações
    -CAMEL CASE
    -no caso de constantes, snake case com caixa alta

## TIPOS PRIMITIVOS
byte: 8 bits 
short: 16 bits
int: 32 bits
long: 64 bits
float: 32 bits
double:64 bits
boolean: 1 bit
char: 16 bits

### objeto String[]
é imutável, com métodos pré-definidos que retornam outras strings
String[] por default recene null;

### obs
float deve terminar com f. (ex: 12351f) 

## arrays
int[] anArrayOfints;

ou

    arrayOfInts = new int[10]

ou 

arrayOfInts[0] = 100;

### n dimensões
int[][][][][][][]..n[]
cada linha ou coluna pode ter tamanhos diferentes, pois as arrays são tratadas como arrays de arrays

exemplo
int[][] matrix = {{1,2,4},{3},{5.9}}
matrix[j].length; // retorna o tamanho da linha

### prefixo x pósfixo
a = i++; primeiro atribui depois incrementa a i;


## instanceof
retorna se um objeto é uma instancia de uma classe;
ex:
Parent obj1 = new Parent();
Parent obj2 = new Child();

obj1 instanceof Parent: true;

## controladores de fluxo
if else
ternário
switch
for
### exemplo for
int[] numbers = {1093850918591}
for(int item : numbers) {
}

if (....)
    continue (pula para próxima iteração. 
foreach
while
do-while

// e /**/ - comentários

## javadoc
gera um html com a documentação automática do código



# I/O
## System.in 
representa fluxo de entrada padrão do sistema
é do tipo java.io.InputStream

Scanner // leitura 

import java.util.Scanner;

exemplo Scanner sc = new Scanner(System.in); // scanner 
int i = sc.nextInt(); //le um inteiro com um método do objeto sc da classe scanner.

