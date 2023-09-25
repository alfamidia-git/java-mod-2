# Programação Orientada a Objetos

## Enumerações
É um tipo de dado especial que permite uma variável seja um conjunto de constantes pré definidas.

Por serem constantes, os nomes dos campos de um tipo enum estão em letras maiúsculas. 

```java
    public enum DiaSemana{
        SEGUNDA, TERCA, QUARTA, QUINTA, SEXTA, SABADO, DOMINGO
    }
```

```java
public class Main {
    public static void main(String[] args) {
        DiaSemana dia = DiaSemana.SEXTA;

        System.out.println("Hoje é: " + dia);

        if (dia == DiaSemana.DOMINGO) {
            System.out.println("É dia de descanso!");
        } else {
            System.out.println("Ainda não é fim de semana.");
        }
    }
}
```

## Relacionamentos entre classes
1. **Agregação**: A agregação é um tipo de relacionamento em que uma classe (classe todo) possui outra classe (classe parte) como um de seus atributos, mas as classes têm um ciclo de vida independente. Isso significa que uma classe pode existir sem a outra. A classe todo não é responsável por criar ou destruir a classe parte. Quando a classe todo é destruída, a classe parte ainda pode continuar a existir.
```java
public class Livro {
    private String titulo;
    private Autor autor;
    
    // Outros atributos e métodos da classe...
}
```

2. **Associação**: A associação é um tipo de relacionamento mais genérico, em que uma classe se relaciona com outra classe, mas não existe uma relação forte de propriedade ou dependência. As classes envolvidas na associação podem ter ciclos de vida independentes e não precisam ser dependentes uma da outra.
```java
public class Livro {
    private String nome;
    private Curso curso;
    
    // Outros atributos e métodos da classe...
}
```

3. **Composição**: A composição é um tipo de relacionamento mais forte e específico, em que uma classe (classe todo) é composta por outra classe (classe parte) e não pode existir sem ela. Isso significa que a classe todo é responsável por criar e destruir a classe parte. Quando a classe todo é destruída, a classe parte também é destruída.
```java
public class Carro {
    private Motor motor;
    
    // Outros atributos e métodos da classe...
}

```

## Exercicio
1. Crie uma enumeração CategoriaProduto com as opções: Eletrônico, vestuário, alimento e limpeza.
2. Crie uma classe Produto com as propriedades: nome, preço e categoria.
3. Na classe principal, instacie 4 produtos e imprima todos utilizando o método toString.