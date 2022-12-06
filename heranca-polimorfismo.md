<script src="https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
<script id="MathJax-script" async src="https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>

<h1>Herança</h1>

<p align="justify">Henraça irá permitir que as classes compartilhem atributos, métodos e outro componentes dessa classe. Na henrança teremos dois tipos de classe, são elas:</p>

<ul>
    <li>Classe base (também chamada de classe Pai);</li>
    <li>Classe derivada (também chamada de classe Filha);</li>
</ul>

<p align="justify">Por exemplo na classe <b>AnimalDomestico</b> podem ser considerados que um animal tem os seguintes atributos:</p>

<ul>
    <li>nome;</li>
    <li>tipo;</li>
    <li>idade.</li>
</ul>

<p align="justify">Por exemplo se fossemos fazer uma classificação da ração em função da raça do animal isso poderia gerar um <code>if</code> grande que poderia desorganizar a programação. Portanto para criar um novo tipo de ração teriamos que criar uma nova classe, vejamos:</p>

```java
class AnimalDomesticoGato{
	String nome;
	String tipo;
	int idade;
    String racao = "gatos";
}

class AnimalDomesticoCoelho{
	String nome;
	String tipo;
	int idade;
    String racao = "coelho";
}
```

<p align="justify">Caso precisemos colocar um acessório para o animal ou uma série de acessórios a lógica seria a mesma. Criar novas classes com os atributos voltados aquela classe. Na programação podemos que usar o conceito de herança para herdar os componentes de uma detemrinada classe. Na prática esse conceito auxília no reaproveitamento de código e na escalabilidade do mesmo.<br>

Vejamos agora a criação de um exemplo de herança para criar uma classe funcionário dentro de uma empresa. Para diferenciar as classes vamos dizer que o <b>Funcionario</b> do tipo <b>Gerente</b> precisa de uma senha. Para tanto vamos criar a classe <b>Funcionario</b> porém o atributo <code>senha</code> vamos colocar apenas dentro da classe <b>Gerente</b>.<br>

Apresentando a classe <b>Gerente</b>:
</p>

```java
public class Gerente extends Funcionario {
	
	private int senha = 123456;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			return true;
		} else {
			return false;
		}
	}

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}
}
```

<p align="justify">Teste de uso e verificando se a senha foi autenticada. Saliento que a senha atribuida na classe <b>Gerente</b> é a senha <i>123456</i>.</p>

```java
public class Teste{

	public static void main(String[] args) {
		
		Gerente francisco = new Gerente();
		francisco.setNome("Francisco");
		francisco.setCpf("019089332-30");
		francisco.setSalario(20000.00);
		francisco.setTipo("gerente");
		
		System.out.println(francisco.getNome());
		System.out.println(francisco.getBonificacao());
		System.out.println(francisco.autentica(334));
	}
}
```
```
Francisco
2000.0
false
```

<p align="justify">Veja que foi utilizado métodos da classe <b>Funcionario</b> na definição de um gerente.</p>

<h1>Polimorfismo</h1>

<p align="justify">O polimorfismo é o princípio a partir do qual as classes derivadas de uma única classe base são capazes de invocar os métodos que, embora apresentem a mesma assinatura, comportam-se de maneira diferente para cada uma das classes derivadas. Com o Polimorfismo, os mesmos atributos e objetos podem ser utilizados em objetos distintos, porém, com implementações lógicas diferentes.</p>