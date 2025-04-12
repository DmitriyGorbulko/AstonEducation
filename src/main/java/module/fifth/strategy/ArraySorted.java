package module.fifth.strategy;

public class ArraySorted {
    private ISortedContext sortedContext;

    public ArraySorted (ISortedContext sortedContext){
        this.sortedContext = sortedContext;
    }

    public ISortedContext get_sortedContext() {
        return sortedContext;
    }

    public void set_sortedContext(ISortedContext _sortedContext) {
        this.sortedContext = _sortedContext;
    }

    public int[] sort(int[] array){
        return sortedContext.sort(array);
    }
}
