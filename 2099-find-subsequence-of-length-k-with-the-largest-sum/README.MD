#   Find Subsequence of Length K With the Largest Sum

🔗 [Problema en LeetCode](https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/)

---

## Descripción

Dado un arreglo `nums` y un entero `k`, devuelve una **subsecuencia** de longitud `k` que tenga la **mayor suma posible**, manteniendo el **orden original** de los elementos.

Una **subsecuencia** es una secuencia que puede obtenerse del arreglo original eliminando algunos elementos (o ninguno) sin cambiar el orden del resto.

---

## Enfoque

1. Copiar el arreglo original.
2. Ordenarlo para obtener los `k` elementos más grandes.
3. Buscar esos elementos en el arreglo original en el mismo orden en que aparecen.
4. Devolver esa subsecuencia.

---

## Ejemplos

```java
Input: nums = [2, 1, 3, 3], k = 2
Output: [3, 3]
Example 1:

Input: nums = [2,1,3,3], k = 2
Output: [3,3]
Explanation:
The subsequence has the largest sum of 3 + 3 = 6.
Example 2:

Input: nums = [-1,-2,3,4], k = 3
Output: [-1,3,4]
Explanation: 
The subsequence has the largest sum of -1 + 3 + 4 = 6.
Example 3:

Input: nums = [3,4,3,3], k = 2
Output: [3,4]
Explanation:
The subsequence has the largest sum of 3 + 4 = 7. 
Another possible subsequence is [4, 3].