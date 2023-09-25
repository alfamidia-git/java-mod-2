# Programação Orientada a Objetos

## Encapsulamento
É um conceito da Orientação a Objetos para restringir acesso aos dados do nosso objeto.
Isso é uma forma de garantir mais segurança para o objeto, sendo que só o código dentro da classe poderá modificar suas propriedades.
Em Java, você pode encapsular uma classe através do uso de modificadores de acesso, como private, protected e public, para controlar quais membros da classe (atributos e métodos) podem ser acessados por outras partes do código

* **public:** acesso livre para modificar os membros da classe tanto dentro, quanto fora dela.
* **private:** só pode modificar os membros da classe dentro dela mesmo.
* **protected:** além de ser acessível dentro da própria classe, também é acessível para classes que herdam. (Veremos mais na parte de herança)

Vamos continuar com o mesmo exemplo da última aula
```java
public class Carro{
    private String marca;
    private String modelo;
    private String cor;
    private boolean estaLigado;
    private Integer qtdCombustivel;
}
```

## getters e setters

### getter
Os getters são métodos que retornam o valor de um atributo privado. Eles permitem obter acesso somente leitura aos atributos privados da classe. Para criar um getter, siga o padrão "get" seguido do nome do atributo com a primeira letra em maiúscula.

```java
public class Carro{
    private String marca;
    private String modelo;
    private String cor;
    private boolean estaLigado;
    private Integer qtdCombustivel;

    public String getMarca(){
        return this.marca;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getCor(){
        return this.cor;
    }

    //continua
}
```

### setter
Os setters são métodos que permitem modificar o valor de um atributo privado. Eles fornecem acesso somente escrita aos atributos privados da classe. Para criar um setter, siga o padrão "set" seguido do nome do atributo com a primeira letra em maiúscula e inclua um parâmetro para receber o novo valor a ser atribuído ao atributo.

```java
public class Carro{
    private String marca;
    private String modelo;
    private String cor;
    private boolean estaLigado;
    private Integer qtdCombustivel;

    public void setMarca(String marca){
        this.marca = marca;
    }

    public void setModelo(String modelo){
        this.modelo = modelo;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    //continua
}
```

Usando esta classe:
```java
public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Hyundai");
        carro.setModelo("I30");
        carro.setCor("Preto");
        
        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Cor: " + carro.getCor());
    }
}
```

#Exercicio
Crie uma classe ContaBancaria com as propriedades: numeroDaConta, titular e saldo. Todos privados.
Crie somente os métodos para ler essas informações e também crie método para depositar e sacar valores. 
**Não deverá ser possível sacar caso a quantia seja maior que o saldo atual**