# Desafio Target 🎯 Ribeirão Preto - Entrevista Técnica 
Este repositório contém soluções para cinco questões técnicas apresentadas pela Target Sistemas como parte de um processo seletivo. As questões abrangem tópicos como Fibonacci, manipulação de Strings, loops e 2 perguntas sobre lógica e algorítmos.

## Questões
### 1. Verificação de sequência de Fibonacci

### O que foi solicitado:
Dado um número informado, calcular a sequência de Fibonacci e verificar se o número pertence ou não à sequência.

### Como funciona:
 O código tem 2 funções estáticas, uma recursiva que gera a sequência de fibonacci, e outra que irá checar se o número dado como input pertence a sequência. Logo abaixo temos o método `Main` que irá executar o programa, nele contém um bloco de `loop while` para repetir o problema caso o usuário digite algo errado e um bloco de `Try-Catch` para capturar erros de input e os tratar corretamente.

 #### Execução:
 - Entrada 1: 1597
 - Saída: 1597 Pertence a sequência de Fibonacci
 - Entrada 2: 1597.77
 - Saída: Valor inválido, a sequência de Fibonacci só aceita números inteiros, tente novamente 

 #### Localização: `DesafioTarget-RibeiraoPreto/Target/src/desafioTarget2/Fibonacci.java`


---

### 2. Contador de Letras 'a'

### o que foi solicitado: 
Utilizando dados de input por scanner ou dados informados no código, faça um programa que receba uma String e depois retorne se há ou não uma letra 'a' nela, e se sim, informe quantas tem.

### Como funciona:
O código recebe o input, depois transforma a String em um vetor de `char`, após um loop iterando o vetor ele irá adicionar um contador toda vez que passar por um 'a' ou 'A', no fim irá retornar se houve ou não ocorrência da letra 'A' e quantas houveram.

#### Localização: `DesafioTarget-RibeiraoPreto/Target/src/desafioTarget2/LetraA.java`

---
### 3. Calculo de soma com laço
### o que foi solicitado:
Calcular a soma dos números de 1 até que o valor seja menor que o ÍNDICE usando um laço `while`.
###  como funciona:
- Itera sobre os valores de 1 até o `INDICE`
- Acumula os valores na variável `SOMA`
### Resultado: 
`SOMA` = 77
#### Localização: `DesafioTarget-RibeiraoPreto/Target/src/desafioTarget2/Soma.java`

---
### 4. Sequências lógicas
### O que foi solicitado:
Responder o próximo número da sequência.

### Sequências:
- a ) 1, 3, 5, 7, ___ - Próximo número: 9 (incremento de 2)
- b ) 2, 4, 8, 16, 32, 64, ____ - Próximo número: 128 (Cada número é o dobro do anterior.)
- c ) 0, 1, 4, 9, 16, 25, 36, ____ - Próximo número: 49 (quadrados perfeitos)
- d ) 4, 16, 36, 64, ____ - Próximo número: 100 (quadrado de números pares)
- e ) 1, 1, 2, 3, 5, 8, ____ - Próximo número: 13 (sequência de Fibonacci)
- f ) 2, 10, 12, 16, 17, 18, 19, ____ - Próximo número: 20 (A sequência alterna entre um salto grande (2 → 10, 12 → 16) e saltos pequenos (16 → 17 → 18 → 19). O próximo salto após 19 deve ser 20.)

 #### Localização: `DesafioTarget-RibeiraoPreto/Target/src/desafioTarget2/sequencia.txt`

 ---
### 5. Desafio das lâmpadas
### O que foi solicitado:
Este é um desafio de lógica onde você está em uma sala com três interruptores, cada um conectado a uma lâmpada em salas diferentes. O objetivo é descobrir qual interruptor controla qual lâmpada com apenas duas idas até uma das salas das lâmpadas. 

### Como funciona:
1. Ligue o primeiro interruptor e deixe ligado por alguns minutos (Deixaremos um tempo ligado pois irá gerar calor na lâmpada).
2. Desligue o primeiro interruptor e ligue o segundo.
3. Vá até a sala onde estão as lâmpadas.
4. A lâmpada que estiver acesa é controlada pelo segundo interruptor.
5. A lâmpada que estiver apagada porém quente será a controlada pelo primeiro interruptor que foi deixado ligado por alguns minutos.
6. A lâmpada que estiver apagada e também fria será a controlada pelo terceiro e ultimo interruptor.

#### Localização: `DesafioTarget-RibeiraoPreto/Target/src/desafioTarget2/lampada.txt`

---
## ⚙ Como usar
```bash
 # Clone o projeto
  - Faça um Fork do projeto
        ou
  $ git clone https://github.com/MatheusNascimento87/DesafioTarget-RibeiraoPreto.git
```
- Compile e execute o projeto

- Compile o projeto Java e execute as classes de cada programa 

## Requisitos:
- Versão do Java 8+
- JDK instalada
- Uma IDE ao seu gosto. NetBeans, Eclipse, VS Code, IntelliJ IDEA

## Contato
## 📱 [Linkedin](https://www.linkedin.com/in/matheus-pereira-do-nascimento/)
