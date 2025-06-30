# Read the main set A
A = set(map(int, input().split()))

# Read the number of other sets
N = int(input())

# Assume A is a strict superset of all other sets
is_strict_superset = True

# Check each other set
for _ in range(N):
    other_set = set(map(int, input().split()))
    if not (A > other_set):  # Strict superset check
        is_strict_superset = False
        break

# Output the result
print(is_strict_superset)
