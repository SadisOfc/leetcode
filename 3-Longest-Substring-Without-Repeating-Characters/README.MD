#   Longest Substring Without Repeating Characters

🔗 [Problema en LeetCode](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)

---

## Descripción

Dada una cadena `s`, encuentra la **longitud de la subcadena más larga** que no contenga caracteres repetidos.

Una **subcadena** es una secuencia continua de caracteres dentro de una cadena. Los caracteres deben estar en el mismo orden y no repetirse.

---

## Enfoque

1. Usar un mapa para guardar el índice de la última aparición de cada carácter.
2. Mantener una ventana (usando un puntero `inicio`) que delimita la subcadena actual sin caracteres repetidos.
3. Si el carácter ya fue visto y su índice está dentro de la ventana, mover el inicio de la ventana justo después de la última aparición de ese carácter.
4. Calcular y actualizar la longitud máxima encontrada.

---

## Ejemplos

```java
Input: s = "abcabcbb"
Output: 3
Explanation:
La subcadena más larga sin caracteres repetidos es "abc", que tiene longitud 3.

Input: s = "bbbbb"
Output: 1
Explanation:
La subcadena más larga sin repetidos es "b".

Input: s = "pwwkew"
Output: 3
Explanation:
La subcadena más larga sin repetidos es "wke".

Input: s = ""
Output: 0
