<h1>A linguagem Java</h1>

<p align = "justify">A linguagem Java surgiu no começo dos anos 90 sendo está a criação de um programador chamado <a href="https://pt.wikipedia.org/wiki/James_Gosling" target="_blank">James Gosling</a> [1]. O objetivo inicial da linguagem de programação (ainda chamada de Oak essa época) era resolver os problemas de dispositivos eletrônicos que necessitavam de uma certa automação para seu funcionamento. A grande questão até o presente momento da história é de que estes dispositivos funcionavam com linguagens de programação própria para cada dispositivo tal situação dificuldade a fabricação destes vistos o grande <i>boom</i> do mercado de eletrônicos alavancados pelo surgimento da internet e dos computadores pessoais. <br><br>
Uma das grandes evoluções trazidas pela linguagem Java foi a criação da <b>Máquina Virtual Java</b> (<i>Java Virtual Machine</i>) que permitiu que o mesmo código fonte pudesse ser executado em diversos sistemas operacionais, ou seja, independente do sistema operacional.
</p>

<h2>Primeiros passos em Java</h2>
<p align = "justify">O primeiros passos em Java serão dados empregando o compilador <i>online</i><a href="https://www.jdoodle.com/online-java-compiler/" target="_blank">jdoodle [1]</a>. <br><br>
Nosso primeiro programa em Java será o tradicional <b>Hello, world!</b> ou <b>Olá Mundo!</b>.  <br><br>
Todo programa Java começa com a palavra-chave <code><b>class</b></code> e um método principal denominado de <code><b>main</b></code>. Vejamos o exemplo~da estrutura primária do algoritmo:</p>

```java
public class OlaMundo {
	public static void main(String[] args){
	    // Parte interna do algoritmo
	}
}
```
<p align = "justify">Veja que o programa Java utiliza-se das chaves <code>{ }</code> para denominar o trecho de início e fim de um algoritmo. Portanto para aplicar a impressão do termo <b>Olá Mundo!!!</b> vamos empregar o método <code>System.out.println</code>. Vejamos como fica aversão final do algoritmo:</p>

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

<p align = "justify">Ainda sem entrar na Orientação à Objetos vamos criar um objeto que que quando invocado permitirá a execução de métodos referentes a leitura do dado digitado via teclado. Vejamos o exemplo:</p> 

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







<h2>Referências</h2>
[1]	Wikipédia. James Gosling. Wikipédia 2022. https://pt.wikipedia.org/wiki/James_Gosling.

