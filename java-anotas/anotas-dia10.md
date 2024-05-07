# Streams, Arquivos e Serialização
## Streams 
Representam um fluxo continuo de dados -> pode-se uitlizar de diversas fontes, seja arquivos, programas , conexões de rede...

### Byte stream 
usado para ler e escrever bytes de 8 bits
- InputStream e OutputStream

EX: 
FileInputStream in = null;
FileInputStream out = new FileInputStream("nameFile.file");

while (c = in.read()) // return -1 if EOF

armazena-se os dados numa variável do tipo inteiro (em 8 bits, de 4 bytes)

### Char stream
FileReader and FileWriter

while (int c = inputStream.read() != 1) 
    outputStream.write(c);

armazena-se os dados numa variável do tipo inteiro (em 16 bits, de 4 bytes)

Caso utilize-se a codificação UTF-16, será necessário o uso da cp.char

Um stream de chars pode ser um filtro para streams de bytes
- Wrappers e Bridge

in = FileInputStream("text.text");
filterIn = newInputStreamReader(in);

## Buffered streams
pode armazenar em buffers os arquivos recebidos pela stream, isso torma o processo mais lento, porém pode armazenar o arquivo para o runtime.

o buffer automaticamente rearranja os acessos em cada região do arquivo, priorizando a escrita e leitura no buffer e posteriormente ao arquivo.

EX: 
- BufferedInputStream(byte)
- BufferedOutputStream(byte)
- BufferedReader(char)
- BufferedWriter(char)

pode haver um filtro com buffers

### leitura
é possivel ler uma linha inteira bufferizada com o método .readLine()

### flush
pode descarregar o buffer no arquivo em algum momento desejado pelo programador


### Scanner
o scanner facilita a leitura de dados por tokens (blocos de texto separados por terminações determinadas com espaços em branco, tabulações, final de linha...)

Scanner sc = new Scanner( new BufferedReader(newFileReader("texto")));

while (sc.hasNext ou hasNextLine..)

sc.useLocale("região"); // define o padrão de texto da região definida

### input via sistema

há streams no sistema que podem ser acessadas por
-System.in/out/err
-classe console

Console c = System.console();
if (c==null) {

}
Consoloe.read/write/readPassword

### Streams de objetos
ObjectInput/OutputStream
Objetos inteiros podem ser armazenados e lidos posteriormente, no buffer ou não
Facilita a escrita dos objetos em algum arquivo

.read/writeObject()



## Serialização
para gravar um objeto, pode-se usar um Serial para armazenar
Um objeto serializado é um objeto representado como uma sequência de bytes que inclui os dados do objeto bem como as informações sobre o tipo do objeto e os tipos dos dados armazenados no objeto.

A classe precisa implementar a interface 'Serializable' para ser serializada


### acesso aleatório a arquivos
