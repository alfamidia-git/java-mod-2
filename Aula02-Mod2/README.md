# Programação Orientada a Objetos

## Construtor
É usado no momento que instanciamos um novo objeto. O padrão é sem argumentos.
Com ele podemos definir como deve ser a inicialização do objeto.

Vamos continuar com o mesmo exemplo da última aula
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

Agora vamos criar um cenário onde é necessário o carro já iniciar com marca, modelo e cor preenchidos. Então para isso, criamos um construtor com argumentos na nossa classe.

```java
public class Carro{
    String marca;
    String modelo;
    String cor;
    boolean estaLigado;
    Integer qtdCombustivel;

    public Carro(String marcaC, String modeloC, String corC){ // esse é nosso construtor
        marca = marcaC;
        modelo = modeloC;
        cor = corC;
    }
    // métodos abaixo....
}
```

Com isso, ao instaciarmos um objeto Carro, obrigatoriamente precisaremos passar os paramêtros necessários:
```java
public class Main{
    public static void main(String[] args){
        Carro carro = new Carro("Honda", "Civic", "Preto");
    }
}
```

## palavra this
É usada quando queremos referenciar a propriedade da nossa classe.
Comumente usamos os argumentos com os mesmos nomes que a propriedade do campo. A palavra this indica ao compilador que estamos acessando a propriedade da nossa classe e não o argumento.

Olhando nosso exemplo acima, colocamos a letra "C" no final, para diferenciar o que vinha do parametro, da classe. O "this" serve exatamente para isso, para quando é preciso referenciar a propriedade da classe.

```java
public class Carro{
    String marca;
    String modelo;
    String cor;
    boolean estaLigado;
    Integer qtdCombustivel;

    public Carro(String marca, String modelo, String cor){ // esse é nosso construtor
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
    // métodos abaixo....
}
```

## Sobrecarga
Sobrecarga é o nome utilizado para métodos que possuem a mesma assinatura (nome), porém os argumentos são diferentes.
Um exemplo muito usado de sobrecarga é método .println, que pode receber tipos como string, double, int.

Então imagine que a nossa classe Carro precisa de dois construtores. Um que receba a marca, modelo e cor e outro vazio. Para isso que serve a sobrecarga;

```java
public class Carro{
    String marca;
    String modelo;
    String cor;
    boolean estaLigado;
    Integer qtdCombustivel;

    public Carro(){
    }

    public Carro(String marca, String modelo, String cor){ // esse é nosso construtor
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }
    // métodos abaixo....
}
```

# Exercício
Seguindo a mesma classe criada no último exercicio. Crie um construtor com todos os parametros possíveis e outro construtor sem parametro.