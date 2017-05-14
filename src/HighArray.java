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

    public int binaryFind(long searchKey) {
        /*
            CREATE RANGE
         */
        int lowerBound = 0;             // set to first cell of array
        int upperBound = nElems - 1;    // set to last cell of array
        int curIn;

        // each time through the loop, divide the range in half
        while(true) {
            // set to middle of range
            curIn = (lowerBound + upperBound) / 2;
            // check if curIn is already the desired key
            if(a[curIn] == searchKey)
                return curIn;
            else if(lowerBound > upperBound)
                return nElems;
            else {
                // if current item is less than key
                if(a[curIn] < searchKey)
                    // its in upper half
                    lowerBound = curIn + 1;
                else
                    // else its in the lower half
                    upperBound = curIn - 1;
            }
        }
    }

    public boolean delete(long value) {
        // search value
        for (int i = 0; i < nElems; i++) {
            // if value found, decrement size
            if (a[i] == value) {
                nElems--;
                // then fill hole
                for (int j = i; j < nElems; j++) {
                    // move higher elements down by setting the next value the current index
                    // value deleted is of index 2, so value of index 3 is now index 2
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
    /*
     SORTING ALGORITHMS
     */
    // bubble sort
    public void bubbleSort() {
        int out, in;
        // outer loop (backwards)
        for(out = nElems-1; out > 1; out--)
            // inner loop (forward)
            for(in = 0; in < out; in++)
                // if out of order?
                if(a[in] > a[in + 1])
                    // swap them
                    swap(in, in + 1);
    }
    // note: may want to create swap inline the bubble sort
    // as creating a new method creates slight overhead
    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }
}
