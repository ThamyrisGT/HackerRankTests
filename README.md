# HackerRankTests

1. **FizzBuzz**

Dado um número n, cada inteiro i no intervalo de 1 a n inclusive, imprime
um valor por linha da seguinte forma:

- se i for um múltiplo de 3 e 5, imprima o FizzBuzz
- se i for um múltiplo de 3 (mas não 5), imprime Fizz
- se i for um múltiplo de 5 (mas não 3), imprima o Buzz
- se i não for um múltiplo de 3 ou 5, imprima o valor de i

**Saída ( para  entrada = 15 ):**

1
2
Fizz
4
Buzz
Fizz
7
8
Fizz
Buzz
11
Fizz
13
14
FizzBuzz

**--------------------------------------------------------------------------------------------------------------**

2. **Formação de Time**

Considerando uma lista de pessoas colaboradoras de uma empresa
na qual cada um recebe uma pontuação de avaliação numérica, utilize
o processo de seleção abaixo para encontrar uma soma de pontuações
das pessoas selecionadas

1. A pessoa colaboradora com a maior pontuação entre as primeiras k pessoas
   ou as últimas k pessoas na lista de pontuação é selecionada.
2. A pessoa selecionada é removida da lista de pontuação

3. O processo continua para selecionar a próxima pessoa colaboradora
   até que o tamanho_do_time seja atingido

**OBS:**

1. Caso múltiplas pessoas tenham a mesma pontuação mais alta, a pessoa
   com o índice mais baixo é selecionada
2. Se houver menos que um número k de pessoas, a lista inteira fica 
   disponível para seleção

**Descrição:**

- pontuacao[n]: um array de pontuações para cada pessoa colaboradora
- tamanho_do_time: o número necessário de membros do time
- k: o tamanho dos segmentos do array que podem ser selecionados.
- Retorna:
  int: soma das pontuações selecionadas

**Ex:** 

pontuacao =[10,20,10,15,5,30,20]
tamanho_do_time=2
k=3

**1° rodada:** 

[10,20,10] [5,30,20]
pontuação 30 é removida da lista
pontuacao=[10,20,10,15,5,20]
**2° rodada:**

[10,20,10] [15,5,20]
pontuação 20 índice 1 é removida da lista
pontuacao=[10,10,15,5,20]

A soma das pontuações é 30+20=50

**Restrições:**

1<= pontuacao[i] <= 109
1<= tamanho_do_time <=n
1<= k <=n

