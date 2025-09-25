# Problem Statement
---
A school has 100 lockers and 100 students. All lockers are closed on the first day of school. As the students enter, the first student, denoted S1, opens every locker. Then the second student, S2, begins with the second locker, denoted L2, and closes every other locker. Student S3 begins with the third locker and changes every third locker (closes it if it was open, and opens it if it was closed). Student S4 begins with locker L4 and changes every fourth locker. Student S5 starts with L5 and changes every fifth locker, and so on until student S100 changes L100. After all the students have passed through the building and changed the lockers, which lockers are open? Write a program to find your answer.

---
## Problem Breakdown: 
<pre>
School has 100 lockers and 100 students. Initially, all lockers are closed.
The students pass through the lockers in the following way:
Student 1 (S1) opens every locker.
Student 2 (S2) toggles every 2nd locker (closes it if open, opens it if closed).
Student 3 (S3) toggles every 3rd locker.
…
Student 100 (S100) toggles only locker 100.
After all students have passed, which lockers remain open?
</pre>

---

## Explanation / Insight

- A locker is toggled for every student whose number divides the locker number.

- Therefore, the number of toggles for a locker = number of divisors of that locker.

- Lockers with an odd number of divisors remain open.

- Only perfect squares have an odd number of divisors.

- Hence, the lockers that remain open are:
<pre>
1, 4, 9, 16, 25, 36, 49, 64, 81, 100
</pre>

---

## Solution Approaches
### 1. Brute Force (Simulation)

- Use a boolean array to represent lockers (false = closed, true = open).<br>
- Loop over each student and toggle the lockers according to the student’s number.

### 2. Optimized Approach (Math Insight)

- Since only perfect squares remain open, we don’t need to simulate all students.<br>
- Just print all perfect squares ≤ 100.

---

## 📝 Setup

Lockers = [C C C C C C C C C C] (all closed)

### Rule:

Outer loop → which student <br>
Inner loop → toggle every i-th locker

### Dry Run:

<pre>

👩‍🎓 Student 1 (i=1)

Touches every locker (1,2,3,…,10).

Result: [O O O O O O O O O O]

👩‍🎓 Student 2 (i=2)

Touches lockers 2,4,6,8,10.

Result: [O C O C O C O C O C]

👩‍🎓 Student 3 (i=3)

Touches lockers 3,6,9.

L3: O→C, L6: C→O, L9: O→C.

Result: [O C C C O O O C C C]

👩‍🎓 Student 4 (i=4)

Touches lockers 4,8.

L4: C→O, L8: C→O.

Result: [O C C O O O O O C C]

👩‍🎓 Student 5 (i=5)

Touches lockers 5,10.

L5: O→C, L10: C→O.

Result: [O C C O C O O O C O]

👩‍🎓 Student 6 (i=6)

Touches locker 6.

L6: O→C.

Result: [O C C O C C O O C O]

👩‍🎓 Student 7 (i=7)

Touches locker 7.

L7: O→C.

Result: [O C C O C C C O C O]

👩‍🎓 Student 8 (i=8)

Touches locker 8.

L8: O→C.

Result: [O C C O C C C C C O]

👩‍🎓 Student 9 (i=9)

Touches locker 9.

L9: C→O.

Result: [O C C O C C C C O O]

👩‍🎓 Student 10 (i=10)

Touches locker 10.

L10: O→C.

Result: [O C C O C C C C O C]

</pre>

### ✅ Final Result

Lockers open = 1, 4, 9 (perfect squares).
