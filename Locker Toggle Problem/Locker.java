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
