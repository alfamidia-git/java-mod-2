## Variáveis e métodos estáticos

### Método
Um método estático é aquele que pode ser chamado diretamente pela classe, sem a necessidade de criar um objeto. Eles são comuns para todas as instâncias dessa classe e não podem acessar membros não estáticos diretamente (a menos que tenham uma referência de objeto). Eles são úteis quando você precisa realizar uma tarefa que não depende do estado do objeto.

```java
public class Exemplo {
    public static void metodoEstatico() {
        // Implementação do método estático
    }
}
```
Exemplo de como chamar um método estático:
```java
Exemplo.metodoEstatico();

```

### Variáveis
Uma variável estática é uma variável que pertence à classe, não a instâncias individuais dessa classe. Isso significa que todas as instâncias da classe compartilham o mesmo valor para a variável estática. Variáveis estáticas são úteis para armazenar informações que são comuns a todas as instâncias da classe.

```java
public class Exemplo {
    public static int variavelEstatica = 10;
}
```
Exemplo de como acessar uma variável estática:
```java
int valor = Exemplo.variavelEstatica; // Acessando diretamente pela classe
```

## Variáveis e métodos finais

### Método
Um método final é aquele que não pode ser sobrescrito (ou seja, não pode ser alterado) por subclasses (veremos no próximo módulo). Quando um método é declarado como final em uma classe, isso impede que qualquer classe que estenda essa classe substitua o comportamento desse método.
```java
public class Exemplo {
    public final void metodoFinal() {
        // Implementação do método final
    }
}

```

### Variáveis
Uma variável final é uma variável cujo valor não pode ser modificado após a sua inicialização. Uma vez atribuído um valor a uma variável final, esse valor não pode ser alterado posteriormente.
```java
public class Exemplo {
    public final int variavelFinal = 42;
}
```
Uma vez que variavelFinal é inicializada com o valor 42, não é possível alterá-la para outro valor.

###### UMA OBSERVAÇÃO:
É importante notar que, ao usar a palavra-chave final com objetos, o que não pode ser alterado é a referência, não os atributos do objeto em si. Isso significa que você não pode reatribuir a referência a um novo objeto após a inicialização, mas ainda pode alterar os atributos do objeto através da referência

```java
public class Exemplo {
    public final Pessoa pessoaFinal = new Pessoa("João");
}

// Não é possível fazer o seguinte:
Exemplo ex = new Exemplo();
ex.pessoaFinal = new Pessoa("Maria"); // Erro de compilação

// Mas ainda é possível fazer o seguinte:
ex.pessoaFinal.setNome("Maria"); // Alterando o atributo do objeto
```

## Exercicio
1. Crie uma classe Calculadora
2. Crie uma váriavel final e estática com o valor de Pi.
3. Crie métodos estáticos para todas as operações matemáticas: soma, subtração, multiplicação e divisão.
4. Use os métodos sem instanciar a classe.