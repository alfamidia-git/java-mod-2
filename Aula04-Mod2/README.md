# Programação Orientada a Objetos

## Métodos padrões

## toString():
O método toString() é usado para obter uma representação em formato de string do objeto. Geralmente, é útil para exibir informações relevantes do objeto quando necessário, como em logs ou para depuração. Por padrão, a implementação do toString() na classe Object retorna uma representação do objeto na forma de: nomeDaClasse@hashCode. No entanto, é recomendado que você substitua esse método nas suas próprias classes para fornecer uma representação mais significativa do objeto.

```java
import java.util.Objects;

public class Carro{
    private String marca;
    private String modelo;
    private String cor;
    private boolean estaLigado;
    private Integer qtdCombustivel;

    @Override
    public String toString() {
        return "Carro [marca=" + marca + ", modelo=" + modelo + ", cor=" + cor +
               ", estaLigado=" + estaLigado + ", qtdCombustivel=" + qtdCombustivel + "]";
    }
}
```

## equals():
O método equals() é usado para comparar se dois objetos são iguais. Por padrão, na classe Object, o método equals() compara a referência de memória dos objetos (ou seja, verifica se eles apontam para a mesma área de memória). No entanto, a maioria das classes personalizadas precisa comparar o conteúdo dos objetos e, portanto, é necessário substituir o método equals().

```java
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Carro carro = (Carro) obj;
        return estaLigado == carro.estaLigado &&
               Objects.equals(marca, carro.marca) &&
               Objects.equals(modelo, carro.modelo) &&
               Objects.equals(cor, carro.cor) &&
               Objects.equals(qtdCombustivel, carro.qtdCombustivel);
    }
```

## hashCode():
O método hashCode() é usado em conjunto com o equals() para trabalhar com estruturas de dados que dependem de chaves únicas, como conjuntos (Set) e mapas (Map). O hashCode() deve ser implementado de forma consistente com o equals(), de modo que objetos iguais tenham o mesmo valor de hash.

O valor de hash (hash code) é um valor numérico que é gerado a partir de uma entrada de dados, como uma sequência de caracteres ou um conjunto de atributos de um objeto. Ele é geralmente usado para representar de forma compacta os dados originais, permitindo uma identificação rápida e eficiente dos dados em várias operações, como busca, comparação e armazenamento em estruturas de dados.

```java
    @Override
    public int hashCode() {
        return Objects.hash(marca, modelo, cor, estaLigado, qtdCombustivel);
    }
```

# Exercicio
Crie uma classe Livro com as propriedades: titulo, autor, anoPublicado. O construtor deverá receber os 3 argumentos.

Crie os métodos toString(), equals() e hashCode() neste classe.

Depois instancie 3 objetos diferentes deste livro:
livro 1: titulo = Dom Casmurro, autor = Machado de Assis, anoPublicado = 1899.
livro 2: titulo = O Príncipe, autor = Maquiavel, anoPublicado = 1532.
livro 3: titulo = Dom Casmurro, autor = Machado de Assis, anoPublicado = 1899.

1. Imprima os 3 livros usando o método toString()
2. Imprima o resultado hash utilizando o método hashCode()
3. Imprima o resultado a comparação do livro 1 com o livro 2 e do livro 1 com o livro 3;