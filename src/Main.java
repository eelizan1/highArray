/**
 * Created by eeliz_000 on 5/9/2017.
 */
public class Main {
    public static void main(String[] args) {
        HighArray arr = new HighArray(10);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.insert(6);
        arr.insert(7);
        arr.insert(8);
        arr.insert(9);
        arr.insert(10);
        arr.display();

        if(arr.find(8)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

//        arr.delete(1);
//        arr.delete(4);
       System.out.println(arr.binaryFind(7));
        arr.display();
    }
}
