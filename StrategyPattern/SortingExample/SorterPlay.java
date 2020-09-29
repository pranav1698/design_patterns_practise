public class SorterPlay {
    public static void main(String[] args) {
        int a[] = { 1, 5, 4, 3, 2, 8 };

        Sorter bubbleSorter = new Sorter();
        bubbleSorter.setSorter(new BubbleSorter());
        bubbleSorter.toSort(a);

        Sorter quickSorter = new Sorter();
        quickSorter.setSorter(new QuickSorter());
        quickSorter.toSort(a);

        // Changing the sorting technique dynamically during runtime
        bubbleSorter.setSorter(new QuickSorter());
        bubbleSorter.toSort(a);
    }
}
