//Brute Force , Time Complexity: O(n²) , Space Complexity : O(n)
class Locker {
    public static void main(String[] args) {
        int n = 100;
        boolean[] locker = new boolean[n];

        // simulate each student (0-based)
        for (int i = 0; i < n; i++) {              // student i (0 means student 1)
            for (int j = i; j < n; j += (i + 1)) { // toggle every (i+1)-th locker
                locker[j] = !locker[j];            // toggle directly
            }
        }

        // print open lockers
        System.out.print("Open lockers: ");
        for (int k = 0; k < n; k++) {
            if (locker[k]) {
                System.out.print((k + 1) + " ");
            }
        }
    }
}

//Optimized , Time Complexity: O(√n) , Space Complexity : O(1)
class Locker {
    public static void main(String[] args) {
        int n = 100;
        int sqrtN = (int)Math.sqrt(n);

        System.out.print("Open lockers: ");
        for (int i = 1; i <= sqrtN; i++) {
            System.out.print(i * i + " ");
        }
    }
}

