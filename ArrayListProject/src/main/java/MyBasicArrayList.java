
public class MyBasicArrayList<T> {
    T[] array = (T[]) new Object[10];
    int size = 0;

    // ADVANTAGES AND WHY YOU SHOULD USE AN ARRAY LIST
    // the advantages of an array list derive form their 'contiguous' nature i.e. storing all elements in a sequence in memory
    // [2, 8, 9, 10, 1, 5]

    // because arrays are contiguous 'getting' an element based on its index is very efficient - O(1)
    public T get(int index) {
        return array[index];
    }

    // very efficient O(1) operation to add to end of the list
    public void add(T element) {
        array[size] = element;
        size++;
    }

    // searching can utilise efficient search algorithms such as binary search
    public boolean contains(T element) {
        // implementation of binary search
        return false;
    }

    // contiguous array allows for efficient sorting algorithms such as quicksort
    public void sort() {
        // sort the list from lowest-highest
    }

    // DISADVANTAGES
    // removing from an arraylist can be inefficient because it requires 'moving' all element after the removal.
    // array [1, 2, 3, 4, 5]
    // array [1, null, 3, 4, 5]
    // array [1, 3, 4, 5]
    public void remove(int index) {
        array[index] = null;
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[size - 1] = null;
        size--;
    }

    // there is overhead to manage due to contiguous, non-resizable nature of the array structure
    // ArrayList has some unique methods to manage this
    // array has to be resized if array limit is reached
    private void increaseArraySize() {
        T[] biggerArray = (T[]) new Object[15];
        for (int i = 0; i < array.length; i++) {
            biggerArray[i] = this.array[i];
        }
        this.array = biggerArray;
    }

    // array can be trimmed to size for a lower memory footprint
    public void trimToSize() {
        T[] trimmedArray = (T[]) new Object[this.size];
        for (int i = 0; i < this.size; i++) {
            trimmedArray[i] = this.array[i];
        }
        this.array = trimmedArray;
    }

    // GENERAL RULE OF THUMB
    // ArrayList are very good for querying, sorting, and searching,
    // ArrayLists are not a good choice for dynamic, on-the-fly resizing/insertion/removal due to not being resizable without a hefty operation
}
