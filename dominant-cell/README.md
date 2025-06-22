# 🧩 Dominant Cell – HackerRank Challenge

This folder contains the solution to the **Dominant Cell** problem from a HackerRank assessment.

---

## 🧠 Problem Statement

In a 2D grid of integers, a **cell is called dominant** if its value is **strictly greater than all 8 of its neighbors** (including diagonals).

Your task is to **count the number of such dominant cells** in the grid.

---

## 🔍 Example

### Input:
<pre>
1 2 1
4 3 6
3 1 2
</pre>


### Output:
<pre>
2
</pre>

> In this example, the dominant cells are at positions (1,2) with value 6 and (1,0) with value 4.

---

## 💡 Approach

- Iterate over each cell in the grid.
- For each cell, check all 8 surrounding neighbors (top, bottom, left, right, and diagonals).
- If all neighboring values are strictly less than the current cell, it's counted as dominant.
- Return the total count.

---

## 📂 Files

| File Name           | Description                          |
|---------------------|--------------------------------------|
| `dominant_cell.py`  | Python implementation of the solution |
| `README.md`         | Problem description and approach     |

---

## ⚙️ How to Run

Run the script with Python 3:

```bash
python dominant_cell.py
```
---

## 🛠️ Language Used  
**Python 3**

## ✍️ Author  
**Shravani Rane**

