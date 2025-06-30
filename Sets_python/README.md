# 🔍 Python Set – Strict Superset Checker

This project checks whether a given set `A` is a **strict superset** of multiple other sets using Python's built-in set operations.

---

## 🧠 What are Sets in Python?

A **set** is an unordered collection of unique elements.

### ✅ Key Properties:

- No duplicate elements
- Supports mathematical set operations:
  - Union (`|`)
  - Intersection (`&`)
  - Difference (`-`)
  - Subset/Superset comparisons (`<`, `>`, `<=`, `>=`)

### 🧪 Example:

```python
A = {1, 2, 3}
B = {1, 2}

A > B # True: A is a strict superset of B
A >= B # True: A is a superset (could be equal)
A == B # False
```

### 📘 Problem Statement:

📝 Given:
A main set A
An integer N
Followed by N other sets

### 🎯 Task:

Determine whether set A is a strict superset of each of the N sets
❗Strict Superset Condition:
Set A is a strict superset of set B if:
All elements of B are in A
And A has at least one extra element.

### 🧾 Input Format

Line 1: Space-separated elements of set A
Line 2: Integer N (number of other sets)
Next N lines: Space-separated elements of each other set
🧪 Sample Input
1 2 3 4 5 6 7 8 9 10 11 12 23 45 84 78
2
1 2 3 4 5
100 11 12

### ✅ Explanation:

First other set is a subset → OK ✅
Second other set contains 100 which is not in A → ❌
→ So A is not a strict superset of all → Output: False

### ✅ Expected Output

False

### ✅ Logic Behind A > other_set

In Python, the > operator for sets checks for a strict superset:

A > B means:

All elements in B are in A

And A has at least one element not in B

So we don’t need to manually compare elements. Python handles that internally.

### 📌 Summary

Sets make it easy to perform set theory operations in Python

A > B checks if A is a strict superset of B

This script reads multiple sets and checks if one set strictly contains all others
