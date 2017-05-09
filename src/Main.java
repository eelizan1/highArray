/**
 * Created by eeliz_000 on 5/9/2017.
 */
public class Main {
    public static void main(String[] args) {
        HighArray arr = new HighArray(5);
        arr.insert(1);
        arr.insert(2);
        arr.insert(3);
        arr.insert(4);
        arr.insert(5);
        arr.display();

        if(arr.find(8)) {
            System.out.println("Number found");
        } else {
            System.out.println("Number not found");
        }

        arr.delete(1);
        arr.display();
    }
}
