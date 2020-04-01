/*
link : https://www.hackerrank.com/challenges/minimum-swaps-2/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
*/

    // Complete the minimumSwaps function below.
    static int minimumSwaps(int[] arr) {
        int swap = 0;
        boolean visited[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int j = i, cycle = 0;
            while (!visited[j]) {
                visited[j] = true;
                j = arr[j] - 1;
                cycle++;
            }
            if (cycle != 0)
                swap += cycle - 1;
        }
        return swap;
    }
