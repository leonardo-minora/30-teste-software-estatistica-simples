
# TEC-0030 - Teste de Software

## Plano de Testes para o dojo

http://dojopuzzles.com/problemas/exibe/calculando-estatisticas-simples/

## Plano de teste

| Entrada | Teste       | Classes válidas      | Classes inválidas    |
|---------|-------------|----------------------|----------------------|
| vetor   | tipo(vetor) | tipo(vetor) == Int[] | tipo(vetor) != Int[] |
|         | len(vetor)  | len(vetor) > 0       | len(vetor) <= 0      |

### 1º Caso de Teste (o vetor é um vetor de inteiros)

```java
estatisticas(new Integer[]{1}) // não é lançada exceção
```

### 2º Caso de Teste (o vetor não é um vetor de inteiros)

```java
estatisticas(new String[]) // uma exceção do tipo IllegalArgumentException é lançada
```

### 3º Caso de Teste (o tamanho do vetor é maior que zero)

```java
estatisticas(new Integer[]{1, 2}) // o retorno é { maior: 2, menor: 1, media: 1.5, tamanho: 2 }
```

### 4º Caso de Teste (o tamanho do vetor é menor ou igual a zero)

```java
estatisticas(new Integer[]) // uma exceção do tipo IllegalArgumentException é lançada
```
