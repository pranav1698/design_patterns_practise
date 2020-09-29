public interface SortStrategy {
    public int[] sort(int a[]);
}

class BubbleSorter implements SortStrategy {
    public int[] sort(int a[]) {
        System.out.println("Sorting using bubble sort!!");

        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = n - 1; j > 0; j--) {
                if (a[j] < a[j - 1]) {
                    int temp = a[j];
                    a[j] = a[j - 1];
                    a[j - 1] = temp;
                }
            }
        }

        return a;
    }
}

class QuickSorter implements SortStrategy {
    public int[] sort(int[] a) {
        System.out.println("Sorting using quick sort!");

        // Code for Quick Sort

        return a;
    }
}