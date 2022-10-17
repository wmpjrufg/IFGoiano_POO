<script src = "https://polyfill.io/v3/polyfill.min.js?features=es6"></script>
<script id = "MathJax-script" async src = "https://cdn.jsdelivr.net/npm/mathjax@3/es5/tex-mml-chtml.js"></script>

<h1>Orientação a Objetos</h1>

<p align = "justify">Nesta etapa do aprendizado faremos a conversão dos algoritmos no paradigma de Orientação a Objetos desenvolvida pelo programador Alan Kay. Neste paradigma os algoritmos são criados através da composição de objetos que interagem entre si <a href="#1">[1]</a>.<br><br>
Na orientação a objetos a estrutura que define o modelo de um objeto do mundo real damos o nome de classe, e a partir dela são construídos objetos para serem utilizados. As características dos objetos do mundo real são chamadas de atributos no mundo computacional, enquanto a seus comportamentos chamamos métodos. Pode também ser denominado o estado de um objeto que é equivalente ao seu conjunto de propriedades, logo podemos afirmar que tal caracteristica é o próprio valor do atributo <a href="#2">[2]</a><a href="#3">[3]</a>.<br><br>
É válido salientar que a programação orientada a objetos ganhou notoriedade com a linguagem Java e C++ nas décadas de 90.
<br><br>
O paradigma orientado a objetos se difere do conceito procedural imperativo pelo fato de que no algoritmo procedural separa atributos e comportamentos enquanto na orientação a objetos atributos e comportamentos estão contigos em um único objeto. A consequência disso é que o acesso aos dados é descontrolado e imprevisível (isto é, várias funções podem ter acesso aos dados globais). E como você não tem controle sobre quem tem acesso aos dados, testar e depurar o seu código será muito difícil <a href="#24">[4]</a>.
<br><br>
Para exemplificar o conceito de classes e objetos vamos construir um exemplo destas entidades imaginando um algoritmo para venda de sofás. Tal descrição pretende exemplificar a classe <b>Cliente</b> <a href="#24">[5]</a>:</p>

<dl>
  <dt>Atributos</dt>
  <dd>Nome</dd>
  <dd>Endereço</dd>
  <dd>DNI (Documento Nacional de Identificação)</dd>
  <dt>Métodos</dt>
  <dd><code>FazerPedido()</code></dd>
  <dd><code>ListaCompras()</code></dd>
  <dd><code>Pagar()</code></dd>
</dl>

<p align = "justify">Uma grande diferença entre objetos e classes está na forma como os atributos e métodos são tratados em objetos e classes. Uma classe é uma definição sobre objetos; a atributos e métodos em uma classe são, portanto, declarações que não contêm valores. No entanto, os objetos são instâncias criadas de uma classe. Cada um tem seus próprios atributos e métodos. Os valores do conjunto de atributos descrevem o estado dos objetos <a href="#24">[5]</a>.</p>

<p align = "justify">Para treinar o nosso projeto Java vamos construir um algoritmo para uma Biblioteca. O projeto pode ser visualizado neste <a href="https://wmpjrufg.github.io/IFGoiano_POO/biblioteca.html" target="_blank"><i>link</i></a></p>


<h2>Referências</h2>
<p align = "left" id = "1">[1]	Wikipédia. Programação orientada a objetos. Wikipédia 2022. https://pt.wikipedia.org/wiki/Programação_orientada_a_objetos.</p>
<p align = "left" id = "2">[2]	Fernando Siqueira. Programação Orientada a Objetos. Google sites. https://sites.google.com/site/anhangueraniteroipoo/aulas/aula-1---introducao-a-orientacao-a-objetos.</p>
<p align = "left" id = "3">[3]	Victorio Albani de Carvalho; Giovany Frossard Teixeira. Programação Orientada a Objetos. Ministério da Educação rede e-Tec Brasil. Colatina, 2012.</p>
<p align = "left" id = "3">[4]	Macoratti.net. Programação Orientada a Objetos x Programação Procedural. https://www.macoratti.net/14/06/oop_proc.htm, 2012.</p>
<p align = "left" id = "3">[5]	Danny Poo; Derek Kiong; e Swarnalatha Ashok. Object-Oriented Programming and Java. Springer, 2008.</p>