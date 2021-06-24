`README.md`

## 1. Introdução

Este repositório contém os artefatos do projeto **_palindrome-algorithm**.

## 2. Documentação

### 2.1. Diagrama de Caso de Uso (Use Case Diagram)

```txt
              +--------------------------+
  O     +---- | RUN Palindrome Algorithm |
 /|\ ---+     +--------------------------+
  |     |
 / \    |     +-----------------------------------+
        +---- | TEST (JUnit) Palindrome Algorithm |
              +-----------------------------------+
```

### 2.5. Estratégia de Branches (Branch Strategy Workflow)

Sugestão de [estratégia de branches e workflow](https://github.com/josemarsilva/eval-git#38-estrat%C3%A9gia-de-gerenciamento-de-branches) :
* `master`: pronto para produção
* `develop`: último desenvolvimento pronto para produção


## 3. Projeto

### 3.1. Pré-Requisitos, Pré-Condições e Premissas

#### a. Tecnologias e ferramentas

* Java JDK 1.8 - requerido para executar
* Eclipse - apenas para IDE desenvolvimento
* JUnint - apenas para Teste Unitário


### 3.2. Guia do Desenvolvedor e Administrador

* Faça um clone do projeto `git clone`. Use o _branch_ `master` se o _branch_ `develop` não estiver disponível
* Leia as documentações disponíves em "2. Documentação"  and "3.x. Design Patterns, Standard, Conventions and Best Practices"


### 3.3. Guia de Implantação, Configuração e Instalação

#### a. Instalando/Clonando este repositório no ambiente

* Windows

```cmd
C:\> md githome
C:\> cd githome
C:\githome> git clone https://github.com/josemarsilva/java-palindrome-algorithm.git
```


### 3.4. Guia de Demonstração e Teste

```cmd
C:\githome\java-palindrome-algorithm> java -jar dist\java-palindrome-algorithm.jar AEIOUuoiea
Palindrome evaluation of your phrase 'AEIOUuoiea' is True.
C:\githome\java-palindrome-algorithm> java -jar dist\java-palindrome-algorithm.jar AEIOUúóíéá
Palindrome evaluation of your phrase 'AEIOUúóíéá' is True.
C:\githome\java-palindrome-algorithm> java -jar dist\java-palindrome-algorithm.jar AEIOUúõíéã
Palindrome evaluation of your phrase 'AEIOUúõíéã' is True.
C:\githome\java-palindrome-algorithm> java -jar dist\java-palindrome-algorithm.jar 1, 2.3!4554321
Palindrome evaluation of your phrase '1,2.3!4554321' is True.
```
* Os caracteres maiúsculos e minúsculos foram considerados iguais
* As acentuações na página de código UTF-8 foram consideradas iguais
* Os espaços em brancos foram ignorados
* As pontuações: .,:!? foram ignoradas

### 3.4. Guia de Teste

* Como poderemos observar nos testes unitáros:
  * 60: tem um erro dever ser "verbo" e não "versos"
  * 69: o caracter de aspas duplas não foi ignorado

```txt
60: 'A Rita, sobre vov¶, versos atira.' - False
69: 'Luza Rocelina, a namorada do Manuel, leu na moda da romana: "anil Ú cor azul".' - False
```


```cmd
C:\User\YourUsername> cd githome\java-palindrome-algorithm
C:\githome\java-palindrome-algorithm> mvn clean test
C:\GitHome\ws-github-02\java-palindrome-algorithm>mvn clean test
[INFO] Scanning for projects...
[INFO]
[INFO] --------------< josemarsilva.com.br:palindrome-algorithm >--------------
[INFO] Building palindrome-algorithm 0.0.1-SNAPSHOT
[INFO] --------------------------------[ jar ]---------------------------------
[INFO]
[INFO] --- maven-clean-plugin:2.5:clean (default-clean) @ palindrome-algorithm ---
[INFO]
[INFO] --- maven-resources-plugin:2.6:resources (default-resources) @ palindrome-algorithm ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\GitHome\ws-github-02\java-palindrome-algorithm\src\main\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:compile (default-compile) @ palindrome-algorithm ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 2 source files to C:\GitHome\ws-github-02\java-palindrome-algorithm\target\classes
[INFO]
[INFO] --- maven-resources-plugin:2.6:testResources (default-testResources) @ palindrome-algorithm ---
[INFO] Using 'UTF-8' encoding to copy filtered resources.
[INFO] skip non existing resourceDirectory C:\GitHome\ws-github-02\java-palindrome-algorithm\src\test\resources
[INFO]
[INFO] --- maven-compiler-plugin:3.1:testCompile (default-testCompile) @ palindrome-algorithm ---
[INFO] Changes detected - recompiling the module!
[INFO] Compiling 1 source file to C:\GitHome\ws-github-02\java-palindrome-algorithm\target\test-classes
[INFO]
[INFO] --- maven-surefire-plugin:2.12.4:test (default-test) @ palindrome-algorithm ---
[INFO] Surefire report directory: C:\GitHome\ws-github-02\java-palindrome-algorithm\target\surefire-reports

-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running josemarsilva.com.br.palindrome_algorithm.AppTest
List of phrases checked with true expected:
List of phrases checked with true expected:
0: 'afã' - True
1: 'aia' - True
2: 'aibofobia' - True
3: 'ala' - True
4: 'ama' - True
5: 'anã' - True
6: 'anilina' - True
7: 'ata' - True
8: 'arara' - True
9: 'asa' - True
10: 'ele' - True
11: 'esse' - True
12: 'mamam' - True
13: 'matam' - True
14: 'metem' - True
15: 'mirim' - True
16: 'oco' - True
17: 'omissíssimo' - True
18: 'osso' - True
19: 'ovo' - True
20: 'radar' - True
21: 'raiar' - True
22: 'ralar' - True
23: 'rapar' - True
24: 'rasar' - True
25: 'reger' - True
26: 'reler' - True
27: 'reter' - True
28: 'rever' - True
29: 'reviver' - True
30: 'rir' - True
31: 'sacas' - True
32: 'saias' - True
33: 'salas' - True
34: 'socos' - True
35: 'sopapos' - True
36: 'sós' - True
37: 'A base do teto desaba.' - True
38: 'A cara rajada da jararaca.' - True
39: 'Acuda cadela da Leda caduca.' - True
40: 'A dama admirou o rim da amada.' - True
41: 'A Daniela ama a lei? Nada!' - True
42: 'Adias a data da saída.' - True
43: 'A diva em Argel alegra-me a vida.' - True
44: 'A droga do dote é todo da gorda.' - True
45: 'A gorda ama a droga.' - True
46: 'A grama é amarga.' - True
47: 'Aí, Lima falou: "Olá, família!".' - False
     * ailimafalou"olafamilia"
     * "ailimafalo"uolafamilia
48: 'Ajudem Edu, já¡!' - True
49: 'A lupa pula.' - True
50: 'A mãe te ama.' - True
51: 'A mala nada na lama.' - True
52: 'Ame o poema.' - True
53: 'A miss é péssima!' - True
54: 'Amo Omã. Se Roma me tem amores, amo Omã!' - True
55: 'Anotaram a data da maratona.' - True
56: 'A pateta ama até tapa.' - True
57: 'Após a sopa.' - True
58: 'Arara rara.' - True
59: 'À Rita, sátira!' - True
60: 'A Rita, sobre vovô, versos atira.' - False
     * aritasobrevovoversosatira
     * aritasosrevovoverbosatira
61: 'A rua Laura.' - True
62: 'Assim a aia ia ã  missa.' - True
63: 'Ato idiota.' - True
64: 'A torre da derrota.' - True
65: 'E até o Papa poeta é.' - True
66: 'Irene ri.' - True
67: 'Laço bacana para panaca boçal.' - True
68: 'Lá vou eu em meu eu oval.' - True
69: 'Luza Rocelina, a namorada do Manuel, leu na moda da romana: "anil é cor azul".' - False
     * luzarocelinaanamoradadomanuelleunamodadaromana"anilecorazul"
     * "luzarocelina"anamoradadomanuelleunamodadaromanaanilecorazul
70: 'Luz azul.' - True
71: 'Mega bobagem.' - True
72: 'Me vê se a panela da moça é de aço, Madalena Paes, e vem.' - True
73: 'Missa é assim.' - True
74: 'O céu sueco.' - True
75: 'O galo ama o lago.' - True
76: 'Olá, galo!' - True
77: 'Olé! Maracujá, caju, caramelo.' - True
78: 'O lobo ama o bolo.' - True
79: 'O romano acata amores a damas amadas e Roma ataca o namoro.' - True
80: 'O teu dueto.' - True
81: 'Ótimo, só eu, que os omito.' - True
82: 'Oto come mocotó.' - True
83: 'O trote torto.' - True
84: 'Rir, o breve verbo rir.' - True
85: 'Roma é amor.' - True
86: 'Roma me tem amor.' - True
87: 'Saíram o tio e oito Marias.' - True
88: 'Seco de raiva, coloco no colo caviar e doces.' - True
89: 'Socorram-me, subi no ônibus em Marrocos.' - True
90: 'Zé de Lima, Rua Laura, mil e dez.' - True


Results :

Failed tests:   testApp(josemarsilva.com.br.palindrome_algorithm.AppTest)

Tests run: 1, Failures: 1, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD FAILURE
[INFO] ------------------------------------------------------------------------
[INFO] Total time:  2.805 s
[INFO] Finished at: 2021-06-23T23:00:24-03:00
[INFO] ------------------------------------------------------------------------
[ERROR] Failed to execute goal org.apache.maven.plugins:maven-surefire-plugin:2.12.4:test (default-test) on project palindrome-algorithm: There are test failures.
[ERROR]
[ERROR] Please refer to C:\GitHome\ws-github-02\java-palindrome-algorithm\target\surefire-reports for the individual test results.
[ERROR] -> [Help 1]
[ERROR]
[ERROR] To see the full stack trace of the errors, re-run Maven with the -e switch.
[ERROR] Re-run Maven using the -X switch to enable full debug logging.
[ERROR]
[ERROR] For more information about the errors and possible solutions, please read the following articles:
[ERROR] [Help 1] http://cwiki.apache.org/confluence/display/MAVEN/MojoFailureException
```

### 3.5. Guia de Estudo

* n/a

## I - Referências

* Github README.md writing sintax
  * [Basic Github Markdown Writing Format](https://docs.github.com/pt/free-pro-team@latest/github/writing-on-github/basic-writing-and-formatting-syntax)  
  * [Github Markdown Chead Sheet](https://guides.github.com/pdfs/markdown-cheatsheet-online.pdf)
  * [Github Mastering Markdown](https://guides.github.com/features/mastering-markdown/#what)
