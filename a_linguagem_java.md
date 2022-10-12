<h1>A linguagem Java</h1>

<p align = "justify">A linguagem Java surgiu no começo dos anos 90 sendo está a criação de um programador chamado <a href="https://pt.wikipedia.org/wiki/James_Gosling" target="_blank">James Gosling</a> <a href="#1">[1]</a>. O objetivo inicial da linguagem de programação (ainda chamada de Oak essa época) era resolver os problemas de dispositivos eletrônicos que necessitavam de uma certa automação para seu funcionamento. A grande questão até o presente momento da história é de que estes dispositivos funcionavam com linguagens de programação própria para cada dispositivo tal situação dificuldade a fabricação destes vistos o grande <i>boom</i> do mercado de eletrônicos alavancados pelo surgimento da internet e dos computadores pessoais. <br><br>
Uma das grandes evoluções trazidas pela linguagem Java foi a criação da <b>Máquina Virtual Java</b> (<i>Java Virtual Machine</i>) que permitiu que o mesmo código fonte pudesse ser executado em diversos sistemas operacionais, ou seja, independente do sistema operacional.
</p>

<h2>Primeiros passos em Java</h2>
<p align = "justify">O primeiros passos em Java serão dados empregando o compilador <i>online</i> <a href="https://www.jdoodle.com/online-java-compiler/" target="_blank">jdoodle</a>. <br><br>
Nosso primeiro programa em Java será o tradicional <b>Hello, world!</b> ou <b>Olá Mundo!</b>.  <br><br>
Todo programa Java começa com a palavra-chave <code><b>class</b></code> e um método principal denominado de <code><b>main</b></code>. Vejamos o exemplo da estrutura primária do algoritmo:</p>

```java
public class OlaMundo {
	public static void main(String[] args){
	    // Parte interna do algoritmo
	}
}
```
<p align = "justify">Veja que o programa Java utiliza-se das chaves <code>{ }</code> para denominar o trecho de início e fim de um algoritmo. Portanto para aplicar a impressão do termo <b>Olá Mundo!!!</b> vamos empregar o método <code>System.out.println</code>. Vejamos como fica a versão final do algoritmo (<code>arq1.java</code>):</p>

```java
public class OlaMundo {
	public static void main(String[] args){
		System.out.println("Olá Mundo!!");
	}
}
```

<p align = "justify">Além disso é válido salientar que após o uso de métodos, funções e outros é necessário "encerrar a linha de código" com <code>;</code>. <br><br>
Agora vamos empregar dados matemáticos para construção de um algoritmo Java. Para isso vamos construir um algoritmo que determina a Area de uma circunferência de diâmetro "D". Além do método de impressão vamos importar a biblioteca que nos permitirá recolher o dado digitado por um teclado. Para isso vamos importar da seguinte forma:</p> 

```java
import java.util.Scanner;
```

<p align = "justify">Ainda sem entrar na Orientação à Objetos vamos criar um objeto que que quando invocado permitirá a execução de métodos referentes a leitura do dado digitado via teclado. Vejamos o exemplo (<code>arq2.java</code>):</p> 

```java
import java.util.Scanner;

public class ComputaArea {
    public static void main(String[] args){
        // Criação do objeto
        System.out.println("Entre com o diâmetro: ");
        Scanner input = new Scanner(System.in);
        // Leitura do Diâmetro
        double diametro = input.nextDouble();
        // Determinação da área
        double area = 3.14159 * diametro * diametro / 4;
        // Impressão do valor
        System.out.println("O valor da área da circunferência de diâmetro " + diametro + " é " + area);
    }
}
```

<h2>Instalando o Java e rodando o primeiro programa</h2>

<p align = "justify">Para desenvolver aplicações no java vamos buscar no <a href="www.google.com.br" target="_blank">Google</a> pela palavra-chave "java download jdk". <br><br>
Após a instalação do <b>java</b> o primeiro programa poderá ser compilado utilizando o <code>cmd</code>. Utilizando o comando <code>cd..</code> para acessar a pasta do arquivo. Com o caminho atualizado no terminal MS-DOS execute o seguintes comandos:</p> 

```
javac arq1.java 
```

<p align = "justify">O nome do arquivo deverá ser o mesmo da classe adotada. No caso o nomes dos arquivos desse repositório estão com o padrão arq<numeral>. Onde <> indica o numeral a ser digitado.<br><br>
Se aplicarmos um comando <code>dir</code> será possível ver que um novo arquivo <code>.class</code> foi gerado na pasta. Esse arquivo é necessário para que a máquina virtural (formato bytecode) entenda o código java.<br><br>
Portanto para executar o código digite no terminal:</p> 

```
java arq1 
```

<p align = "justify">Daqui em diante vamos utilizar uma IDE para o desenvolvimento em java. Neste caso vamos utilizar a IDE <a href="https://www.eclipse.org/downloads/packages/release/kepler/sr1/eclipse-ide-java-developers" target="_blank">Eclipse</a>. Quando efetuar a instalação pode utilizar o pacote <b><i>Eclipse IDE for Java Developers</i></b>.<br><br>
Para criar um novo projeto java no Eclipse basta clicar em:</p>

```shell
├── File
    └── New (Alt+Shift+N)
        └── Java Project
```

<p align = "justify">Aqui criaremos um projeto chamado <code>sintaxe-basica</code> e dentro da pasta <code>src</code> colocaremos os arquivos de extensão <code>.class</code>. Vamos então escrever o algoritmo arq1 dentro da plataforme Eclipse.</p>

```shell
├── src (clica com botão direito)
    └── New
        └── Class (Escrever arq1)
```

<p align = "justify">Com o arquivo <code>arq1.java</code> criado utilize o comando:</p>

```shell
├── Botão Direito
    └── Run As
        └── Java Application
```

<h2>Sintaxe básica</h2>

<p align = "justify">O Java é uma linguagem estática e fortemente tipada. Logo será necessário informar no começo do código o tipo da variável. Tal exemplo disso foi feito no algoritmo <code>arq2</code>.</p>

