/**
 * Created by eeliz_000 on 5/9/2017.
 */
public class HighArray {
    // ref to array a
    private long[] a;
    // number data items
    private int nElems;

    // constructor
    public HighArray(int max) {
        a = new long[max];      // create array
        nElems = 0;             // no items yet
    }

    // find specific value
    public boolean find(long searchKey) {
        int i;
        for(i = 0; i < nElems; i++)
            // if item found -> exit loop before end
            if (a[i] == searchKey)
                break;
            // if at end -> no item found -> return false
            if (i == nElems)
                return false;
            else
                return true;
    }

    public boolean delete(long value) {
        // search value
        for (int i = 0; i < nElems; i++) {
            // if value found, decrement size
            if (a[i] == value) {
                nElems--;
                // then fill hole
                for (int j = i; j < nElems; j++) {
                    a[j] = a[j + 1];
                }
                // after found value, and filled hole, return true 
                return true;
            }
        }
        // return false if value not found
        return false;
    }

    // insert item
    public void insert(long value) {
        a[nElems] = value;
        nElems++;
    }
    // display
    public void display() {
        for (int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
