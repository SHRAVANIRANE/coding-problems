def numCells(grid):
  
    n = len(grid)        # Total number of rows
    m = len(grid[0])     # Total number of columns
    count = 0            # Counter for dominant cells

    # Loop through every cell in the grid
    for i in range(n):
        for j in range(m):
            cell_value = grid[i][j]
            is_dominant = True  # Assume current cell is dominant

            # Check all 8 neighboring directions (up, down, left, right and diagonals)
            for dx in [-1, 0, 1]:
                for dy in [-1, 0, 1]:
                    if dx == 0 and dy == 0:
                        continue  # Skip the current cell itself

                    ni = i + dx  # Neighbor row index
                    nj = j + dy  # Neighbor column index

                    # Check if neighbor is inside grid bounds
                    if 0 <= ni < n and 0 <= nj < m:
                        neighbor_value = grid[ni][nj]

                        # If any neighbor is greater than or equal, current cell is not dominant
                        if neighbor_value >= cell_value:
                            is_dominant = False
                            break  # Exit inner loop early

                if not is_dominant:
                    break  # Exit outer loop early

            # If still dominant after checking all neighbors
            if is_dominant:
                count += 1

    return count
