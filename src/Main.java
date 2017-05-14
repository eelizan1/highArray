/**
 * Created by eeliz_000 on 5/9/2017.
 */
public class Main {
    public static void main(String[] args) {
        HighArray arr = new HighArray(10);
        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(100);
        arr.insert(66);
        arr.insert(33);

        arr.display();
        System.out.println();
        arr.bubbleSort();
        arr.display();
    }
}
