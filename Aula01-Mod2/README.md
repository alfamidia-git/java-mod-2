# Programação Orientada a Objetos

Neste módulo, aprenderemos como projetar e construir nossos programas usando os princípios da POO. Vamos entender como trabalhar com classes e objetos, que são os blocos de construção essenciais dessa abordagem. Descobriremos como encapsular dados e comportamentos dentro de objetos, promovendo a segurança e a reutilização do código.

Além disso, exploraremos conceitos como herança, polimorfismo, abstração e encapsulamento, que nos permitirão criar hierarquias de classes bem organizadas e flexíveis. Aprenderemos a criar relacionamentos entre objetos, permitindo que eles interajam e colaborem para resolver problemas complexos de forma elegante.

### Quais as vantagens?
* Fácil representação da vida real;
* Reutilização de código;
* Fácil manutenção futura ou da equipe;
* Organização mais clara do código;
* Segurança.

## O que é um objeto?
Um objeto é uma entidade que você pode manipular em seu programa.
Deve-se pensar em um objeto como uma “caixa-preta”.  Com uma interface pública e uma implementação oculta. 
Normalmente, o objeto usa de seus métodos para manipular o programa.

## O que é uma classe?
A classe define os métodos para os objetos. 
A classe é responsável por todas propriedades (variáveis) e métodos (funções) que um objeto instanciará.

## O que é um método?
Método é uma funcionalidade que o objeto tem. 
Exemplo: um carro pode acelerar. Acelerar é uma funcionalidade que todo carro deve ter.
Métodos podem ou não receber argumentos (parâmetros) .

## Retornos de um método
Um método pode ou não retornar uma resposta.
Exemplo: Eu posso ter um método para adicionar um item no pedido. Este método não precisa de retorno.
Mas também posso ter um método para ver o valor do pedido. Este método precisa de um retorno.
Quando um método não tem retorno, usamos a palavra "void" na sua construção. Já quando ele tem retorno, precisamos definir o tipo que esse método retornará

## Diferença entre variáveis e objetos
Variáveis de tipos primitivos são criados já na declaração.
“Variáveis” de objeto são do tipo composto e precisam ser instanciados para iniciarem.
“Variáveis” de objeto fazem referência ao endereço de memória do objeto e não ao valor em sí.


## Criando nossa primeira classe
```java
public class Carro{
    String marca;
    String modelo;
    String cor;
    boolean estaLigado;
    Integer qtdCombustivel;

    public void ligar(){
        estaLigado = true;
    }

    public void desligar(){
        estaLigado = false;
    }

    public Integer verQtdCombustivel(){
        return qtdCombustivel;
    }
}
```

##  Instanciando a classe que acabamos de criar
```java
public class Main{
    public static void main(String[] args){
        Carro carro = new Carro();

        carro.marca = "HONDA";
        carro.modelo = "Civic";
        carro.cor = "Preto";

        carro.ligar();
    }
}
```

#Exercício

Crie uma classe aluno com as propriedades nome, matricula e qtdFaltas. Também crie um método que incremente uma falta toda vez que ele for chamado.