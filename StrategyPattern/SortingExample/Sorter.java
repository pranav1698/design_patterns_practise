public class Sorter {
    private SortStrategy sorter;

    public void setSorter(SortStrategy newSorter) {
        sorter = newSorter;
    }

    public int[] toSort(int a[]) {
        int res[] = sorter.sort(a);

        return res;
    }
}
