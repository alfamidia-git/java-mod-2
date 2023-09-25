## DESAFIO FINAL DO MÓDULO
Com base em todo conteúdo visto nas aulas anteriores, você precisará desenvolver um...

### Sistema de Cadastro de Alunos
Neste desafio final, você deve criar um sistema de cadastro de alunos utilizando os conceitos de programação orientada a objetos (POO). O objetivo é criar uma estrutura simples para cadastrar e gerenciar informações de alunos.

#### Vamos ao desafio:
1. Crie uma classe chamada Aluno que representará um aluno com os seguintes atributos:
    * nome (String): nome do aluno.
    * idade (int): idade do aluno.
    * matricula (String): número de matrícula do aluno.
    * nota (double): nota média do aluno.
2. Implemente os seguintes métodos
    * Construtor: crie um construtor que recebe o nome, idade, matrícula e nota do aluno e inicialize os atributos da classe.
    * Métodos getter e setter para cada atributo: permita o acesso e a modificação dos atributos encapsulados.
3. Crie uma classe chamada Turma que representa uma turma de 5 alunos. Essa classe deve conter os seguintes atributos:
    * identificador (int): identificador do aluno.
    * aluno01 (Aluno): aluno 1.
    * aluno02 (Aluno): aluno 2.
    * aluno03 (Aluno): aluno 3.
    * aluno04 (Aluno): aluno 4.
    * aluno05 (Aluno): aluno 5.
4. Implemente os seguintes métodos:
    * Método para inserir alunos.
    * Método que retorne a quantidade alunos.
    * Método que retorne a média da turma.
    * Método toString.
5. Na classe principal:
    * Instancie 8 objetos Aluno.
    * Instancie 2 objetos Turma.
    * Adicione 5 alunos em uma turma e 3 na outra.
    * Exiba informações das turmas (toString).
    * Exiba quantidade de alunos das turmas.
    * Exiba média das turmas;